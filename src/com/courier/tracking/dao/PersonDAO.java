package com.courier.tracking.dao;

import com.courier.tracking.model.Person;

public class PersonDAO extends AbstractDAO {

	public Boolean addPerson( Person person ){
		
		String sql = "";
		return updateData( sql );
	}
}
