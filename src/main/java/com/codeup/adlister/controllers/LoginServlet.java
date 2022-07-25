package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;
import com.codeup.adlister.util.Password;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // if a user is already logged, it automatically redirects to the profile page
        // otherwise the user will see the login view
        if (request.getSession().getAttribute("user") != null) {
            response.sendRedirect("/profile");
            return;
        }
        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        // if the username doesn't exist in the users table the page is redirected to login
        User user = DaoFactory.getUsersDao().findByUsername(username);
        if (user == null) {
            response.sendRedirect("/login");
            return;
        }
        // username and password are correct then profile redirect and user attribute set
        boolean validAttempt = Password.check(password, user.getPassword());
        if (validAttempt) {
            request.getSession().setAttribute("user", user);
            request.getSession().setAttribute("isLoggedIn", true);
            response.sendRedirect("/profile");
        } else {
            response.sendRedirect("/login");
        }
    }
}
