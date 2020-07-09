package guoyachen.orm_jdbc.mysql;

import java.sql.SQLException;

/**
 * @Author:Guo Yachen
 * @Date:2020/7/9 1:24
 * @Description:
 * @Feature:
 */
//TODO:对Interface的封装修饰
interface JDBC_Interface {

    void Init_Connection() throws ClassNotFoundException, SQLException;

    public void Get_Modify_Information() throws SQLException;

    public void Close_SQL() throws SQLException;

}
