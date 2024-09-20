package com.shubhamit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentInfo {

	@GetMapping("/student")
	public ModelAndView getStudentData() {
		ModelAndView model=new ModelAndView();
		model.addObject("msg", "Welcome TO Student Portal");
		model.setViewName("student");
		return model;
	}
}
