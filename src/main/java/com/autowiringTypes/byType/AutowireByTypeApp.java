package com.autowiringTypes.byType;

import com.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class AutowireByTypeApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(AutowireByTypeApp.class, args);


        Student student = applicationContext.getBean( Student.class);
		System.out.println("printing student data " + student);

	}




	public Student createStudent(){
	  return new Student("Ramesh", null, null);
	}






}
