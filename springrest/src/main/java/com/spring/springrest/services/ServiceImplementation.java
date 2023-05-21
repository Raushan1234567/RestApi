package com.spring.springrest.services;

import java.util.*;

import org.springframework.stereotype.Service;

import com.spring.springrest.controller.entities.courses;


@Service
public class ServiceImplementation implements Serviceinterface{

	
	List<courses> a=new ArrayList<>();
	
	
	public ServiceImplementation() {
		a.add(new courses(123, "Java", "java basics"));
		a.add(new courses(233, "Kotlin", "Basics"));
	}


	@Override
	public List<courses> getcourse() {
		
		return a;
	}

}
