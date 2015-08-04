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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table( name = "technology")
public class Technology {
	
	@Id
	@Column(name = "ref_id")
	@GeneratedValue(strategy=GenerationType.AUTO)  
	private long refId;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "technologyRelatedTo")
	private List<Article> relatedArticles;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "technologyOrganizedFor")
	private List<Event> eventsForTechnology;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "team_technology", joinColumns = { 
			@JoinColumn(name = "team_ref_id", nullable = false, updatable = false) }, 
			inverseJoinColumns = { @JoinColumn(name = "technology_ref_id", 
					nullable = false, updatable = false) })
	private List<Team> teamsUsingTechnology;

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "technologiesSubscribedTo")
	private List<User> usersSubscribedToTechnology;

	public long getRefId() {
		return refId;
	}
	public void setRefId(long refId) {
		this.refId = refId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Article> getRelatedArticles() {
		return relatedArticles;
	}
	public void setRelatedArticles(List<Article> relatedArticles) {
		this.relatedArticles = relatedArticles;
	}
	public List<Event> getEventsForTechnology() {
		return eventsForTechnology;
	}
	public void setEventsForTechnology(List<Event> eventsForTechnology) {
		this.eventsForTechnology = eventsForTechnology;
	}
	public List<Team> getTeamsUsingTechnology() {
		return teamsUsingTechnology;
	}
	public void setTeamsUsingTechnology(List<Team> teamsUsingTechnology) {
		this.teamsUsingTechnology = teamsUsingTechnology;
	}
}
