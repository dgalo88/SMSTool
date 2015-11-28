package com.venebel.smstool.model;

import java.util.ArrayList;

import com.venebel.smstool.dummy.Dummy;

public class LoadSurvey {
	
	private ArrayList<Survey> listSurveys;
	public LoadSurvey() {
		
		listSurveys=Dummy.getSurveys();
	}
	
	public ArrayList<Survey> getListSurveys() {
		return listSurveys;
	}
	
	public void setListSurveys(ArrayList<Survey> listSurveys) {
		this.listSurveys = listSurveys;
	}

}
