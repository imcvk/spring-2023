package com.xml.bytype.main;

import com.xml.bytype.beans.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bytype.xml");
        User user=context.getBean(User.class);
        System.out.println(user);
    }
}
