package com.samplespringproject.springbootproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@RequestMapping("/")
	@ResponseBody
	public String home() {
		System.out.println("This is home page");
		return "This is home page";
//		return "home";
	}
//	logging.level.org.springframework=TRACE in application.properties
//	logging.level.com=TRACE
	@RequestMapping("/contact")
	@ResponseBody
	public String contact() {
		System.out.println("This is contact page");
		return "This is my new contact page";
//		return "contact";
	}

	@ResponseBody
	public String display() {
		return "Hello There!!";
	}
}
