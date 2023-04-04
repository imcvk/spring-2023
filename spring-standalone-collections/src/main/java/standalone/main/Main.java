package standalone.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import standalone.beans.User;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("standalone-collection-config.xml");
        User user=context.getBean(User.class);
        System.out.println(user);

    }
}
