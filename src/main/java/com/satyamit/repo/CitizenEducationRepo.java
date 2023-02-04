package com.satyamit.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satyamit.entity.CitiZenEducautionEntity;

public interface CitizenEducationRepo extends JpaRepository<CitiZenEducautionEntity, Serializable> {

}
