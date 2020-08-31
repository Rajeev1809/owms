package com.cg.owms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

import com.cg.owms.exception.LoginException;
import com.cg.owms.service.LoginService;



@RestController
@CrossOrigin("*")
public class LoginController {

	@Autowired
	LoginService loginService;
	
	@GetMapping("login/validate/{user}/{pass}")
	public ResponseEntity<String> validate(@PathVariable("user") String userName, 
			@PathVariable("pass") String password) throws LoginException
	{
		String role = loginService.validate(userName, password);
		 ResponseEntity<String> re = new  ResponseEntity<String>(role,HttpStatus.OK);
		 return re;
		
	}
	
}
