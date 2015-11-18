package com.venebel.smstool.model;

import java.util.ArrayList;

public class Subcategory {
	private long id;
	private String description;
	private ArrayList<Question> listQuestions;
	
	public Subcategory(long id, String description) {
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

	public ArrayList<Question> getListQuestions() {
		return listQuestions;
	}

	public void setListQuestions(ArrayList<Question> listQuestions) {
		this.listQuestions = listQuestions;
	}
}
