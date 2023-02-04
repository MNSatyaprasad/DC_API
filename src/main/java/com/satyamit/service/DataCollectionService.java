package com.satyamit.service;

import java.util.List;

import com.satyamit.binding.CitizenEducaution;
import com.satyamit.binding.CitizenIncome;
import com.satyamit.binding.CitizenKids;

public interface DataCollectionService {
	
	public List<String> getPlanName();
	
	public String saveIncomeDetails(CitizenIncome citizenIncome);
	
	public String saveEducationDetails(CitizenEducaution citizenEducation);
	
	public String saveKidsDetails(CitizenKids citizenKids);

}
