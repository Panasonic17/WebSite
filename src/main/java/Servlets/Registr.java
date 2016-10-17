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
@WebServlet(name = "Registr",urlPatterns = "/registr")
public class Registr extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpSession session = req.getSession();
        String login = req.getParameter("login");
        String passvord =  req.getParameter("passvord");
        if(UserDAO.getUserByLogin(login)==null){
        User u=new User(login,passvord);
            UserDAO.addUser(u);
        }
        //UserDAO.addUser(u);
       // session.setAttribute("user",u);
        RequestDispatcher rd=request.getRequestDispatcher("Shablon.jsp");
        rd.include(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
