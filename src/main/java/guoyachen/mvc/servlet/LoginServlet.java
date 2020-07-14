package guoyachen.mvc.servlet;


import guoyachen.mvc.factory.DAOFactory;
import guoyachen.mvc.vo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
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

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

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
            //这三个一定要在输出流之前
            req.setCharacterEncoding("utf-8");
            resp.setContentType("text/html;charset=utf-8");
            resp.setCharacterEncoding("utf-8");

            PrintWriter out = resp.getWriter();

            ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");

            DAOFactory Factory =(DAOFactory) context.getBean("Factory");


            //获取验证码
            String verifyCode = req.getParameter("verifyCode");
            String randStr=(String)req.getSession().getAttribute("randStr");
            if(!verifyCode.equals(randStr) || verifyCode==null){
                out.print("<script>alert('验证码错误，请重新登录');window.location.href='index.jsp'</script>");
            }





            if(DAOFactory.getUserDAOInstance().findLogin(user))
            {
                HttpSession session = req.getSession();
                session.setAttribute("userid",username);

                out.print("<script>alert('登录成功');</script>");
                out.print("<script>window.location.href='admin.jsp'</script>");
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
