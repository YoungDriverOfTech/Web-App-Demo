package com.app.web.cookie;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

public class CreateCookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 从request里面取出cookie，可以用来做密码验证
        Cookie[] cookies = req.getCookies();
        System.out.println("cookies = " + Arrays.toString(cookies));

        // 在服务端做成cookie，然后指示浏览器保存cookie
        Cookie cookie1 = new Cookie("username", "mary");
        Cookie cookie2 = new Cookie("age", "22");
        resp.addCookie(cookie1);
        resp.addCookie(cookie2);
    }
}
