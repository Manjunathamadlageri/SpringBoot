package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Student {
	@Autowired
	@Qualifier("2")
	College c;
	Student()
	{
		System.out.println("Student Cons");
	}
 void display()
 {
	 System.out.println("welcome pavan");
	 c.fee();
 }
}
