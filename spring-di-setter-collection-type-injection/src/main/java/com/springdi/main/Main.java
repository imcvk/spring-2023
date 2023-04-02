package com.springdi.main;

import com.springdi.beans.CollectionInjectionClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        CollectionInjectionClass collectionInjectionClass = (CollectionInjectionClass) context.getBean("collectionInjectionClass");
        //fetching list from injected bean
        System.out.println("fetching list from injected bean");
        List<String> listOfStrings = collectionInjectionClass.getListOfString();
        listOfStrings.forEach(System.out::println);
        //fetching map from injected bean
        System.out.println("fetching map from injected bean");
        Map<String, String> mapOfValues = collectionInjectionClass.getMapOfString();
        for (Map.Entry<String, String> entry : mapOfValues.entrySet()) {
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }
        //fetching set from the injected bean
        System.out.println("fetching set from the injected bean");
        Set<String> setOfStringValues = collectionInjectionClass.getSetOfStrings();
        for (String s : setOfStringValues) {
            System.out.println(s);
        }
        System.out.println("Fetching Properties from bean");

        Properties p = collectionInjectionClass.getProperties();
        for (String s : p.stringPropertyNames()) {
            System.out.println(p.getProperty(s));
        }
    }
}
