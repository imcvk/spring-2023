package com.using_xml.main;

import com.using_xml.bean.DemoBean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("config_for_xml.xml");
        context.registerShutdownHook();
        DemoBean demoBean = (DemoBean) context.getBean("bean");
        System.out.println(demoBean);
    }

}
