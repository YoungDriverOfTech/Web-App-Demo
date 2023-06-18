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

        // 获取session
        HttpSession session1 = req.getSession(); // 获取当前 Session，Session 不存在则创建。
        HttpSession session2 = req.getSession(true); // 获取当前 Session，若不存在，根据参数决定

        // 设置属性
        session1.setAttribute("wahaha", "wahah");

        // 获取属性
        session1.getAttribute("wahaha");
    }
}
