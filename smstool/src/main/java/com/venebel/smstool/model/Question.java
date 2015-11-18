package com.venebel.smstool.model;

public class Question {
	private long id;
	private String description;
	
	public Question(long id,String description) {
		this.setId(id);
		this.setDescription(description);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
