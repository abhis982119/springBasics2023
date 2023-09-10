package com.autowiringTypes.byName;

import com.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class AutowireByName {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(AutowireByName.class, args);


        Student student = applicationContext.getBean("ramesh", Student.class);
		System.out.println("printing student data " + student);

	}



	@Bean(name = "ramesh")
	public Student createStudent1(){
	  return new Student("Ramesh", null, null);
	}


	@Bean(name = "suresh")
	public Student createStudent2(){
		return new Student("Ramesh", null, null);
	}



}
