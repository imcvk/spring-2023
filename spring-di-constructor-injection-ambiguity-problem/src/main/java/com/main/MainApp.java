package com.main;

import com.beans.Addition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Addition addition=(Addition) context.getBean("addition");
        addition.sum();
    }

}
