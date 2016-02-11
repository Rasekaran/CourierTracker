package com.courier.tracking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.courier.tracking.dao.PersonDAO;
import com.courier.tracking.model.Person;

@Service
public class PersonService {

	@Autowired
	private PersonDAO personDAO;
	public String createPerson( Person person ) {
		
		if( person.getSsn() == null || person.getSsn().trim() =="" ){
			return "Cannot create person. Invalid ssn.";
		}
		return personDAO.addPerson( person );
	}
	
	public Person getPerson( String ssn ){
		
		if( ssn == null || ssn.trim() =="" ){
			return null;
		}
		
		return personDAO.getPerson( ssn );
	}
}
