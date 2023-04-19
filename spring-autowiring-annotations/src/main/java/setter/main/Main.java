package setter.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import setter.beans.Student;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowire-config-setter.xml");
        Student student = context.getBean(Student.class);
        System.out.println(student);
    }
}
