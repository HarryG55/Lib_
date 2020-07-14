package guoyachen.mvc.dao.implement;

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


        String sql = "SELECT user FROM test_table WHERE user='"+user.getUsername()+"' AND password='"+user.getPassword()+"';";
        System.out.print(sql);
        this.pstmt = this.conn.prepareStatement(sql);
//        this.pstmt.setString(1, user.getUsername());
//        this.pstmt.setString(2, user.getPassword());

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