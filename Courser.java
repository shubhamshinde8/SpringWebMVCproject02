package com.shubhamit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Courser {

	@GetMapping("/courses")
	public ModelAndView getCoursesData() {
		ModelAndView model=new ModelAndView();
		model.addObject("msg", "welcome to courses portal");
		model.setViewName("courses");
		return model;
	}
}
