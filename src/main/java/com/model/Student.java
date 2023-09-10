package com.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private String name = "defaultName";

    private Integer  standard  = -1 ;

    private Integer rollNumber = -1;




    @PostConstruct
    public void printCreated(){
        System.out.println("@PostConstruct : " + this);
    }

}
