package com.pp.controller;

import com.pp.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountController {
    public static void main(String[] args) {
        ApplicationContext app = new AnnotationConfigApplicationContext(com.pp.config.ApplicationContext.class);
        AccountService accountService = app.getBean(AccountService.class);
        accountService.transfer("tom", "jerry", 500);
    }
}
