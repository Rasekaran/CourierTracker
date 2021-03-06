package com.javacodegeeks.snippets.enterprise;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping(value = { "/", "/welcome**", "/index" }, method = RequestMethod.GET)
	public ModelAndView welcomePage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Custom Login Form");
		model.addObject("message", "This is welcome page!");
		model.setViewName("index");
		return model;

	}
	
	@RequestMapping(value = { "/branches" }, method = RequestMethod.GET)
	public ModelAndView branchesPage() {
		
		ModelAndView model = new ModelAndView();
		model.setViewName( "branches" );
		return model;

	}
	
	@RequestMapping(value = { "/orders" }, method = RequestMethod.GET)
	public ModelAndView ordersPage() {
		
		ModelAndView model = new ModelAndView();
		model.setViewName( "orders" );
		return model;

	}
	
	@RequestMapping(value = { "/customers" }, method = RequestMethod.GET)
	public ModelAndView customersPage() {
		
		ModelAndView model = new ModelAndView();
		model.setViewName( "customers" );
		return model;

	}
	
	@RequestMapping(value = { "/staffs" }, method = RequestMethod.GET)
	public ModelAndView staffsPage() {
		
		ModelAndView model = new ModelAndView();
		model.setViewName( "staffs" );
		return model;

	}
	
//	@RequestMapping({"/index", "/"})
//	public String getWelcomePage(ModelMap model) {
//		return "index";
//	}

	@RequestMapping(value = "/admin**", method = RequestMethod.GET)
	public ModelAndView adminPage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Custom Login Form");
		model.addObject("message", "This is protected page!");
		model.setViewName("admin");

		return model;

	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout) {

		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("error", "Invalid username and password!");
		}

		if (logout != null) {
			model.addObject("msg", "You've been logged out successfully.");
		}
		model.setViewName("login");

		return model;

	}
	
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
	    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    if (auth != null){    
	        new SecurityContextLogoutHandler().logout(request, response, auth);
	    }
	    return "redirect:/login?logout";//You can redirect wherever you want, but generally it's a good practice to show login screen again.
	}

}