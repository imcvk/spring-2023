package singleton.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import singleton.bean.User;


public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("singleton-config.xml");
        User user=context.getBean(User.class);
        System.out.println(user);
        System.out.println(user.hashCode());
        System.out.println(context.getBean(User.class).hashCode());
    }
}
