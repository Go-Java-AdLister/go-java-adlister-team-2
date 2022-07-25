package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static java.lang.System.in;
import static java.lang.System.out;

@WebServlet("/ads/details")
public class AdDetailsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        long id = Long.parseLong(req.getParameter("id"));
        Ad ad = DaoFactory.getAdsDao().findById(id);
        User user = (User) req.getSession().getAttribute("user");
        req.getSession().setAttribute("ad", ad);
        boolean isUser = ad.getUserId() == user.getId();

        req.getSession().setAttribute("isUser", isUser);
        req.getRequestDispatcher("/WEB-INF/details.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Ad ad = (Ad) req.getSession().getAttribute("ad");
        User user = (User) req.getSession().getAttribute("user");
        boolean incorrectUser;
        if (user == null) {
            resp.sendRedirect("/login");
        } else if (ad.getUserId() == user.getId()) {
            DaoFactory.getAdsDao().delete(ad);
            resp.sendRedirect("/ads");
        } else {
            resp.setContentType("text/html");
            PrintWriter out = resp.getWriter();
            resp.sendRedirect("/ads");
            out.println("<script>alert('Unable to delete ads from other users.')</script>");
        }
    }
}
