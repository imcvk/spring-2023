package com.using_annotations.main;

import com.using_annotations.bean.DemoBean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("config_for_using_interface.xml");
        context.registerShutdownHook();
        DemoBean demoBean = (DemoBean) context.getBean("bean");
        System.out.println(demoBean);
    }

}
