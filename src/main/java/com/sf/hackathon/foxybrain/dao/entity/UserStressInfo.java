package com.sf.hackathon.foxybrain.dao.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@Table(name = "Stress_Info__c")
@EntityListeners(AuditingEntityListener.class)
public class UserStressInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="EMAILID", length=50)
	private String emailId;
	
	@Column(name="Stress_Score__c")
	private double stressScore;
	
	@Column(name="Date_Of_Scan__c", length=50)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateTime;
	
	@Column(name="Team__c", length=18)
	private String teamId;
	
	@Column(name="Stress_Category__c", length=255)
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

	public double getStressScore() {
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
