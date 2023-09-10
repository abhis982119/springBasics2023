package com.checkingbeanscreatedanddetails;

import com.model.Employee;
import com.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;


@SpringBootApplication
@ComponentScan({"com.model"})
public class PrintDataOfAllBeansCreated {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(PrintDataOfAllBeansCreated.class, args);

		Student student1 = applicationContext.getBean(Student.class);
		Student student2 = applicationContext.getBean(Student.class);
		Student student3 = applicationContext.getBean(Student.class);


		Employee employee = applicationContext.getBean(Employee.class);
		Employee employee1 = applicationContext.getBean(Employee.class);

		int createdBeans = applicationContext.getBeanDefinitionCount();
		System.out.println("total beans created : " + createdBeans);

		String[] beanNames = applicationContext.getBeanDefinitionNames();
		for(String bn : beanNames){
			System.out.println(applicationContext.getBean(bn));
		}

	}


	@Bean
	@Scope("prototype")
	public Student creatStudentBean(){
		return new Student();
	}

	@Bean
	public Employee createEmployeeBean(){
		return new Employee();
	}



}
