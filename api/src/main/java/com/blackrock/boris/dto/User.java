package com.blackrock.boris.dto;

import java.util.List;

public class User {

	private Integer id;
	private String username;
	private String fullName;
	private Team team;
	private List<Technology> technologies;
	private List<Event> events;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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