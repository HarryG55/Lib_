package guoyachen.mvc.servlet;


import guoyachen.mvc.factory.DAOFactory;
import guoyachen.mvc.vo.User;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author:Guo Yachen
 * @Date:2020/7/11 15:20
 * @Description:
 * @Feature:
 */

public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse resp)
    {
        String path = "index.jsp";
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        List<String> info = new ArrayList<String>();

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        try {

            PrintWriter out = resp.getWriter();

            if(DAOFactory.getUserDAOInstance().findLogin(user))
            {
                out.print("<script>alert('登录成功');window.location.href='index.jsp'</script>");
            }
            else
            {
                out.print("<script>alert('登录失败，请重新登录');window.location.href='index.jsp'</script>");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
