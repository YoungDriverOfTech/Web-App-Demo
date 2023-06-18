package com.app.web.listener;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MyHttpSessionListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        ServletContext servletContext = se.getSession().getServletContext();
        Object onlineCount = servletContext.getAttribute("onlineCount");
        servletContext.setAttribute("onlineCount", (int) onlineCount + 1);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        ServletContext servletContext = se.getSession().getServletContext();
        Object onlineCount = servletContext.getAttribute("onlineCount");
        servletContext.setAttribute("onlineCount", (int) onlineCount - 1);
    }
}
