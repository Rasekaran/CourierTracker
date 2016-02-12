package com.courier.tracking.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cinergix.mapper.ObjectMapper;
import com.courier.tracking.model.Person;
import com.courier.tracking.model.Staff;

@Repository
public class StaffDAO extends PersonDAO {

	public String addStaff( Staff staff ){
		
		String resultString = super.addPerson( staff );
		Person person = super.getPerson( staff.getSsn() );
		if( person == null ){
			return resultString;
		}
		
		try{
			
			if( getStaff( staff.getSsn() ) != null ){
				return "There is already a staff exist with this ssn.";
			}
			
			Object[] objs = new Object[]{ new java.sql.Date( staff.getDob().getTime() ), staff.getBranchID(), new java.sql.Date( staff.getJoinDate().getTime() ), staff.getDesignation(), staff.getSsn() };
			String sql = "INSERT INTO staff_detail ( dob, branch_id, joined_date, designation, ssn ) VALUES ( ?, ?, ?, ?, ? )";
			int success = getJdbcTemplate().update( sql, objs );
			
		} catch( Exception e ) {
			return "Something went wrong when creating Staff. Please try again with proper values";
		}
		return "Staff is Successfully added";
		
	}
	
	public Staff getStaff( int staffID ) {
		
		String sql = "SELECT p.*, s.* FROM person p INNER JOIN staff_detail s ON s.ssn = p.ssn WHERE staff_id = ?";
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try{
			conn = this.getConnection();
			stmt = conn.prepareStatement( sql );
			stmt.setInt( 1, staffID );
			rs = stmt.executeQuery();
			
			ObjectMapper<Staff> om = new ObjectMapper<Staff>();
			List<Staff> StaffList = om.mapResultSetToObject( rs, Staff.class );
			if( StaffList != null && StaffList.size() > 0 ){
				return StaffList.get( 0 );
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
	
	public Staff getStaff( String ssn ) {
		
		String sql = "SELECT p.*, s.staff_id, s.dob, s.branch_id, s.joined_date, s.designation FROM person p INNER JOIN staff_detail s ON s.ssn = p.ssn WHERE s.ssn = ?";
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try{
			conn = this.getConnection();
			stmt = conn.prepareStatement( sql );
			stmt.setString( 1, ssn );
			rs = stmt.executeQuery();
			
			ObjectMapper<Staff> om = new ObjectMapper<Staff>();
			List<Staff> StaffList = om.mapResultSetToObject( rs, Staff.class );
			if( StaffList != null && StaffList.size() > 0 ){
				return StaffList.get( 0 );
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
	
	public String addStaffLogin( Staff staff ) {
		
		Staff s = getStaff( staff.getId() );
		if( s == null ){
			return "There is no staff available in the system with this id.";
		}
		s = getStaffLogin( staff.getUsername() );
		if( s != null ) {
			return "There is another staff available in the system with this username. Please use another username";
		}
		
		try{
			
			if( getStaffLogin( staff.getId() ) != null ){
				return "There is already a staff login exist with this staffID.";
			}
			
			Object[] objs = new Object[]{ staff.getId(), staff.getUsername(), staff.getPassword(), staff.getUserRole() };
			String sql = "INSERT INTO login ( staff_id, username, password, user_role ) VALUES ( ?, ?, ?, ? )";
			int success = getJdbcTemplate().update( sql, objs );
			
		} catch( Exception e ) {
			return "Something went wrong when creating Staff. Please try again with proper values";
		}
		return "Staff is Successfully added";
	}
	
	public Staff getStaffLogin( int staffID ) {
		
		String sql = "SELECT * FROM login login WHERE staff_id = ?";
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try{
			conn = this.getConnection();
			stmt = conn.prepareStatement( sql );
			stmt.setInt( 1, staffID );
			rs = stmt.executeQuery();
			
			ObjectMapper<Staff> om = new ObjectMapper<Staff>();
			List<Staff> StaffList = om.mapResultSetToObject( rs, Staff.class );
			if( StaffList != null && StaffList.size() > 0 ){
				return StaffList.get( 0 );
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
	
	public Staff getStaffLogin( String username ) {
		
		String sql = "SELECT * FROM login WHERE username = ?";
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try{
			conn = this.getConnection();
			stmt = conn.prepareStatement( sql );
			stmt.setString( 1, username );
			rs = stmt.executeQuery();
			
			ObjectMapper<Staff> om = new ObjectMapper<Staff>();
			List<Staff> StaffList = om.mapResultSetToObject( rs, Staff.class );
			if( StaffList != null && StaffList.size() > 0 ){
				return StaffList.get( 0 );
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
