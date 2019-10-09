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
public class TeamMember {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="Active__c")
	private boolean active;
	
	@Column(name="CreatedDate")
	private Date createdDate;
	
	@Column(name="External_Email__c	", length=80)
	private String external_Email__c;
	
	@Column(name="External_ID__c", length=50)
	private String external_ID__c;
	
	@Column(name="IsDeleted")
	private Boolean isDeleted;
	
	@Column(name="Member_Name_Text__c", length=80)
	private String member_Name_Text__c;
	
	@Column(name="Member_Name__c", length=18)
	private String memberName__c;

	@Column(name="Name", length=80)
	private String teamMemberNumber;
	
	@Column(name="RecordTypeId", length=18)
	private String recordTypeId	;
	
	@Column(name="Scrum_Team_Name__c", length=18)
	private String scrum_Team_Name__c	;

	@Column(name="Scrum_Team__c	", length=18)
	private String scrum_Team__c;

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getExternal_Email__c() {
		return external_Email__c;
	}

	public void setExternal_Email__c(String external_Email__c) {
		this.external_Email__c = external_Email__c;
	}

	public String getExternal_ID__c() {
		return external_ID__c;
	}

	public void setExternal_ID__c(String external_ID__c) {
		this.external_ID__c = external_ID__c;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getMember_Name_Text__c() {
		return member_Name_Text__c;
	}

	public void setMember_Name_Text__c(String member_Name_Text__c) {
		this.member_Name_Text__c = member_Name_Text__c;
	}

	public String getMemberName__c() {
		return memberName__c;
	}

	public void setMemberName__c(String memberName__c) {
		this.memberName__c = memberName__c;
	}

	public String getTeamMemberNumber() {
		return teamMemberNumber;
	}

	public void setTeamMemberNumber(String teamMemberNumber) {
		this.teamMemberNumber = teamMemberNumber;
	}

	public String getRecordTypeId() {
		return recordTypeId;
	}

	public void setRecordTypeId(String recordTypeId) {
		this.recordTypeId = recordTypeId;
	}

	public String getScrum_Team_Name__c() {
		return scrum_Team_Name__c;
	}

	public void setScrum_Team_Name__c(String scrum_Team_Name__c) {
		this.scrum_Team_Name__c = scrum_Team_Name__c;
	}

	public String getScrum_Team__c() {
		return scrum_Team__c;
	}

	public void setScrum_Team__c(String scrum_Team__c) {
		this.scrum_Team__c = scrum_Team__c;
	}
}
