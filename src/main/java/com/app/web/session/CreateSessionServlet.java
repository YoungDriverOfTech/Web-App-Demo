package com.app.web.session;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class CreateSessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(true);
        System.out.println("session = " + session);

        Object obj = session.getAttribute("count");
        if (obj == null) {
            session.setAttribute("count", 1);
        } else {
            int count = (int) obj;
            count += 1;
            session.setAttribute("count", count);
        }
    }
}
