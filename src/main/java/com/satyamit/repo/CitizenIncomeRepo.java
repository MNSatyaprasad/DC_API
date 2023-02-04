package com.satyamit.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satyamit.entity.CitizenIncomeEntity;

public interface CitizenIncomeRepo extends JpaRepository<CitizenIncomeEntity,Serializable> {

}
