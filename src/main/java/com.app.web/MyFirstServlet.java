package com.app.web;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFirstServlet implements Servlet {

    public MyFirstServlet() {
        System.out.println("servlet is created");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        PrintWriter writer = servletResponse.getWriter();
        writer.print("<html>");
        writer.print("<body>");
        writer.print("<h2>");
        writer.print("my first service by using jar file");
        writer.print("</h2>");
        writer.print("</body>");
        writer.print("</html>");

        System.out.println(this);
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
