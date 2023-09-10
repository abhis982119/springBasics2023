package com.model;

import lombok.ToString;

import javax.annotation.PostConstruct;

@ToString
public class Employee {

    private String name = "defaultName";

    private int empId = -1;


    @PostConstruct
    public void postConstructed(){
        System.out.println("@PostConstruct " + this);
    }
}
