package com.sf.hackathon.foxybrain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sf.hackathon.foxybrain.service.FoxyBrainService;

@RestController
public class FoxyBrainController {

	@Autowired
	private FoxyBrainService foxyBrainService;
	
	@RequestMapping("/test")
	public String getTestData(){
		return "Hello Foxy Brains";
	}
	
	@RequestMapping("/test-service")
	public String getTestData1(){
		return foxyBrainService.testData();
	}
}
