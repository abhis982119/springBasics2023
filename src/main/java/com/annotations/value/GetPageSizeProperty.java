package com.annotations.value;

import com.model.Employee;
import com.model.Standard;
import com.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;


@SpringBootApplication
public class GetPageSizeProperty {

	private static  String overridePropertyFileLocation =  System.getProperty("user.home") + "/sbconfig.properties";

	public static void main(String[] args) {
		System.out.println("overridePropertyFileLocation : " + overridePropertyFileLocation);
		ApplicationContext applicationContext =
				SpringApplication.run(GetPageSizeProperty.class, args);

	}


}
