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
}
