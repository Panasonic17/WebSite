package Servlets;

import DAO.ProductDAO;
import DAO.UserDAO;
import Ennty.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "addProd",urlPatterns = "/addProduct")
public class AddProduct extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int prodId= Integer.parseInt(req.getParameter("id"));
        User user= (User) req.getSession().getAttribute("user");
        System.out.println(user);
        if(user!=null) {
            UserDAO.addProductToUser(user.login, ProductDAO.getProduct(prodId));
        }
    }
}
