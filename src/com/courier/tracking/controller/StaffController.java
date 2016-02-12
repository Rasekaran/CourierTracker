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
import com.courier.tracking.model.Staff;
import com.courier.tracking.service.PersonService;
import com.courier.tracking.service.StaffService;

@Controller
@CrossOrigin( allowedHeaders="*", origins="*", value="*", methods={RequestMethod.GET, RequestMethod.POST} )
@RequestMapping("/staff")
public class StaffController {

	@Autowired
	private StaffService staffService;
	
	
	@RequestMapping(value = "/login/create", method = RequestMethod.POST, produces = "application/json" )
	public @ResponseBody String createLogin( @RequestBody Staff staff ){
		
		return staffService.createStaffLogin( staff );
		
	}
	
	@RequestMapping(value = "/login/{username}", method = RequestMethod.GET, produces = "application/json" )
	public @ResponseBody Staff getStaffLogin( @PathVariable String username ){
		
		return staffService.getStaffLogin( username );
		
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST, produces = "application/json" )
	public @ResponseBody String createStaff( @RequestBody Staff staff ){
		
		return staffService.createStaff( staff );
		
	}
	
	@RequestMapping(value = "/{ssn}", method = RequestMethod.GET, produces = "application/json" )
	public @ResponseBody Staff getStaff( @PathVariable String ssn ){
		
		return staffService.getStaff( ssn );
		
	}
}