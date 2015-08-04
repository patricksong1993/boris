package com.blackrock.boris.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "divisions")
public class Division {
	
	@Id
	@Column(name = "ref_id")
	@GeneratedValue(strategy=GenerationType.AUTO)  
	private long refId;
	@Column(name = "divisionName")
	private String divisionName;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "team")
	List<Team> teamsInDivision;

	public String getDivisionName() {
		return divisionName;
	}
	public void setDivisionName(String divisionName) {
		this.divisionName = divisionName;
	}
	public List<Team> getTeamsInDivision() {
		return teamsInDivision;
	}
	public void setTeamsInDivision(List<Team> teamsInDivision) {
		this.teamsInDivision = teamsInDivision;
	}
	
	
}
