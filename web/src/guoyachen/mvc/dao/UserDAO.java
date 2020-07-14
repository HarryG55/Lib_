package guoyachen.mvc.dao;
import guoyachen.mvc.vo.User;
/**
 * @Author:Guo Yachen
 * @Date:2020/7/11 12:36
 * @Description:
 * @Feature:
 */
public interface UserDAO {

    public boolean findLogin(User user) throws Exception;
}
