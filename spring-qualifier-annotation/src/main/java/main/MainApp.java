package main;


import beans.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("annotation-config.xml");
        User user=context.getBean(User.class);
        System.out.println("setter");
        System.out.println(user);
    }
}
