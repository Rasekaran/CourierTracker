package com.courier.tracking.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cinergix.mapper.ObjectMapper;
import com.courier.tracking.model.Branch;
import com.courier.tracking.model.Pack;

@Repository
public class PackDAO extends AbstractDAO {

	public String addPack( Pack pack ){
		
		try{
			
			Object[] objs = new Object[]{ pack.getType(), pack.getWeight(), pack.getCost(), pack.getOrderID() };
			String sql = "INSERT INTO package ( type, weight, cost, order_id ) VALUES ( ?, ?, ?, ? )";
			int success = getJdbcTemplate().update( sql, objs );
			
		} catch( Exception e ) {
			return "Something went wrong when creating package. Please try again with proper values";
		}
		return "Package is Successfully added";
	}
	
	public Pack getPack( int packID ){
		
		String sql = "SELECT * FROM package WHERE package_id = ?";
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try{
			conn = this.getConnection();
			stmt = conn.prepareStatement( sql );
			stmt.setInt( 1, packID );
			rs = stmt.executeQuery();
			
			ObjectMapper<Pack> om = new ObjectMapper<Pack>();
			List<Pack> packList = om.mapResultSetToObject( rs, Pack.class );
			if( packList != null && packList.size() > 0 ){
				return packList.get( 0 );
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
	
	public List<Pack> getPackForOrder( int orderID ){
		
		String sql = "SELECT * FROM package WHERE order_id = ?";
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try{
			conn = this.getConnection();
			stmt = conn.prepareStatement( sql );
			stmt.setInt( 1, orderID );
			rs = stmt.executeQuery();
			
			ObjectMapper<Pack> om = new ObjectMapper<Pack>();
			List<Pack> packList = om.mapResultSetToObject( rs, Pack.class );
			return packList;
			
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
