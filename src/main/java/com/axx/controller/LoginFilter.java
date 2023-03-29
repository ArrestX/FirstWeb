package com.axx.controller;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(filterName = "LoginFilter")
public class LoginFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest req = (HttpServletRequest) request;
        if (req.getSession().getAttribute("uname").equals("")||req.getSession().getAttribute("uname")==null){
            req.getRequestDispatcher("/login.html").forward(req,response);
        }else {
            chain.doFilter(request, response);
        }
    }
}
