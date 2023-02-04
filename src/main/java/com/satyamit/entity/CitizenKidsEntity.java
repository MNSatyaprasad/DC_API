package com.satyamit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Kids_Details")
@Data
public class CitizenKidsEntity {
	
	@Id
	@GeneratedValue
	private Integer Kid;
	private String kidName;
	private Short kidAge;
	private Long kidSsn;
	
	@OneToMany
	@JoinColumn(name ="fkcpk")
	private CitizenPlanEntity citizenePlan;
	

}
