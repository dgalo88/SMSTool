package com.venebel.smstool.model;

import java.util.ArrayList;

public class LoadSurvey {
	
	private ArrayList<Survey> listSurveys;
	public LoadSurvey() {
		
		listSurveys=new ArrayList<Survey>();
		for (int i = 0; i < 3; i++) {
			Survey survey=new Survey(i, "Survey-"+i);
			ArrayList<Subcategory> listSubcategorys=new ArrayList<Subcategory>();
			for (int j = 0; j < 2; j++) {
				Subcategory subcategory=new Subcategory(j, "Subcategory-"+i+"-"+j);
				ArrayList<Question> listQuestions=new ArrayList<Question>();
				for (int j2 = 0; j2 <3; j2++) {
					listQuestions.add(new Question(j2, "Question-"+i+"-"+j+"-"+j2));
				}
				subcategory.setListQuestions(listQuestions);
				listSubcategorys.add(subcategory);
				
			}
			survey.setListSubcategorys(listSubcategorys);
			listSurveys.add(survey);
		}
	}
	
	public ArrayList<Survey> getListSurveys() {
		return listSurveys;
	}
	
	public void setListSurveys(ArrayList<Survey> listSurveys) {
		this.listSurveys = listSurveys;
	}

}
