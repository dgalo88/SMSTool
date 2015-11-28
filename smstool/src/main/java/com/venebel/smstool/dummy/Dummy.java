package com.venebel.smstool.dummy;

import java.util.ArrayList;

import com.venebel.smstool.model.Question;
import com.venebel.smstool.model.Subcategory;
import com.venebel.smstool.model.Survey;

public class Dummy {

	public static  ArrayList<Survey> getSurveys() {
		ArrayList<Survey> listSurveys=new ArrayList<Survey>();
		Survey survey=new Survey(1, "smstool.survey.learning");
		ArrayList<Subcategory> listSubcategorys=new ArrayList<Subcategory>();
		
		Subcategory subcategory=new Subcategory(1, "smstool.survey.learning.motivation");
		
		ArrayList<Question> listQuestions=new ArrayList<Question>();
		listQuestions.add(new Question(1, "smstool.survey.learning.motivation.question_1"));
		listQuestions.add(new Question(2, "smstool.survey.learning.motivation.question_2"));
		listQuestions.add(new Question(3, "smstool.survey.learning.motivation.question_3"));
		listQuestions.add(new Question(4, "smstool.survey.learning.motivation.question_4"));
		listQuestions.add(new Question(5, "smstool.survey.learning.motivation.question_5"));
		listQuestions.add(new Question(6, "smstool.survey.learning.motivation.question_6"));
		listQuestions.add(new Question(7, "smstool.survey.learning.motivation.question_7"));
		subcategory.setListQuestions(listQuestions);
		listSubcategorys.add(subcategory);
		
		subcategory=new Subcategory(2, "smstool.survey.learning.independence");
		listQuestions=new ArrayList<Question>();
		listQuestions.add(new Question(1, "smstool.survey.learning.independence.question_1"));
		listQuestions.add(new Question(1, "smstool.survey.learning.independence.question_2"));
		listQuestions.add(new Question(1, "smstool.survey.learning.independence.question_3"));
		listQuestions.add(new Question(1, "smstool.survey.learning.independence.question_4"));
		listQuestions.add(new Question(1, "smstool.survey.learning.independence.question_5"));
		listQuestions.add(new Question(1, "smstool.survey.learning.independence.question_6"));
		subcategory.setListQuestions(listQuestions);
		listSubcategorys.add(subcategory);

		subcategory=new Subcategory(3, "smstool.survey.learning.responsibility");
		listQuestions=new ArrayList<Question>();
		listQuestions.add(new Question(1, "smstool.survey.learning.responsibility.question_1"));
		listQuestions.add(new Question(1, "smstool.survey.learning.responsibility.question_2"));
		listQuestions.add(new Question(1, "smstool.survey.learning.responsibility.question_3"));
		listQuestions.add(new Question(1, "smstool.survey.learning.responsibility.question_4"));
		listQuestions.add(new Question(1, "smstool.survey.learning.responsibility.question_5"));
		listQuestions.add(new Question(1, "smstool.survey.learning.responsibility.question_6"));
		listQuestions.add(new Question(1, "smstool.survey.learning.responsibility.question_7"));
		subcategory.setListQuestions(listQuestions);
		listSubcategorys.add(subcategory);

		subcategory=new Subcategory(4, "smstool.survey.learning.participation");
		listQuestions=new ArrayList<Question>();
		listQuestions.add(new Question(1, "smstool.survey.learning.participation.question_1"));
		listQuestions.add(new Question(1, "smstool.survey.learning.participation.question_2"));
		listQuestions.add(new Question(1, "smstool.survey.learning.participation.question_3"));
		listQuestions.add(new Question(1, "smstool.survey.learning.participation.question_4"));
		subcategory.setListQuestions(listQuestions);
		listSubcategorys.add(subcategory);

		subcategory=new Subcategory(5, "smstool.survey.learning.study_skills");
		listQuestions=new ArrayList<Question>();
		listQuestions.add(new Question(1, "smstool.survey.learning.study_skills.question_1"));
		listQuestions.add(new Question(1, "smstool.survey.learning.study_skills.question_2"));
		listQuestions.add(new Question(1, "smstool.survey.learning.study_skills.question_3"));
		listQuestions.add(new Question(1, "smstool.survey.learning.study_skills.question_4"));
		listQuestions.add(new Question(1, "smstool.survey.learning.study_skills.question_5"));
		listQuestions.add(new Question(1, "smstool.survey.learning.study_skills.question_6"));
		listQuestions.add(new Question(1, "smstool.survey.learning.study_skills.question_7"));
		subcategory.setListQuestions(listQuestions);
		listSubcategorys.add(subcategory);

		subcategory=new Subcategory(6, "smstool.survey.learning.planning");
		listQuestions=new ArrayList<Question>();
		listQuestions.add(new Question(1, "smstool.survey.learning.planning.question_1"));
		listQuestions.add(new Question(1, "smstool.survey.learning.planning.question_2"));
		listQuestions.add(new Question(1, "smstool.survey.learning.planning.question_3"));
		listQuestions.add(new Question(1, "smstool.survey.learning.planning.question_4"));
		listQuestions.add(new Question(1, "smstool.survey.learning.planning.question_5"));
		listQuestions.add(new Question(1, "smstool.survey.learning.planning.question_6"));
		subcategory.setListQuestions(listQuestions);
		listSubcategorys.add(subcategory);

		survey.setListSubcategorys(listSubcategorys);
		listSurveys.add(survey);
		
		//----------------------------------------

		survey=new Survey(1, "smstool.survey.social");
		listSubcategorys=new ArrayList<Subcategory>();

		subcategory=new Subcategory(7, "smstool.survey.social.situational_awareness");
		listQuestions=new ArrayList<Question>();
		listQuestions.add(new Question(1, "smstool.survey.social.situational_awareness.question_1"));
		listQuestions.add(new Question(1, "smstool.survey.social.situational_awareness.question_2"));
		listQuestions.add(new Question(1, "smstool.survey.social.situational_awareness.question_3"));
		listQuestions.add(new Question(1, "smstool.survey.social.situational_awareness.question_4"));
		listQuestions.add(new Question(1, "smstool.survey.social.situational_awareness.question_5"));
		listQuestions.add(new Question(1, "smstool.survey.social.situational_awareness.question_6"));
		listQuestions.add(new Question(1, "smstool.survey.social.situational_awareness.question_7"));
		subcategory.setListQuestions(listQuestions);
		listSubcategorys.add(subcategory);
		
		subcategory=new Subcategory(8, "smstool.survey.social.cooperation");
		listQuestions=new ArrayList<Question>();
		listQuestions.add(new Question(1, "smstool.survey.social.cooperation.question_1"));
		listQuestions.add(new Question(1, "smstool.survey.social.cooperation.question_2"));
		listQuestions.add(new Question(1, "smstool.survey.social.cooperation.question_3"));
		listQuestions.add(new Question(1, "smstool.survey.social.cooperation.question_4"));
		listQuestions.add(new Question(1, "smstool.survey.social.cooperation.question_5"));
		listQuestions.add(new Question(1, "smstool.survey.social.cooperation.question_6"));
		subcategory.setListQuestions(listQuestions);
		listSubcategorys.add(subcategory);

		subcategory=new Subcategory(9, "smstool.survey.social.tolerance");
		listQuestions=new ArrayList<Question>();
		listQuestions.add(new Question(1, "smstool.survey.social.tolerance.question_1"));
		listQuestions.add(new Question(1, "smstool.survey.social.tolerance.question_2"));
		listQuestions.add(new Question(1, "smstool.survey.social.tolerance.question_3"));
		listQuestions.add(new Question(1, "smstool.survey.social.tolerance.question_4"));
		subcategory.setListQuestions(listQuestions);
		listSubcategorys.add(subcategory);

		subcategory=new Subcategory(10, "smstool.survey.social.relations_teachers");
		listQuestions=new ArrayList<Question>();
		listQuestions.add(new Question(1, "smstool.survey.social.relations_teachers.question_1"));
		listQuestions.add(new Question(1, "smstool.survey.social.relations_teachers.question_2"));
		listQuestions.add(new Question(1, "smstool.survey.social.relations_teachers.question_3"));
		listQuestions.add(new Question(1, "smstool.survey.social.relations_teachers.question_4"));
		listQuestions.add(new Question(1, "smstool.survey.social.relations_teachers.question_5"));
		subcategory.setListQuestions(listQuestions);
		listSubcategorys.add(subcategory);

		subcategory=new Subcategory(11, "smstool.survey.social.relations_students");
		listQuestions=new ArrayList<Question>();
		listQuestions.add(new Question(1, "smstool.survey.social.relations_students.question_1"));
		listQuestions.add(new Question(1, "smstool.survey.social.relations_students.question_2"));
		listQuestions.add(new Question(1, "smstool.survey.social.relations_students.question_3"));
		listQuestions.add(new Question(1, "smstool.survey.social.relations_students.question_4"));
		subcategory.setListQuestions(listQuestions);
		listSubcategorys.add(subcategory);

		subcategory=new Subcategory(12, "smstool.survey.social.participations");
		listQuestions=new ArrayList<Question>();
		listQuestions.add(new Question(1, "smstool.survey.social.participations.question_1"));
		listQuestions.add(new Question(1, "smstool.survey.social.participations.question_2"));
		subcategory.setListQuestions(listQuestions);
		listSubcategorys.add(subcategory);

		survey.setListSubcategorys(listSubcategorys);
		listSurveys.add(survey);
		
		//----------------------------------------

		survey=new Survey(1, "smstool.survey.personal_emotional");
		listSubcategorys=new ArrayList<Subcategory>();

		subcategory=new Subcategory(13, "smstool.survey.persona_emotional.self_awareness");
		listQuestions=new ArrayList<Question>();
		listQuestions.add(new Question(1, "smstool.survey.persona_emotional.self_awareness.question_1"));
		listQuestions.add(new Question(1, "smstool.survey.persona_emotional.self_awareness.question_2"));
		listQuestions.add(new Question(1, "smstool.survey.persona_emotional.self_awareness.question_3"));
		listQuestions.add(new Question(1, "smstool.survey.persona_emotional.self_awareness.question_4"));
		listQuestions.add(new Question(1, "smstool.survey.persona_emotional.self_awareness.question_5"));
		listQuestions.add(new Question(1, "smstool.survey.persona_emotional.self_awareness.question_6"));
		listQuestions.add(new Question(1, "smstool.survey.persona_emotional.self_awareness.question_7"));
		subcategory.setListQuestions(listQuestions);
		listSubcategorys.add(subcategory);

		subcategory=new Subcategory(14, "smstool.survey.persona_emotional.self_confidence");
		listQuestions=new ArrayList<Question>();
		listQuestions.add(new Question(1, "smstool.survey.persona_emotional.self_confidence.question_1"));
		listQuestions.add(new Question(1, "smstool.survey.persona_emotional.self_confidence.question_2"));
		listQuestions.add(new Question(1, "smstool.survey.persona_emotional.self_confidence.question_3"));
		listQuestions.add(new Question(1, "smstool.survey.persona_emotional.self_confidence.question_4"));
		listQuestions.add(new Question(1, "smstool.survey.persona_emotional.self_confidence.question_5"));
		listQuestions.add(new Question(1, "smstool.survey.persona_emotional.self_confidence.question_6"));
		subcategory.setListQuestions(listQuestions);
		listSubcategorys.add(subcategory);
		
		subcategory=new Subcategory(15, "smstool.survey.persona_emotional.resiliance");
		listQuestions=new ArrayList<Question>();
		listQuestions.add(new Question(1, "smstool.survey.persona_emotional.resiliance.question_1"));
		listQuestions.add(new Question(1, "smstool.survey.persona_emotional.resiliance.question_2"));
		listQuestions.add(new Question(1, "smstool.survey.persona_emotional.resiliance.question_3"));
		listQuestions.add(new Question(1, "smstool.survey.persona_emotional.resiliance.question_4"));
		listQuestions.add(new Question(1, "smstool.survey.persona_emotional.resiliance.question_5"));
		subcategory.setListQuestions(listQuestions);
		listSubcategorys.add(subcategory);
		
		subcategory=new Subcategory(16, "smstool.survey.persona_emotional.open_minded");
		listQuestions=new ArrayList<Question>();
		listQuestions.add(new Question(1, "smstool.survey.persona_emotional.open_minded.question_1"));
		listQuestions.add(new Question(1, "smstool.survey.persona_emotional.open_minded.question_2"));
		listQuestions.add(new Question(1, "smstool.survey.persona_emotional.open_minded.question_3"));
		listQuestions.add(new Question(1, "smstool.survey.persona_emotional.open_minded.question_4"));
		subcategory.setListQuestions(listQuestions);
		listSubcategorys.add(subcategory);

		subcategory=new Subcategory(12, "smstool.survey.persona_emotional.concentration");
		listQuestions=new ArrayList<Question>();
		listQuestions.add(new Question(1, "smstool.survey.persona_emotional.concentration.question_1"));
		listQuestions.add(new Question(1, "smstool.survey.persona_emotional.concentration.question_2"));
		listQuestions.add(new Question(1, "smstool.survey.persona_emotional.concentration.question_3"));
		subcategory.setListQuestions(listQuestions);
		listSubcategorys.add(subcategory);
		
		survey.setListSubcategorys(listSubcategorys);
		listSurveys.add(survey);
		
		return listSurveys;
	}
	
	public static  ArrayList<Survey> getSurveysComplete() {
		ArrayList<Survey> listSurveys=new ArrayList<Survey>();
		Survey survey=new Survey(1, "smstool.survey.learning");
		ArrayList<Subcategory> listSubcategorys=new ArrayList<Subcategory>();
		
		Subcategory subcategory=new Subcategory(1, "smstool.survey.learning.motivation");
		
		ArrayList<Question> listQuestions=new ArrayList<Question>();
		listQuestions.add(new Question(1, "smstool.survey.learning.motivation.question_1"));
		listQuestions.add(new Question(2, "smstool.survey.learning.motivation.question_2"));

		listQuestions.add(new Question(7, "smstool.survey.learning.motivation.question_7"));
		subcategory.setListQuestions(listQuestions);
		listSubcategorys.add(subcategory);
		

		subcategory=new Subcategory(3, "smstool.survey.learning.responsibility");
		listQuestions=new ArrayList<Question>();
		listQuestions.add(new Question(1, "smstool.survey.learning.responsibility.question_1"));
		listQuestions.add(new Question(1, "smstool.survey.learning.responsibility.question_2"));
		listQuestions.add(new Question(1, "smstool.survey.learning.responsibility.question_4"));
		listQuestions.add(new Question(1, "smstool.survey.learning.responsibility.question_7"));
		subcategory.setListQuestions(listQuestions);
		listSubcategorys.add(subcategory);

		subcategory=new Subcategory(4, "smstool.survey.learning.participation");
		listQuestions=new ArrayList<Question>();
		listQuestions.add(new Question(1, "smstool.survey.learning.participation.question_2"));
		listQuestions.add(new Question(1, "smstool.survey.learning.participation.question_4"));
		subcategory.setListQuestions(listQuestions);
		listSubcategorys.add(subcategory);

		subcategory=new Subcategory(5, "smstool.survey.learning.study_skills");
		listQuestions=new ArrayList<Question>();
		listQuestions.add(new Question(1, "smstool.survey.learning.study_skills.question_5"));
		listQuestions.add(new Question(1, "smstool.survey.learning.study_skills.question_6"));
		listQuestions.add(new Question(1, "smstool.survey.learning.study_skills.question_7"));
		subcategory.setListQuestions(listQuestions);
		listSubcategorys.add(subcategory);

		survey.setListSubcategorys(listSubcategorys);
		listSurveys.add(survey);
		
		//----------------------------------------

		survey=new Survey(1, "smstool.survey.social");
		listSubcategorys=new ArrayList<Subcategory>();

		subcategory=new Subcategory(7, "smstool.survey.social.situational_awareness");
		listQuestions=new ArrayList<Question>();
		listQuestions.add(new Question(1, "smstool.survey.social.situational_awareness.question_1"));
		listQuestions.add(new Question(1, "smstool.survey.social.situational_awareness.question_2"));
		subcategory.setListQuestions(listQuestions);
		listSubcategorys.add(subcategory);

		subcategory=new Subcategory(10, "smstool.survey.social.relations_teachers");
		listQuestions=new ArrayList<Question>();
		listQuestions.add(new Question(1, "smstool.survey.social.relations_teachers.question_4"));
		listQuestions.add(new Question(1, "smstool.survey.social.relations_teachers.question_5"));
		subcategory.setListQuestions(listQuestions);
		listSubcategorys.add(subcategory);

		subcategory=new Subcategory(11, "smstool.survey.social.relations_students");
		listQuestions=new ArrayList<Question>();
		listQuestions.add(new Question(1, "smstool.survey.social.relations_students.question_1"));
		listQuestions.add(new Question(1, "smstool.survey.social.relations_students.question_4"));
		subcategory.setListQuestions(listQuestions);
		listSubcategorys.add(subcategory);

		survey.setListSubcategorys(listSubcategorys);
		listSurveys.add(survey);
		
		//----------------------------------------

		survey=new Survey(1, "smstool.survey.personal_emotional");
		listSubcategorys=new ArrayList<Subcategory>();

		subcategory=new Subcategory(13, "smstool.survey.persona_emotional.self_awareness");
		listQuestions=new ArrayList<Question>();
		listQuestions.add(new Question(1, "smstool.survey.persona_emotional.self_awareness.question_1"));
		listQuestions.add(new Question(1, "smstool.survey.persona_emotional.self_awareness.question_3"));
		listQuestions.add(new Question(1, "smstool.survey.persona_emotional.self_awareness.question_7"));
		subcategory.setListQuestions(listQuestions);
		listSubcategorys.add(subcategory);

		subcategory=new Subcategory(12, "smstool.survey.persona_emotional.concentration");
		listQuestions=new ArrayList<Question>();
		listQuestions.add(new Question(1, "smstool.survey.persona_emotional.concentration.question_1"));
		listQuestions.add(new Question(1, "smstool.survey.persona_emotional.concentration.question_2"));
		listQuestions.add(new Question(1, "smstool.survey.persona_emotional.concentration.question_3"));
		subcategory.setListQuestions(listQuestions);
		listSubcategorys.add(subcategory);
		
		survey.setListSubcategorys(listSubcategorys);
		listSurveys.add(survey);
		
		return listSurveys;
	}
	
}
