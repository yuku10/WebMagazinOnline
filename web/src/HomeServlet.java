
import example.UI;
import example.magazinDb;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class HomeServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String loginStatus = UI.login(username, password );
        HttpSession session = req.getSession();
        session.setAttribute("userId", magazinDb.selectUser(username).getId());

        if(loginStatus.equals("Te-ai autentificat cu succes"))
            resp.sendRedirect("http://localhost:8090/MagGood/magazin.jsp");
        else{
            req.setAttribute("loginStatus", loginStatus);
            req.getRequestDispatcher("/index.jsp").forward(req, resp);
        }
    }
}