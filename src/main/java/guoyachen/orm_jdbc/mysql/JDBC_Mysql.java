package guoyachen.orm_jdbc.mysql;
import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * @Author:Guo Yachen
 * @Date:2020/7/9 1:23
 * @Description:
 * @Feature:
 */


 class JDBC_Mysql implements JDBC_Interface {

    String sql_type="com.mysql.cj.jdbc.Driver";
    String url="jdbc:mysql://localhost:3306/DatabaseForTest?serverTimezone=UTC";
    String user="root";
    String password="root";
    String sql_command;

    Connection conn = null;
    Statement statement = null;



   public void setSql_command(String sql_command) {
      this.sql_command = sql_command;
   }


    public void Init_Connection() throws ClassNotFoundException, SQLException {

      Class.forName(sql_type);
      conn = DriverManager.getConnection(url,user,password);
      statement = conn.createStatement();

    }


   public void Get_Modify_Information() throws SQLException {
      int count=statement.executeUpdate(sql_command);

      if(count>0)
      {
         System.out.print("success!");
      }
      else
      {
         System.out.print("failed!");
      }


    }

   public void Close_SQL() throws SQLException {

      if(statement !=null)
      {
         statement.close();
      }

      if(conn != null)
      {
         conn.close();
      }
   }


}
