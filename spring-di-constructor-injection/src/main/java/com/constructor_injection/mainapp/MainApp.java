package com.constructor_injection.mainapp;

import com.constructor_injection.beans.User;
import com.constructor_injection.beans.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        User user = (User) context.getBean("user");
        Vehicle vehicle = (Vehicle) context.getBean("vehicle");
        System.out.println(user);
        System.out.println(vehicle);
        System.out.println(user.getCity());
    }
}
