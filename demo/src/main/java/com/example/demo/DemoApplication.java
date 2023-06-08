package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
		//		System.out.println("Hello how are you!!!!");
		//		Student std = new Student();
		//		std.display();
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		System.out.println("Welcome To Spring Class");
		Student s = context.getBean(Student.class);
		s.display();
		
	}

}
