import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import example.UI;
import example.magazinDb;
import example.models.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public  class CreateAccountServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String Nume = req.getParameter("Nume");
        String Prenume = req.getParameter("Prenume");
        String email = req.getParameter("email");
        String parola = req.getParameter("parola");
        String username = req.getParameter("username");

        User user = new User(Nume,Prenume,email,parola,username);
        String registerStatus = UI.createAccount(user);
        if(registerStatus.equals("Bravo, ti-ai creat un cont cu succes")) {
            //resp.sendRedirect("http://localhost:8090/MagGood/magazin.jsp");
            resp.sendRedirect("http://localhost:8080/Magazin.jsp");
            HttpSession session = req.getSession();
            session.setAttribute("iduser", magazinDb.selectUser(username).getId());
        }
        else {
            req.setAttribute("registerStatus", registerStatus);
            req.getRequestDispatcher("/CreateAccount.jsp").forward(req, resp);
        }


    }
}