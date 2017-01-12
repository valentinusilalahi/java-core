package com.silalahi.valentinus.core.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet(name = "IniServlet", urlPatterns = {"/ini"})
public class IniServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Date iniHari = new Date();

        resp.setContentType("text/html");
        resp.getWriter().println("<b>"+iniHari.toString()+"</b>");
        resp.getWriter().flush();
    }
}
