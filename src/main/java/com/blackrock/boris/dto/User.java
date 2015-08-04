package com.blackrock.boris.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name="users")
public class User {
	
	@Id
	@Column(name = "ref_id")
	@GeneratedValue(strategy=GenerationType.AUTO)  
	private long id;

	@Column(name = "username")
	private String username;

	@Column(name = "full_name")
	private String fullName;

	@ManyToOne(cascade=CascadeType.ALL) 
	@JoinColumn(name="user_ref_id", nullable=false)
	private Team team;
	
	@LazyCollection(LazyCollectionOption.FALSE)
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "user_technology", joinColumns = { 
			@JoinColumn(name = "user_ref_id", nullable = false, updatable = false) }, 
			inverseJoinColumns = { @JoinColumn(name = "technology_ref_id", 
					nullable = false, updatable = false) })
	private List<Technology> technologiesSubscribedTo;
	
	@LazyCollection(LazyCollectionOption.FALSE)
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "user_event", joinColumns = { 
			@JoinColumn(name = "user_ref_id", nullable = false, updatable = false) }, 
			inverseJoinColumns = { @JoinColumn(name = "event_ref_ID", 
					nullable = false, updatable = false) })
	private List<Event> events;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}

	public List<Event> getAttendances() {
		return events;
	}
	public void setAttendances(List<Event> events) {
		this.events = events;
	}


}