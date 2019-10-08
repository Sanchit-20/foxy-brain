package com.sf.hackathon.foxybrain.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoxyBrainController {

	@RequestMapping("/test")
	public String getTestData(){
		return "Hello Foxy Brains";
	}
}
