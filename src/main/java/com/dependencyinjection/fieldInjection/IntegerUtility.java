package com.dependencyinjection.fieldInjection;


import com.dependencyinjection.fieldInjection.beans.LinearSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class IntegerUtility {


    @Autowired   //field injection
    private LinearSearch searchAlgo;


    public boolean isExist(int[] arr, int target){
       return  searchAlgo.isExist(arr, target);
    }





}
