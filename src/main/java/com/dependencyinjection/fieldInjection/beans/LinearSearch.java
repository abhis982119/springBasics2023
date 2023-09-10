package com.dependencyinjection.fieldInjection.beans;

import org.springframework.stereotype.Component;

@Component
public class LinearSearch {



    public boolean isExist(int[] arr, int target) {
        //arr = [1,2,3,4,5,]   target: 5
        for(int value : arr){
            if(value == target ){
                return true;
            }
        }

        return false;
    }
}
