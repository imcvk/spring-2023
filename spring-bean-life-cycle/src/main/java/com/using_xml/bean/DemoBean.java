package com.using_xml.bean;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DemoBean {
    String demoBeanName;
    String demoBeanId;

    public  void  init(){
        System.out.println("init...");
    }
    public  void destroy(){
        System.out.println("destroyed...");
    }
}
