package com.blackrock.boris.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "articles")
public class Article {

	@Id
	@Column(name="refId")
	@GeneratedValue(strategy=GenerationType.AUTO)  
	private long refId;
	@Column(name="link")
	private String link;
	@Column(name="source")
	private String source;
	@Column(name="title")
	private String title;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "technology_ref_id", nullable = false)
	private Technology technologyRelatedTo;

	public long getId() {
		return refId;
	}
	public void setId(long id) {
		this.refId = id;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
    public void setTechnologyRelatedTo(Technology technologyRelatedTo) {
        this.technologyRelatedTo = technologyRelatedTo;
    }
}
