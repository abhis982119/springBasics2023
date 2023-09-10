package com.scope.singletonVsprototype;

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
public class SingletonVsPrototypeScope {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SingletonVsPrototypeScope.class, args);



		//Singleton Example
		Employee employee1 = applicationContext.getBean(Employee.class);
		Employee employee2 = applicationContext.getBean(Employee.class);

		if(employee1 == employee2){
			System.out.println("Both employee are same");
		}else{
			System.out.println("Both employee are different");
		}


		//Prototype example

		Student student1 = applicationContext.getBean(Student.class);
		Student student2 = applicationContext.getBean(Student.class);



		 if(student1 == student2){
			 System.out.println("Both student same");
		 }else{
			 System.out.println("Both student are different");
		 }

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

}
