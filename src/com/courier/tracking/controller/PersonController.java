package com.courier.tracking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.courier.tracking.model.Person;
import com.courier.tracking.service.PersonService;

@Controller
@CrossOrigin( allowedHeaders="*", origins="*", value="*", methods={RequestMethod.GET, RequestMethod.POST} )
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@RequestMapping(value = "/create", method = RequestMethod.POST, produces = "application/json" )
	public @ResponseBody String createPerson( @RequestBody Person person ){
		
		return personService.createPerson( person );
		
	}
	
	@RequestMapping(value = "/{ssn}", method = RequestMethod.GET, produces = "application/json" )
	public @ResponseBody Person createPerson( @PathVariable String ssn ){
		
		return personService.getPerson( ssn );
		
	}
}
