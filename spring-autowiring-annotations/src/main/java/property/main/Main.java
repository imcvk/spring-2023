package property.main;

import property.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowire-config.xml");
        Student student = context.getBean(Student.class);
        System.out.println(student);
    }
}
