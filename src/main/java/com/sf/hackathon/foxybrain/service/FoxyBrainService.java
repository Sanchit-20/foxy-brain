package com.sf.hackathon.foxybrain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.sf.hackathon.foxybrain.dao.FoxyBrainRepository;
import com.sf.hackathon.foxybrain.dao.entity.Test;

@Component
@Service
public class FoxyBrainService {

	@Autowired
	private FoxyBrainRepository foxyBrainRepository;
	public String testData(){
		return "Greeting for Foxy Brain from Service layer";
	}
	
//	public String testDao(){
//		List<Test> data = foxyBrainRepository.findAll();
//		return data.get(0).getMessage();
//	}
}
