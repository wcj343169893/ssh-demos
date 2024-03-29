package com.ssh.demo.entity;

// Generated 2012-3-7 10:12:46 by Hibernate Tools 3.2.4.GA

import java.util.Date;

/**
 * Blog generated by hbm2java
 */
public class Blog implements java.io.Serializable {

	private Integer id;
	private String title;
	private String description;
	private Date adTime;

	public Blog() {
	}

	public Blog(String title) {
		this.title = title;
	}

	public Blog(String title, String description, Date adTime) {
		this.title = title;
		this.description = description;
		this.adTime = adTime;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getAdTime() {
		return this.adTime;
	}

	public void setAdTime(Date adTime) {
		this.adTime = adTime;
	}

}
