package com.springBasics;

import com.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;


@SpringBootApplication
@ComponentScan({"com.model"})
public class SpringBasics {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringBasics.class, args);

		Student student1 = applicationContext.getBean(Student.class);
		Student student2 = applicationContext.getBean(Student.class);

		 if(student1 == student2){
			 System.out.println("Both student same");
		 }else{
			 System.out.println("Both student not same");
		 }

	}


	@Bean
	@Scope("prototype")
	public Student creatStudentBean(){
		return new Student();
	}

}
