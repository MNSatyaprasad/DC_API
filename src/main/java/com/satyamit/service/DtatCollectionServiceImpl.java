package com.satyamit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.satyamit.binding.CitizenEducaution;
import com.satyamit.binding.CitizenIncome;
import com.satyamit.binding.CitizenKids;
import com.satyamit.entity.CitiZenEducautionEntity;
import com.satyamit.entity.CitizenIncomeEntity;
import com.satyamit.entity.CitizenKidsEntity;
import com.satyamit.entity.CitizenPlanEntity;
import com.satyamit.repo.CitizenEducationRepo;
import com.satyamit.repo.CitizenIncomeRepo;
import com.satyamit.repo.CitizenKidsRepo;
import com.satyamit.repo.CitizenPlanRepo;

@Service
public class DtatCollectionServiceImpl implements DataCollectionService {
	
	@Autowired
	private CitizenPlanRepo citizenPlanRepo;
	
	@Autowired
	private CitizenIncomeRepo citizenIncomerepo;
	
	@Autowired
	private CitizenEducationRepo citizennEducautionRepo;
	
	@Autowired
	private CitizenKidsRepo citizenKidsRepo;

	@Override
	public List<String> getPlanName() {
		
		return citizenPlanRepo.findByPlanName();
	
	}

	@Override
	public String saveIncomeDetails(CitizenIncome citizenIncome) {
	
		CitizenIncomeEntity entity = new CitizenIncomeEntity();
		BeanUtils.copyProperties(citizenIncome, entity);
	 entity= citizenIncomerepo.save(entity);
		return "Citizen Income Dtails are saved";
	}

	@Override
	public String saveEducationDetails(CitizenEducaution citizenEducation) {
		
		CitiZenEducautionEntity entity = new CitiZenEducautionEntity();
		BeanUtils.copyProperties(citizenEducation, entity);
		  citizennEducautionRepo.save(entity);
		  
		return "Citizen Education Details are saved ";
	}

	@Override
	public String saveKidsDetails(CitizenKids citizenKids) {
		
		CitizenKidsEntity entity = new CitizenKidsEntity();
		BeanUtils.copyProperties(citizenKids, entity);
		citizenKidsRepo.save(entity);
		return "Citizen Kids details are saved";
	}

}
