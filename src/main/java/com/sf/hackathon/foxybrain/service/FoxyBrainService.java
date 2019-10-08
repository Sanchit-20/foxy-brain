package com.sf.hackathon.foxybrain.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class FoxyBrainService {

	public String testData(){
		return "Greeting Foxy Brain from Service layer";
	}
}
