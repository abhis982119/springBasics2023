package com.dependencyinjection.setterInjection;


import com.dependencyinjection.setterInjection.LinearSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IntegerUtility {



    private LinearSearch linearSearch;

    @Autowired //setter injection
    public void setLinearSearch(LinearSearch linearSearch) {
        this.linearSearch = linearSearch;
    }


}
