package com.annotations.value;

import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@ToString
@RestController
public class PageUtilityRequest {
    @Value("${pagination.pageSize}")
    private int pageSize;

    private int pageNumber;


    @GetMapping("/ping")
    public String ping(){
        System.out.println("new word");
        /*return "pong-key";*/
        TestMethod testMethod = new TestMethod();
        return testMethod.m1();
    }
    @PostConstruct
    public void postConstruct(){
        System.out.println(this);
    }
}
