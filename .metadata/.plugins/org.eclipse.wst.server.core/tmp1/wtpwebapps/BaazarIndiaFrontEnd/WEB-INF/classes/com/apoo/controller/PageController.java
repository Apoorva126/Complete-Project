package com.apoo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	@RequestMapping("/login")
	public String showLogin(Model mv)
	{
		mv.addAttribute("pageinfo","Login");
		return "Login";
	}
	
	@RequestMapping("/home")
	public String showHome(Model mv)
	{
		mv.addAttribute("pageinfo","Home");
		return "Home";
		
	}
	@RequestMapping("/register")
	public String showRegister(Model mv)
	{
		mv.addAttribute("pageinfo","Login");
		return "Register";
		
	}
	@RequestMapping("/contactus")
	public String showContactUs(Model mv)
	{
		mv.addAttribute("pageinfo","Login");
		return "ContactUs";
		
	}
	
	@RequestMapping("/aboutus")
	public String showAboutUs()
	{
		//mv.addAttribute("pageinfo","Login");
		return "AboutUs";
		
	}
	
	@RequestMapping("/managecategory")
	public String showManageCategory()
	{
	return "ManageCategory"	;
	}
	
}