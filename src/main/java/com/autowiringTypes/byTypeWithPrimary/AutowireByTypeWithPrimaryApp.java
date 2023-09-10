package com.autowiringTypes.byTypeWithPrimary;

import com.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;


@SpringBootApplication
public class AutowireByTypeWithPrimaryApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(AutowireByTypeWithPrimaryApp.class, args);


        Student student = applicationContext.getBean( Student.class);

		System.out.println("printing student data " + student);


	}



	@Bean
	@Primary
	public Student createRameshStudent(){
	  return new Student("Ramesh", null, null);
	}


	@Bean
	public Student createSureshStudent(){
		return new Student("Suresh", null, null);
	}







}
