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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	
	@Transient
	private String readableDescription;
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany( mappedBy = "technologyRelatedTo")
	private List<Article> relatedArticles;
	
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany( mappedBy = "technologyOrganizedFor")
	private List<Event> eventsForTechnology;
	
	@ManyToMany(fetch = FetchType.EAGER ,cascade = CascadeType.ALL)
	@JoinTable(name = "team_technology", joinColumns = { 
			@JoinColumn(name = "technology_ref_id", nullable = false, updatable = false) },
			inverseJoinColumns = { @JoinColumn(name = "team_ref_id",
					nullable = false, updatable = false) })
	private Set<Team> teamsUsingTechnology;
	
	@LazyCollection(LazyCollectionOption.FALSE)
	@ManyToMany(mappedBy = "technologiesSubscribedTo")
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
	@JsonIgnore
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
	@JsonIgnore
	public Set<Team> getTeamsUsingTechnology() {
		return teamsUsingTechnology;
	}
	public void setTeamsUsingTechnology(Set<Team> teamsUsingTechnology) {
		this.teamsUsingTechnology = teamsUsingTechnology;
	}
	public String getReadableDescription() {
		return readableDescription;
	}
	public void setReadableDescription(String readableDescription) {
		this.readableDescription = readableDescription;
	}
}
