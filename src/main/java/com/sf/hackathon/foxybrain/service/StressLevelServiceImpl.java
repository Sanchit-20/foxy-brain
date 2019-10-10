package com.sf.hackathon.foxybrain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.sf.hackathon.foxybrain.constant.FoxyBrainConstant;
import com.sf.hackathon.foxybrain.dao.FoxyBrainRepository;
import com.sf.hackathon.foxybrain.dao.TeamMemberRepository;
import com.sf.hackathon.foxybrain.dao.entity.UserStressInfo;
import com.sf.hackathon.foxybrain.dto.UserStressInfoDTO;

@Component
@Service
public class StressLevelServiceImpl implements StressLevelService {

	private UserStressInfo userStressInfo;

	@Autowired
	private FoxyBrainRepository foxyBrainRepository;
	@Autowired
	private TeamMemberRepository teamMemberRepository;

	@Override
	public String updateStressInfo(UserStressInfoDTO userStressInfoDTO) {
		// TODO Auto-generated method stub

		double score = userStressInfoDTO.getStressScore();
		String category;
		if (score < 20) {
			category = FoxyBrainConstant.NO_STRESS;
		} else if (score >= 20 && score < 40) {
			category = FoxyBrainConstant.MODERATE_STRESS;
		} else if (score > 40 && score <= 60) {
			category = FoxyBrainConstant.MILD_STRESS;
		} else if (score > 60 && score <= 80) {
			category = FoxyBrainConstant.HIGH_STRESS;
		} else {
			category = FoxyBrainConstant.EXTREME_STRESS;
		}

		userStressInfo.setEmailId(userStressInfoDTO.getEmailId());
		userStressInfo.setStressScore(userStressInfoDTO.getStressScore());
		userStressInfo.setDateTime(userStressInfoDTO.getDateTime());
		userStressInfo.setStressCategory(category);
		userStressInfo.setTeamId(teamMemberRepository.findByEmailId(userStressInfoDTO.getEmailId()).getScrumTeam());

		foxyBrainRepository.save(userStressInfo);
		
		return "SUCCESS";

	}

}
