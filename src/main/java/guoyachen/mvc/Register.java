package guoyachen.mvc;

import com.opensymphony.xwork2.ActionSupport;
import guoyachen.mvc.dbc.DatabaseConnection;
import guoyachen.mvc.vo.User;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * @Author:Guo Yachen
 * @Date:2020/7/14 2:14
 * @Description:
 * @Feature:
 */
public class Register extends ActionSupport {


    private String username;
    private String password;
    Connection conn;
    PreparedStatement prep;


    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public String execute() throws Exception
    {

        return "success";
//        try {
//            conn = (Connection) new DatabaseConnection();
//            String sql = "INSERT INTO test_table (user,password) VALUES('"+user.getUsername()+"','"+user.getPassword()+"');";
//            System.out.print(sql);
//            prep = conn.prepareStatement(sql);
//            int result = prep.executeUpdate();
//
//            if(result >0)
//            {
//                return "success";
//            }
//            else
//            {
//                return "error";
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return"error";
    }
}
