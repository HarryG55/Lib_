package guoyachen.mvc.dbc;

import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @Author:Guo Yachen
 * @Date:2020/7/11 12:28
 * @Description:数据库连接
 * @Feature:
 */
public class DatabaseConnection {

    private static final String DBDRIVER="com.mysql.cj.jdbc.Driver";
    private static final String DBURL="jdbc:mysql://localhost:3306/DatabaseForTest?serverTimezone=UTC";
    private static final String DBUSER="root";
    private static final String DBPASSWORD="root";

    private Connection conn = null;

    public DatabaseConnection() throws Exception{
        Class.forName(DBDRIVER);
        this.conn = DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD);

    }

    public Connection getConnection(){
        return this.conn;
    }

    public void close() throws Exception{
        if(this.conn != null){
            this.conn.close();
        }
    }
}
