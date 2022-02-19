package com.assignment1.assignment1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("/hello")
	@ResponseBody
	public String helloworld() {
		return "HelloWorld!!!";
	}
}
