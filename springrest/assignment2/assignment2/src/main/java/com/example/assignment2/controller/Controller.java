package com.example.assignment2.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.assignment2.entities.User;

@RestController
public class Controller {
User user = new User("palash","pal@77");

@PostMapping("/login")
@ResponseBody
public String login(@RequestBody User user) {
	System.out.println(user);
	if(this.user.getPassword().equals(user.getPassword())&& this.user.getUsername().equals(user.getUsername()))
	{
	return  "valid user";
	}
	return "Invalid user";
}
}
