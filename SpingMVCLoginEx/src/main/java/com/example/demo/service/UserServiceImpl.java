package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.UserRepository;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService{
	//Autowired by type
	@Autowired
	UserRepository userRepositoryep;
	
	@Override
	public void getUsers() {
		System.out.println("From service impl ====>");
	}
}
