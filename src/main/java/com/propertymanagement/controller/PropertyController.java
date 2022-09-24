package com.propertymanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.propertymanagement.dto.PropertyDto;

@RestController
@RequestMapping("/api/v1/property")
public class PropertyController {
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello";
	}
	@PostMapping("/save")
	public PropertyDto saveProperty( PropertyDto propertyDto) {
		System.out.println(propertyDto);
		return propertyDto;
	}

}
