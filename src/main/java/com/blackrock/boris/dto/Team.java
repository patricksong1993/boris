package com.blackrock.boris.dto;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "teams")
public class Team {
	@Id
	@Column(name = "ref_id")
	@GeneratedValue(strategy=GenerationType.AUTO)  
	private long refId;
	
	@Column (name = "name")
	private String name;
	
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(mappedBy = "team")
	private List<User> teamMembers;
	
	@ManyToMany( fetch = FetchType.EAGER,mappedBy = "teamsUsingTechnology")
	private Set<Technology> technologiesUsed;
	
	@ManyToOne(cascade=CascadeType.ALL) 
	@JoinColumn(name="division_ref_id", nullable=false)
	private Division divisionTeamWorksIn;
	
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
	@JsonIgnore
	public Set<Technology> getTechnologiesUsed() {
		return technologiesUsed;
	}
	public void setTechnologiesUsed(Set<Technology> technologiesUsed) {
		this.technologiesUsed = technologiesUsed;
	}
	public Division getDivisionTeamWorksIn() {
		return divisionTeamWorksIn;
	}
	public void setDivisionTeamWorksIn(Division divisionTeamWorksIn) {
		this.divisionTeamWorksIn = divisionTeamWorksIn;
	}
}
