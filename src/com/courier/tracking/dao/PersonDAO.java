package com.courier.tracking.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cinergix.mapper.ObjectMapper;
import com.courier.tracking.model.Person;

@Repository
public class PersonDAO extends AbstractDAO {

	public String addPerson( Person person ){
		
		try{
			
			if( getPerson( person.getSsn() ) != null ){
				return "There is already a person exist with this ssn.";
			}
			
			Object[] objs = new Object[]{ person.getSsn(), person.getfName(), person.getlName(), person.getStreet(),
					person.getCity(), person.getCountry(), person.getPostalCode() };
			String sql = "INSERT INTO person ( ssn, f_name, l_name, street, city, country, postal_code ) VALUES ( ?, ?, ?, ?, ?, ?, ? )";
			int success = getJdbcTemplate().update( sql, objs );
			
		} catch( Exception e ) {
			return "Something went wrong when creating user. Please try again with proper values";
		}
		return "Person is Successfully added";
	}
	
	public Person getPerson( String ssn ){
		
		String sql = "SELECT * FROM person WHERE ssn = ?";
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try{
			conn = this.getConnection();
			stmt = conn.prepareStatement( sql );
			stmt.setString( 1, ssn );
			rs = stmt.executeQuery();
			
			ObjectMapper<Person> om = new ObjectMapper<Person>();
			List<Person> personList = om.mapResultSetToObject( rs, Person.class );
			if( personList != null && personList.size() > 0 ){
				return personList.get( 0 );
			} else {
				return null;
			}
		} catch( SQLException e ){
			
			e.printStackTrace();
			
		}finally {
			try{
				
				rs.close();
				stmt.close();
				conn.close();
				
			}catch( SQLException ex ){
				ex.printStackTrace();
			}
		}
		return null;
	}
}
