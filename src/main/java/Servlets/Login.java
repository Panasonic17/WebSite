package Servlets;

import DAO.UserDAO;
import Ennty.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Саша on 29.09.2016.
 */
@WebServlet(name = "Login",urlPatterns = "/login")
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // session.setAttribute("user",u);
        HttpServletRequest req = (HttpServletRequest) request;
        HttpSession session = req.getSession();
        String login = req.getParameter("login");
        String passvord =  req.getParameter("passvord");
        User user= UserDAO.getUserByLogin(login);
        if(user.getPassword().equals(passvord)){
            session.setAttribute("user",user);
        }
        RequestDispatcher rd=request.getRequestDispatcher("Shablon.jsp");
        rd.include(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
