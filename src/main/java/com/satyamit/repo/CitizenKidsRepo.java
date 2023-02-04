package com.satyamit.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satyamit.entity.CitizenKidsEntity;

public interface CitizenKidsRepo extends JpaRepository<CitizenKidsEntity,Serializable>{

}
