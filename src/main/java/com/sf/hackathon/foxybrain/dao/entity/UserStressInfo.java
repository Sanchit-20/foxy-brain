package com.sf.hackathon.foxybrain.dao.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@Table(name = "USER_STRESS_INFO")
@EntityListeners(AuditingEntityListener.class)
public class UserStressInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="EMAILID", length=50)
	private String emailId;
	
	@Column(name="STRESSSCORE")
	private Long stressScore;
	
	@Column(name="DATETIME", length=50)
	private Date dateTime;
	
	@Column(name="TEAMID", length=50)
	private String teamId;
	
	@Column(name="STRESSCATEGORY", length=50)
	private String stressCategory;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
