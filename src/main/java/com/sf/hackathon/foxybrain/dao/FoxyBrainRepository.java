package com.sf.hackathon.foxybrain.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sf.hackathon.foxybrain.dao.entity.Test;

public interface FoxyBrainRepository extends JpaRepository<Test, Long>{

	List<Test>  findAll();
}
