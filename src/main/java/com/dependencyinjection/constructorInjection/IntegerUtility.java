package com.dependencyinjection.constructorInjection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IntegerUtility {



    private LinearSearch linearSearch;

    @Autowired //constructor-injection
    public IntegerUtility(LinearSearch linearSearch) {
        this.linearSearch = linearSearch;
    }
}
