package guoyachen.mvc.factory;

import guoyachen.mvc.dao.UserDAO;
import guoyachen.mvc.dao.proxy.UserDAOProxy;

/**
 * @Author:Guo Yachen
 * @Date:2020/7/11 13:16
 * @Description:
 * @Feature:
 */
public class DAOFactory {
    public static UserDAO getUserDAOInstance(){
        return new UserDAOProxy();
    }
}
