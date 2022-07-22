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

@WebServlet("/ads/details")
public class AdDetailsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        long id = Long.parseLong(req.getParameter("id"));
        Ad ad = DaoFactory.getAdsDao().findById(id);
        User user = DaoFactory.getUsersDao().findById(ad.getUserId());
        req.getSession().setAttribute("ad", ad);
        req.getSession().setAttribute("user", user);
        req.getRequestDispatcher("/WEB-INF/details.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Ad ad = (Ad) req.getSession().getAttribute("ad");
        DaoFactory.getAdsDao().delete(ad);
        resp.sendRedirect("/ads");
    }
}
