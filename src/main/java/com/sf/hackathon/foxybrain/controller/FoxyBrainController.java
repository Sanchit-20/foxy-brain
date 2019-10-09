package com.sf.hackathon.foxybrain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sf.hackathon.foxybrain.dto.UserStressInfoDTO;
import com.sf.hackathon.foxybrain.service.StressLevelService;


@RestController
@RequestMapping("/api/stress")
public class FoxyBrainController {

	@Autowired
	private StressLevelService stressLevelService;
	
	@PostMapping
	public String updateStressInfo(@RequestBody UserStressInfoDTO userStressInfoDTO) {
	
		return stressLevelService.updateStressInfo(userStressInfoDTO);
	}

	
	
}
