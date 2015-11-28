package com.venebel.smstool.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.venebel.smstool.dummy.Dummy;
import com.venebel.smstool.model.LoadSurvey;

@Controller
public class SurveyController {
	
	@RequestMapping(value="/createSurvey")
	public ModelAndView createSurvey(HttpServletRequest request, HttpServletResponse response) //
			throws ServletException, IOException {
		LoadSurvey loadSurvey=new LoadSurvey();
		request.setAttribute("loadSurvey", loadSurvey);
		
//		System.out.println(".................... Bíennnnn");

		return new ModelAndView("createSurvey");

	}
	
	@RequestMapping(value="/editSurvey")
	public ModelAndView editSurvey(HttpServletRequest request, HttpServletResponse response) //
			throws ServletException, IOException {
		LoadSurvey loadSurvey=new LoadSurvey();
		request.setAttribute("loadSurvey", loadSurvey);
		HashMap<String, String>  selectedQuestions=new HashMap<String, String>();
		request.setAttribute("selectedQuestions", selectedQuestions);
//		System.out.println(".................... Bíennnnn");

		return new ModelAndView("createSurvey");

	}
	
	@RequestMapping(value="/openSurvey")
	public ModelAndView openSurvey(HttpServletRequest request, HttpServletResponse response) //
			throws ServletException, IOException {
		
		
		return new ModelAndView("openSurvey");

	}
	
	@RequestMapping(value="/saveSurvey")
	public ModelAndView saveSurvey(HttpServletRequest request, HttpServletResponse response) //
			throws ServletException, IOException {
		System.out.println(".................... Bíennnnn, esta pasando por saveSurvey");
		System.out.println("..."+getSurveyList(request).size());
		return new ModelAndView("createSurvey");

	}
	
	@RequestMapping(value="/completeSurvey")
	public ModelAndView completeSurvey(HttpServletRequest request, HttpServletResponse response) //
			throws ServletException, IOException {
//		System.out.println(".................... Bíennnnn, esta pasando por saveSurvey");
//		System.out.println("..."+getSurveyList(request).size());
		request.setAttribute("loadSurvey", Dummy.getSurveysComplete());
		return new ModelAndView("completeSurvey");

	}
	
	private ArrayList<String> getSurveyList(HttpServletRequest request){
		ArrayList<String> suveryList=new ArrayList<String>();
		boolean flag=true;
		String questionId=null;
		int i=1;
		do {
			questionId=request.getParameter("question_checked_"+i);
			if(questionId!=null&&!questionId.trim().isEmpty()){
				suveryList.add(questionId);
			}else{
				flag=false;
			}
			i++;
			
		} while (flag);
		return suveryList;
	}
}
