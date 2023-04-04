package com.xml.byname.main;

import com.xml.byname.beans.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("byname.xml");
        User user=context.getBean(User.class);
        System.out.println(user);
    }
}
