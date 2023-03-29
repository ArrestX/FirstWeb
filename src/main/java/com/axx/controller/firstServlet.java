package com.axx.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class firstServlet extends HttpServlet {
    @Override
    //接受get请求
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        System.out.println("哈哈");
        String id = req.getParameter("id");
        System.out.println(id);
        req.getRequestDispatcher("/index.jsp").forward(req,resp);
        return;
    }

    @Override
    //接收post请求
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
