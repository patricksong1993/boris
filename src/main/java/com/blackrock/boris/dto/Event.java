package com.blackrock.boris.dto;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table (name = "events")
public class Event {
	
	@Id
	@Column (name = "ref_id")
	@GeneratedValue(strategy=GenerationType.AUTO)  
	private long id;
	@Column (name = "name")
	private String name;
	@Column (name = "place")
	private String place;
	@Column (name = "date")
	private Date date;

	@ManyToOne(fetch = FetchType.LAZY)
	@Transient
	private String readableDate;
	
	@OneToOne(fetch = FetchType.LAZY)
	private Technology technologyOrganizedFor;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setReadableDate(String readableDate) {
		this.readableDate = readableDate;
	}
	public String getReadableDate() {
		return readableDate;
	}
}
