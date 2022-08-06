package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.UserService;

@RestController
public class UserController {
	//Autowired by name
	@Autowired
	UserService userServiceNewImpl;
	
	//autowired by qualifier
	@Autowired
	@Qualifier("userServiceNewImpl")
	UserService userService;
	
	//autowired by name
	@Autowired
	UserService userServiceImpl;
	
	@GetMapping
	public String getUsers() {
		userService.getUsers();
		return "Success";
	}
	
}
