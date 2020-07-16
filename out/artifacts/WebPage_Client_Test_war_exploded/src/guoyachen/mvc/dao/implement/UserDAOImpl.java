package guoyachen.mvc.dao.implement;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import guoyachen.mvc.dao.UserDAO;
import guoyachen.mvc.vo.User;

/**
 * @Author:Guo Yachen
 * @Date:2020/7/11 12:37
 * @Description:
 * @Feature:
 */
public class UserDAOImpl implements UserDAO {

    private Connection conn = null;
    private PreparedStatement pstmt = null;


    public UserDAOImpl(Connection conn) {
        this.conn = conn;
    }


    public boolean findLogin(User user) throws Exception {

        boolean flag = false;

        String password = user.getPassword();



        MessageDigest md5 = MessageDigest.getInstance("MD5");

        md5.update(password.getBytes());

        String password_md5 = new BigInteger(1,md5.digest()).toString(16);


        String sql = "SELECT user FROM test_table WHERE user='"+user.getUsername()+"' AND password='"+password_md5+"';";
        System.out.print(sql);
        this.pstmt = this.conn.prepareStatement(sql);


        ResultSet rs = this.pstmt.executeQuery();

        if (rs.next()) {

            flag = true;
        }

        if (this.pstmt != null) {
            this.pstmt.close();
        }


        System.out.print(flag);
        return flag;
    }


}