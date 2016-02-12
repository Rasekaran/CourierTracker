package com.courier.tracking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.courier.tracking.model.Branch;
import com.courier.tracking.service.BranchService;

@Controller
@CrossOrigin( allowedHeaders="*", origins="*", value="*", methods={RequestMethod.GET, RequestMethod.POST} )
@RequestMapping("/branch")
public class BranchController {

	@Autowired
	private BranchService branchService;
	
	@RequestMapping(value = "/create", method = RequestMethod.POST, produces = "application/json" )
	public @ResponseBody String createBranch( @RequestBody Branch branch ) {
		
		return branchService.createBranch( branch );
	}
	
	@RequestMapping(value = "/{branchID}", method = RequestMethod.GET, produces = "application/json" )
	public @ResponseBody Branch getBranch( @PathVariable int branchID ){
		
		return branchService.getBranch( branchID );
	}
}
