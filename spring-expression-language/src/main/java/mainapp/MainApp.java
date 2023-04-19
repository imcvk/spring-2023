package mainapp;

import bean.Arithmetic;
import bean.OtherSPEL;
import bean.Relational;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spel-config.xml");
        Arithmetic arithmetic=context.getBean(Arithmetic.class);
        System.out.println(arithmetic);
        Relational relational=context.getBean(Relational.class);
        System.out.println(relational);
        OtherSPEL otherSPEL = context.getBean(OtherSPEL.class);
        System.out.println(otherSPEL.getSqrt());
        System.out.println(otherSPEL.getPi());



    }
}
