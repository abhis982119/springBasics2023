package com.annotations.bean;

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
@ComponentScan({"com.model"})
public class BeanAnnotationWorking {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(BeanAnnotationWorking.class, args);

	}


	@Bean
	@Scope("prototype")
	public Student creatStudentBean(){
		return new Student();
	}

	@Bean
	public Employee createEmployee(){
		return new Employee();
	}


	@Bean
	public Standard createStandard(Student student){
		return  new Standard(student);
	}





}
