package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class WebController {

//	@RequestMapping("/app")
//	String display1(HttpSession h, int id,String name)
//	{
//		Student s = new Student();
//		s.setSid(id);
//		s.setSname(name);
//		h.setAttribute("name", s);
//		return"demo.jsp";
//	}
	@RequestMapping("/App")
	String display1(HttpSession h,Student s)
	{
		h.setAttribute("name", s);
		return"Demo.jsp";
	}
	@RequestMapping("Home")
   String api1home()
   {
	   return "Home.jsp";
   }
	@RequestMapping("index")
	String apiMain(HttpSession h,String name)
	{
		h.setAttribute("value",name);
		return "Main.jsp";
	}
	
}
