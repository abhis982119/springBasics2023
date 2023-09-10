package com.controller;

import com.model.RequestScopeObject;
import com.model.SessionScopeObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/scope")
public class HealthCheckController {


    @Autowired
    private RequestScopeObject requestScope;

    @Autowired
    private SessionScopeObject sessionScope;

//excel :
    @GetMapping("/request")
    public void getRequestSessionObject(){
        System.out.println(requestScope);
       // return requestScope;
    }


    @GetMapping("/session")
    public void getSessionObject(){
        System.out.println(sessionScope);
       // return sessionScope;
    }


}
