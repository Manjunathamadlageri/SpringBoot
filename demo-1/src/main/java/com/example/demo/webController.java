package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class webController 
{
	@RequestMapping("login")
String loginUser()
{
	return "login.jsp";
}
	@RequestMapping("validate")
String valdateUser(String email,String pass)
{
	if(email.equals("admin@gmail.com") && pass.equals("Admin@123")) {
	return "welcom.jsp";
	}
	return "error.jsp";
}
}
