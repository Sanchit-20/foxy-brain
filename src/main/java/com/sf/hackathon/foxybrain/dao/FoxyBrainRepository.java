package com.sf.hackathon.foxybrain.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sf.hackathon.foxybrain.dao.entity.UserStressInfo;

public interface FoxyBrainRepository extends JpaRepository<UserStressInfo, Long>{

	List<UserStressInfo>  findAll();
	UserStressInfo save(UserStressInfo userStressInfo);
}
