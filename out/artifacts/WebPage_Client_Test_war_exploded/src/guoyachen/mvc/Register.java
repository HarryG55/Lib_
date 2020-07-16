package guoyachen.mvc;

import com.opensymphony.xwork2.ActionSupport;
import guoyachen.mvc.dbc.DatabaseConnection;

import java.io.PrintWriter;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.security.MessageDigest;


/**
 * @Author:Guo Yachen
 * @Date:2020/7/14 2:14
 * @Description:
 * @Feature:
 */
public class Register extends ActionSupport {


    private String username;
    private String password;
    DatabaseConnection conn;
    PreparedStatement prep;


    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public String execute() throws Exception
    {

        try {

            conn =  new DatabaseConnection();

            Connection con = conn.getConnection();
            System.out.println("user="+username);
            System.out.println("password="+password);


            MessageDigest md5 = MessageDigest.getInstance("MD5");

            md5.update(password.getBytes());

            String password_md5 = new BigInteger(1,md5.digest()).toString(16);




            String sql = "INSERT INTO test_table (user,password) VALUES('"+username+"','"+password_md5+"');";
            System.out.print(sql);
            prep = con.prepareStatement(sql);
            int result = prep.executeUpdate();

            if(result >0)
            {

                return "success";
            }
            else
            {
                return "error";
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return"error";
    }
}


