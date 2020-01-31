package com.lz.test;

import com.lz.service.AccountService;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpring {
    @Test
    public void run1(){
        ApplicationContext ac = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService as = (AccountService)ac.getBean("accountService", AccountService.class);
        as.findAll();
    }
}
