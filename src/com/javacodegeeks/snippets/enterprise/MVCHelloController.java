package com.javacodegeeks.snippets.enterprise;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MVCHelloController {

//	@RequestMapping({"/index", "/"})
//	public String getWelcomePage(ModelMap model) {
//		return "index";
//	}
	 
	@RequestMapping( value= "hello1", method = RequestMethod.GET)
	public String printHello(ModelMap model) {
		model.addAttribute("message", "Hello Spring MVC Framework!");
		return "hello1";
	}
	
//	@RequestMapping( value= "login", method = RequestMethod.GET)
//	public String login(ModelMap model) {
//		model.addAttribute("message", "Hello Spring MVC Framework!");
//		return "login";
//	}
	
}
