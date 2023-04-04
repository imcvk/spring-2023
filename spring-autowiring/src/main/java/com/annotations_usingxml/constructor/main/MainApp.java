package com.annotations_usingxml.constructor.main;

import com.annotations_usingxml.constructor.beans.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("annotation-config-constructor.xml");
        User user=context.getBean(User.class);
        System.out.println("Constructor");
        System.out.println(user);
    }
}
