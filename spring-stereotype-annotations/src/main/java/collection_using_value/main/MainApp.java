package collection_using_value.main;

import collection_using_value.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("collection-stereotype-config.xml");
        User user = context.getBean(User.class);
        System.out.println("Phone Numbers: ---------------------" );
        user.getPhoneNumbers().forEach(System.out::println);
        System.out.println("Addresses: -------------------------");
        user.getAddresses().forEach(System.out::println);
        System.out.println("Projects: --------------------------");
        user.getProjects().forEach((s, s2) -> System.out.println(s2));
    }
}
