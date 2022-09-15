package com.example.main;

import com.example.beans.Person;
import com.example.config.ProjectConfig;
import com.example.services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example15 {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("Before retrieving the Person bean from the Spring Context");
        Person person = context.getBean(Person.class);
        System.out.println("After retrieving the Person bean from the Spring Context");

        //if we don't use lazy, then the moment you start appln then the default constructor will print first
    //        System.out.println("Person bean created by Spring");


    }
}
