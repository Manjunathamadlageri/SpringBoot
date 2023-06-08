package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpSession;

@Controller
public class StudentController 
{
	@Autowired
	StudentRepo repo;

	@RequestMapping("/addStudent")
	String addStudent()
	{
		return "details.jsp";
	}
	@RequestMapping("savaStudent")
	String savaStudent(Student s)
	{
		System.out.println(s);
		repo.save(s);
		return "details.jsp";
	}
	@RequestMapping("showStudent")
	String savaStudent(HttpSession h , Integer sid)
	{
		Student s = repo.findById(sid).orElse(null);
		h.setAttribute("student",s);
		return "viwe.jsp";
	}
	@RequestMapping("deleteStudent")
	String deleteStudent(HttpSession h , Integer sid)
	{
		Student s = repo.findById(sid).orElse(null);
		if(s!=null)
		{
			h.setAttribute("message", "Student with id"+sid+"got deleted");
			repo.deleteById(sid);
		}
		else
		{
			h.setAttribute("message","invlide Data.........!!!!");
		}
		return "delete.jsp";
	}
	@RequestMapping("studentByEmail")
	String studentByEmail(HttpSession h , String email)
	{
		List<Student> l = repo.findByEmail(email);
		System.out.println(l);
		return"";
	}
	@RequestMapping("studentByPhonoAse")
	@ResponseBody
	List<Student>studentByPhonoAse()
	{
		System.out.println(repo.studentByPhonoAse());
		System.out.println();
		System.out.println();
		System.out.println();
		return repo.studentByPhonoAse();
	}
}
