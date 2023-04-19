package stereotype_annotations.main;

import stereotype_annotations.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("stereotype-config.xml");
        User user=context.getBean(User.class);
        System.out.println(user);
    }
}
