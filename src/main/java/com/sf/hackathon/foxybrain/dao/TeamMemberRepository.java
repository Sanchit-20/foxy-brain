package com.sf.hackathon.foxybrain.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sf.hackathon.foxybrain.dao.entity.TeamMember;

public interface TeamMemberRepository extends JpaRepository<TeamMember, Long>{

	TeamMember findByEmailId(String emailId);
}
