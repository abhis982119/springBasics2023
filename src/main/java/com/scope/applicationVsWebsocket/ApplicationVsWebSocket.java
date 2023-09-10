package com.scope.applicationVsWebsocket;

import com.model.ApplicationScopedBean;
import com.model.Employee;
import com.model.Student;
import com.model.WebSocketScopedBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;


@SpringBootApplication
@ComponentScan({"com.model"})
public class ApplicationVsWebSocket {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ApplicationVsWebSocket.class, args);
	}


	@Bean
	@Scope("application")
	public ApplicationScopedBean applicationScopedBean() {
		return new ApplicationScopedBean();
	}

	@Bean
	@Scope("websocket")
	public WebSocketScopedBean webSocketScopedBean() {
		return new WebSocketScopedBean();
	}

}
