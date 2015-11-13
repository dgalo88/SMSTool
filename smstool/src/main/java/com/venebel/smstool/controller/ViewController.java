package com.venebel.smstool.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewController {

	@RequestMapping(value="/index")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) //
			throws ServletException, IOException {

		return new ModelAndView("index");

	}

	@RequestMapping(value="/test/{page}")
	public ModelAndView test(HttpServletRequest request, HttpServletResponse response, //
			@PathVariable String page) throws ServletException, IOException {

		System.out.println("Redirect to " + page + ".jsp");

		return new ModelAndView(page);

	}

}
