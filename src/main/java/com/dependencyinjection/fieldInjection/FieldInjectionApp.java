package com.dependencyinjection.fieldInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class FieldInjectionApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(FieldInjectionApp.class, args);

	}




}
