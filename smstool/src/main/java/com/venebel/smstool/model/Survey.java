package com.venebel.smstool.model;

import java.util.ArrayList;

public class Survey {
	private long id;
	private String description;
	private ArrayList<Subcategory> listSubcategorys;
	
	public Survey(long id, String description) {
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

	public ArrayList<Subcategory> getListSubcategorys() {
		return listSubcategorys;
	}

	public void setListSubcategorys(ArrayList<Subcategory> listSubcategorys) {
		this.listSubcategorys = listSubcategorys;
	}
}
