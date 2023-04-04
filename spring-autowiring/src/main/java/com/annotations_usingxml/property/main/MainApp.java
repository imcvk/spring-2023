package com.annotations_usingxml.property.main;

import com.annotations_usingxml.property.beans.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("annotation-config-property.xml");
        User user=context.getBean(User.class);
        System.out.println("property");
        System.out.println(user);
    }
}
