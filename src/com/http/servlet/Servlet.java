package com.http.servlet;

import javax.servlet.http.Cookie;
import java.io.IOException;

/**
 * Created by windows10 on 2017/8/12.
 */
@javax.servlet.annotation.WebServlet(name = "Servlet")
public class Servlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        Cookie cookie = new Cookie("name","jj");
        response.addCookie(cookie);
    }
}
