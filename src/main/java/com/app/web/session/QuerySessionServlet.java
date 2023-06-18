package com.app.web.session;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class QuerySessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        System.out.println("session = " + session);

        if (session == null) {
            System.out.println("session 还不存在，请求次数是0");
        } else {
            Object obj = session.getAttribute("count");
            System.out.println(obj == null ? "0" : obj);
        }
    }
}
