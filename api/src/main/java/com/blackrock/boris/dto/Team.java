package com.blackrock.boris.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "teams")
public class Team {
	
	private long refId;
	private String name;
	private List<User> teamMembers;
	private List<Technology> technologiesUsed;
	public long getRefId() {
		return refId;
	}
	public void setRefId(long refId) {
		this.refId = refId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<User> getTeamMembers() {
		return teamMembers;
	}
	public void setTeamMembers(List<User> teamMembers) {
		this.teamMembers = teamMembers;
	}
	public List<Technology> getTechnologiesUsed() {
		return technologiesUsed;
	}
	public void setTechnologiesUsed(List<Technology> technologiesUsed) {
		this.technologiesUsed = technologiesUsed;
	}
	
}
