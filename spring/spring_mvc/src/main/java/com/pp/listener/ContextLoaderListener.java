package com.pp.listener;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextLoaderListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        String initParameter = servletContext.getInitParameter("contextConfig");
        ApplicationContext app = new ClassPathXmlApplicationContext(initParameter);
        servletContext.setAttribute("app",app);
        System.out.println("spring finish.......");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
