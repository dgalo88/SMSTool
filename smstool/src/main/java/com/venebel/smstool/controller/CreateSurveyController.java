package com.venebel.smstool.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CreateSurveyController {
	
	@RequestMapping(value="/createSurvey")
	public ModelAndView createSurvey(HttpServletRequest request, HttpServletResponse response) //
			throws ServletException, IOException {
//		System.out.println(".................... Bíennnnn");

		return new ModelAndView("createSurvey");

	}
}
