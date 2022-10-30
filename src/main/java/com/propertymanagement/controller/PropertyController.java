package com.propertymanagement.controller;

import com.propertymanagement.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.propertymanagement.service.impl.dto.PropertyDto;

@RestController
//@RequestMapping("/api/v1/property")
public class PropertyController {
	@Autowired
	private PropertyService propertyService;

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello";
	}
	@PostMapping("/save")
	public ResponseEntity<PropertyDto> saveProperty(@RequestBody  PropertyDto propertyDto) {
		//System.out.println(propertyDto);
		propertyDto = propertyService.saveProperty(propertyDto);
		ResponseEntity<PropertyDto> responseEntity = new ResponseEntity<>(propertyDto, HttpStatus.ACCEPTED);
		return responseEntity;
	}
//	public PropertyDto updateProperty(){
//		return propertydto;
//	}
}
