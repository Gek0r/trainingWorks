package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service("userServiceNewImplp")
public class UserServerNewImpl implements UserService{
	
	@Override
	public void getUsers() {
		System.out.println("From new service impl ===>");
	}
}
