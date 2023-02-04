package com.satyamit.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Income_details")
@Data
public class CitizenIncomeEntity {
	
	private Integer id;
	private Double monthlySalary;
	private Double rentIncome;
	private Double propertyIncome;
	
	@OneToOne
	@JoinColumn(name = "fkcpi")
	private CitizenPlanEntity citizenPlan;

}
