package com.scope.requestVsSession;

import com.model.RequestScopeObject;
import com.model.SessionScopeObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;


@SpringBootApplication
@ComponentScan({"com.model","com.controller"})
public class RequesetVsSessionScope {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(RequesetVsSessionScope.class, args);

	}


	@Bean
	@RequestScope
	public RequestScopeObject createRequestScopeObject(){
		return new RequestScopeObject();
	}

	@Bean
	@SessionScope
	public SessionScopeObject createSessionScopeObject(){
		return new SessionScopeObject();
	}


}
