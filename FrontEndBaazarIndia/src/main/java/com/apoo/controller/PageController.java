package com.apoo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController 
{
	@RequestMapping("/Login")
	public String showLogin(Model m)
	{
		m.addAttribute("pageinfo", "Login");
		return "Login";
}
	@RequestMapping("/register")
	public String showRegister(Model m)
	{
m.addAttribute("pageinfo", "Register");
		return "Register";
	}
	@RequestMapping("/aboutus")
	public String showAboutUs(Model m)
	{
		m.addAttribute("pageinfo", "AboutUs");
		return "AboutUs";
	}
	@RequestMapping("/contactus")
	public String showContactUs(Model m)
	{
		m.addAttribute("pageinfo", "ContactUs");
		return "ContactUs";
	}
		@RequestMapping("/home")
		public String showHome(Model m)
		{
			m.addAttribute("pageinfo", "Home");
			return "Home";
}
}
