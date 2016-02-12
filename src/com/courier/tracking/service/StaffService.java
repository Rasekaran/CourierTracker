package com.courier.tracking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.courier.tracking.dao.StaffDAO;
import com.courier.tracking.model.Staff;

@Service
public class StaffService {

	@Autowired
	private StaffDAO staffDAO;
	
	public String createStaff( Staff staff ) {
		
		if( staff.getSsn() == null || staff.getSsn().trim() =="" ){
			return "Cannot create staff. Invalid ssn.";
		}
		return staffDAO.addStaff( staff );
	}
	
	public Staff getStaff( String ssn ){
		
		if( ssn == null || ssn.trim() =="" ){
			return null;
		}
		
		return staffDAO.getStaff( ssn );
	}
	
	public String createStaffLogin( Staff staff ){
		
		if( staff.getUsername().trim().equals( "" ) || staff.getUsername() == null ){
			return "Username of the staff should not empty";
		}
		
		if( staff.getPassword().trim().equals( "" ) || staff.getPassword() == null ){
			return "Password of the staff should not empty";
		}
		return staffDAO.addStaffLogin( staff );
	}
	
	public Staff getStaffLogin( String username ){
		
		if( username == null || username.trim().equals( "" ) ) {
			return null;
		}
		
		return staffDAO.getStaffLogin( username );
	}
}
