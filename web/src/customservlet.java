import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class customservlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int primu = Integer.parseInt(req.getParameter("primul"));
        int doilea = Integer.parseInt(req.getParameter("aldoilea"));

        int suma = primu + doilea;

        PrintWriter out = resp.getWriter();
        out.println(suma);
    }


}
