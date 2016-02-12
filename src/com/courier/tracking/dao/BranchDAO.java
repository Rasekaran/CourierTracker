package com.courier.tracking.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cinergix.mapper.ObjectMapper;
import com.courier.tracking.model.Branch;
import com.courier.tracking.model.Person;

@Repository
public class BranchDAO extends AbstractDAO {

	public String addBranch( Branch branch ) {
		
		try{
			
			Object[] objs = new Object[]{ branch.getStreet(), branch.getCity(), branch.getCountry(), branch.getPostalCode() };
			String sql = "INSERT INTO branch ( street, city, country, postal_code ) VALUES ( ?, ?, ?, ? )";
			int success = getJdbcTemplate().update( sql, objs );
			
		} catch( Exception e ) {
			return "Something went wrong when creating branch. Please try again with proper values";
		}
		return "Branch is Successfully added";
	}
	
	public Branch getBranch( int branchID ){
		
		String sql = "SELECT * FROM branch WHERE branch_id = ?";
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try{
			conn = this.getConnection();
			stmt = conn.prepareStatement( sql );
			stmt.setInt( 1, branchID );
			rs = stmt.executeQuery();
			
			ObjectMapper<Branch> om = new ObjectMapper<Branch>();
			List<Branch> branchList = om.mapResultSetToObject( rs, Branch.class );
			if( branchList != null && branchList.size() > 0 ){
				return branchList.get( 0 );
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
