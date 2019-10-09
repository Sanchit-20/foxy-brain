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
@Table(name = "TEAMMEMBER")
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
	private String emailId;
	
	@Column(name="External_ID__c", length=50)
	private String externalID;
	
	@Column(name="IsDeleted")
	private Boolean isDeleted;
	
	@Column(name="Member_Name_Text__c", length=80)
	private String memberNameText;
	
	@Column(name="Member_Name__c", length=18)
	private String memberName;

	@Column(name="Name", length=80)
	private String teamMemberNumber;
	
	@Column(name="RecordTypeId", length=18)
	private String recordTypeId	;
	
	@Column(name="Scrum_Team_Name__c", length=18)
	private String scrumTeamName;

	@Column(name="Scrum_Team__c	", length=18)
	private String scrumTeam;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getExternalID() {
		return externalID;
	}

	public void setExternalID(String externalID) {
		this.externalID = externalID;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getMemberNameText() {
		return memberNameText;
	}

	public void setMemberNameText(String memberNameText) {
		this.memberNameText = memberNameText;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
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

	public String getScrumTeamName() {
		return scrumTeamName;
	}

	public void setScrumTeamName(String scrumTeamName) {
		this.scrumTeamName = scrumTeamName;
	}

	public String getScrumTeam() {
		return scrumTeam;
	}

	public void setScrumTeam(String scrumTeam) {
		this.scrumTeam = scrumTeam;
	}
	
}
