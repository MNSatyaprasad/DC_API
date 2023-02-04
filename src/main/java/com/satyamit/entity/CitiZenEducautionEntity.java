package com.satyamit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Educaution_details")
@Data
public class CitiZenEducautionEntity {
	@Id
	@GeneratedValue
	private Integer Eid;
	private String highestDegree;
	private Short graduationYear;
	private String unibersityName;
	
	@OneToOne
	@JoinColumn(name = "fkcpe")
	private CitizenPlanEntity citizenPlan;

}
