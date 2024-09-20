package com.shubhamit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Greet {

	@GetMapping("/greet")
	public ModelAndView getWish() {
		ModelAndView model=new ModelAndView();
		model.addObject("msg", "thank you for visiting us");
	    model.setViewName("greet");
	    return model;
	}
}
