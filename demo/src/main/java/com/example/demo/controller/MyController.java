package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.controller.entity.Employee;
import com.example.demo.controller.service.WelcomeService;

@RestController
public class MyController {
	
	@Autowired
	private WelcomeService welcomeService;
	
	@GetMapping("/welcome")
	public ResponseEntity<String> welcomeMsg(){
		String welcomeMsg = welcomeService.getWelcomeMessage();
		if(welcomeMsg!=null) {
			return new ResponseEntity<String>(welcomeMsg,HttpStatus.OK);
		}else
		{
			return new ResponseEntity<String>("Welcome Message not found!!",HttpStatus.NOT_FOUND);
		}
		
	}
	
}
