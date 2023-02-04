package com.satyamit.repo;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.satyamit.entity.CitizenPlanEntity;

public interface CitizenPlanRepo extends JpaRepository<CitizenPlanEntity, Serializable> {
	
	@Query("select district(planName) from CitizenPlanEntity")
	public List<String>  findByPlanName();

}
