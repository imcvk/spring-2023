package com.xml.byConstructor.main;

import com.xml.byConstructor.beans.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("byConstructor.xml");
        User user=context.getBean(User.class);
        System.out.println(user);
    }
}
