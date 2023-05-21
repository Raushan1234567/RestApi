package com.spring.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.springrest.controller.entities.courses;
import com.spring.springrest.services.ServiceImplementation;
import com.spring.springrest.services.Serviceinterface;

@RestController
public class Mycontroller {

//	@GetMapping("/home")
//	public String home() {
//		return "This  is home";
//	}
	
	//get courses
	
	@Autowired
	public Serviceinterface b;
	
	
	
	
	@GetMapping("/c")
	public List<courses> courses(){
		return this.b.getcourse();
		
	}
	
}
