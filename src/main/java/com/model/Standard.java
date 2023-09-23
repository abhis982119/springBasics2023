package com.model;

import lombok.AllArgsConstructor;
import lombok.ToString;

import javax.annotation.PostConstruct;

@AllArgsConstructor
@ToString
public class Standard {

    private Student student;

    @PostConstruct
    public void printCreated(){
        System.out.println("@PostConstruct : " + this);
    }
}
