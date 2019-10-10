package com.sf.hackathon.foxybrain.dto;

import java.util.Date;


public class UserStressInfoDTO {
	
	private String emailId;
	private double stressScore;
	

	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public double getStressScore() {
		return stressScore;
	}
	public void setStressScore(Long stressScore) {
		this.stressScore = stressScore;
	}

}
