package com.pp.web;


import com.pp.config.SpringConfiguration;
import com.pp.service.UserService;
import com.pp.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Controller("userController")
public class UserController {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        UserService userService = app.getBean("userService", UserServiceImpl.class);
        userService.save();
        DataSource dataSource = app.getBean("dataSource", DataSource.class);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
        app.close();
    }
}
