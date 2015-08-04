package com.blackrock.boris.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "subscriptions")
public class Subscription {
	
	@Id
	@Column(name = "ref_id")
	@GeneratedValue(strategy=GenerationType.AUTO)  
	private long refId;
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "teamsUsingTechnology")
	private List<User> technologiesSubscribedTo;
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "subscription", cascade = CascadeType.ALL)
	private Technology technologyForSubscription;
	
	public long getRefId() {
		return refId;
	}

	public void setRefId(long refId) {
		this.refId = refId;
	}

	public List<User> getTechnologiesSubscribedTo() {
		return technologiesSubscribedTo;
	}

	public void setTechnologiesSubscribedTo(List<User> technologiesSubscribedTo) {
		this.technologiesSubscribedTo = technologiesSubscribedTo;
	}

	public Technology getTechnologyForSubscription() {
		return technologyForSubscription;
	}

	public void setTechnologyForSubscription(Technology technologyForSubscription) {
		this.technologyForSubscription = technologyForSubscription;
	}
}
