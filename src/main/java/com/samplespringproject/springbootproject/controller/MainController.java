package com.samplespringproject.springbootproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@RequestMapping("/")
	@ResponseBody
	public String home() {
		System.out.println("this is home page");
		return "This is home page";
//		return "home";
	}
//	logging.level.org.springframework=TRACE in application.properties
//	logging.level.com=TRACE
	@RequestMapping("/contact")
	public String contact() {
		System.out.println("this is contact page");
		return "this is contact page";
//		return "contact";
	}
}
