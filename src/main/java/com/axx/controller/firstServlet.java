package com.axx.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class firstServlet extends HttpServlet {
    @Override
    //接受get请求
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        System.out.println("哈哈");
        String id = req.getParameter("id");
        System.out.println(id);
        req.setAttribute("name","张三");
        //转发
        req.getRequestDispatcher("/index.jsp").forward(req,resp);
        //服务器端的会话对象   保存会话信息
        HttpSession session = req.getSession();
        session.setAttribute("uname","admin");
        session.setAttribute("upass","admin");
        //重定向   站外重定向
        resp.sendRedirect("http:www.baidu.com");
        return;
    }

    @Override
    //接收post请求
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
