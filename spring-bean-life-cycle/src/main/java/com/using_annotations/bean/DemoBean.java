package com.using_annotations.bean;

import lombok.*;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DemoBean {
    String demoBeanName;
    String demoBeanId;

    @PostConstruct
    public void init() {
        System.out.println("init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy");
    }
}
