
import example.magazinDb;
import example.models.Product;
import example.models.ShowProductServices;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class ShowCategoriesServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<Product> categories = magazinDb.getAllProductsAllAttributes();
        req.setAttribute("categories", ShowProductServices.categoryArrayToString(categories));
        req.getRequestDispatcher("/Magazin.jsp").forward(req, resp);


    }
}