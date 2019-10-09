package com.sf.hackathon.foxybrain.dto;

import java.util.Date;


public class UserStressInfoDTO {
	
	private String emailId;
	private Long stressScore;
	private Date dateTime;
	private String teamId;
	private String stressCategory;
	

	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Long getStressScore() {
		return stressScore;
	}
	public void setStressScore(Long stressScore) {
		this.stressScore = stressScore;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	public String getTeamId() {
		return teamId;
	}
	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}
	public String getStressCategory() {
		return stressCategory;
	}
	public void setStressCategory(String stressCategory) {
		this.stressCategory = stressCategory;
	}

}
