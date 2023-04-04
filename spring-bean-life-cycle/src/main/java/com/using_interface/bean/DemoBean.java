package com.using_interface.bean;

import lombok.*;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DemoBean implements InitializingBean, DisposableBean {
    String demoBeanName;
    String demoBeanId;


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroyed");
    }
}
