package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name="Lisa";
    private final Vehicle vehicle;

    @Autowired
//   e.g. with name of bean
    /**
     public Person( Vehicle vehicle1){
     System.out.println("Person bean created by Spring");
     this.vehicle = vehicle1;
     }**/

    //e.g. with primary annotation
    /**
    public Person( Vehicle vehicle){
        System.out.println("Person bean created by Spring");
        this.vehicle = vehicle;
    }**/

    //e.g. with qualifier annotation

    public Person(@Qualifier("vehicle2")Vehicle vehicle){
     System.out.println("Person bean created by Spring");
     this.vehicle = vehicle;
     }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

}
