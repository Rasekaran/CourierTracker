package com.courier.tracking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.courier.tracking.dao.BranchDAO;
import com.courier.tracking.model.Branch;

@Service
public class BranchService {

	@Autowired
	private BranchDAO branchDAO;
	
	public String createBranch( Branch branch ) {
		
		if( branch.getStreet() == null || branch.getStreet().trim() == "" ){
			return "Street cannot be empty.";
		}
		if( branch.getCity() == null || branch.getCity().trim() == "" ){
			return "City cannot be empty.";
		}
		if( branch.getCountry() == null || branch.getCountry().trim() == "" ){
			return "Country cannot be empty.";
		}
		if( branch.getPostalCode() == null || branch.getPostalCode().trim() == "" ){
			return "Postal code cannot be empty.";
		}
		
		return branchDAO.addBranch( branch );
	}
	
	public Branch getBranch( int branchID ){
		
		return branchDAO.getBranch( branchID );
	}
	
	public List<Branch> getAllBranchs( ){
		
		return branchDAO.getAllBranchs();
	}
}
