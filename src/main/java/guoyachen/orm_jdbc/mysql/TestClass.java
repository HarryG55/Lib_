package guoyachen.orm_jdbc.mysql;
import guoyachen.orm_jdbc.mysql.JDBC_Mysql;

import java.sql.SQLException;

/**
 * @Author:Guo Yachen
 * @Date:2020/7/9 16:29
 * @Description:Used to Test the JDBC_Mysql.java
 * @Feature:
 */
public class TestClass {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        JDBC_Mysql Jdbc = new JDBC_Mysql();

        Jdbc.setSql_command("insert into test_table(user,password)" +
                "VALUES('kali','111');");
        Jdbc.Init_Connection();
        Jdbc.Get_Modify_Information();
        Jdbc.Close_SQL();


    }
}
