package guoyachen.mvc.dao.proxy;

import guoyachen.mvc.dao.UserDAO;
import guoyachen.mvc.dao.implement.UserDAOImpl;
import guoyachen.mvc.dbc.DatabaseConnection;
import guoyachen.mvc.vo.User;

/**
 * @Author:Guo Yachen
 * @Date:2020/7/11 13:13
 * @Description:
 * @Feature:
 */
public class UserDAOProxy implements UserDAO {

    private DatabaseConnection dbc = null;
    private UserDAO dao = null;

    public UserDAOProxy()
    {
        try {
            this.dbc = new DatabaseConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }

        this.dao = new UserDAOImpl(this.dbc.getConnection());
    }

    public boolean findLogin(User user) throws Exception {
        boolean flag = false;

        flag = this.dao.findLogin(user);

        this.dbc.close();

        return flag;
    }
}
