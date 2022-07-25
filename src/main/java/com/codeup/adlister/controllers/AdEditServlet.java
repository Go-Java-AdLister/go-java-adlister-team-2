package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.Ad;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ads/edit")
public class AdEditServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/edit.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // attributes are grabbed from the form and passed as an update query to the ads table
        // for the specific ad being edited
        String title = req.getParameter("title");
        String description = req.getParameter("description");
        String category = req.getParameter("category");
        Ad ad = (Ad) req.getSession().getAttribute("ad");
        DaoFactory.getAdsDao().editAd(title, description,category, ad);
        // after ad is edited, user is redirected back to the ads page
        resp.sendRedirect("/ads");
    }
}
