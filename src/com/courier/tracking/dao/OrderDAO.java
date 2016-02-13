package com.courier.tracking.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cinergix.mapper.ObjectMapper;
import com.courier.tracking.model.Order;
import com.courier.tracking.model.Person;

@Repository
public class OrderDAO extends AbstractDAO {

	public String addOrder( Order order ) {

		try{
			
			Object[] objs = new Object[]{ order.getStaffID(), order.getSenderSSN(), order.getReceiverSSN(), order.getWeight(), new java.sql.Date( order.getPackDate().getTime() ), order.getCurrentLocation(), order.getDeliveryDate(), order.getDelivered(), order.getTotalCharges(), order.getType(), order.getDescription() };
			String sql = "INSERT INTO courier_order ( staff_id, sender_ssn, receiver_ssn, weight, pack_date, curr_loc, delivery_date, delivery_status, total_charge, type, description ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";
			int success = getJdbcTemplate().update( sql, objs );
			
		} catch( Exception e ) {
			e.printStackTrace();
			return "Something went wrong when creating order. Please try again with proper values";
		}
		return "Order is Successfully added";
	}
	
	public Order getOrder( int orderID ){
		
		String sql = "SELECT * FROM courier_order WHERE order_id = ?";
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try{
			conn = this.getConnection();
			stmt = conn.prepareStatement( sql );
			stmt.setInt( 1, orderID );
			rs = stmt.executeQuery();
			
			ObjectMapper<Order> om = new ObjectMapper<Order>();
			List<Order> orderList = om.mapResultSetToObject( rs, Order.class );
			if( orderList != null && orderList.size() > 0 ) {
				
				if( !orderList.get( 0 ).getDelivered() ){
					orderList.get( 0 ).setDeliveryDate( null );
				}
				return orderList.get( 0 );
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
	
	public List<Order> getOrdersBySender( String ssn ){
		
		String sql = "SELECT * FROM courier_order WHERE sender_ssn = ?";
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try{
			conn = this.getConnection();
			stmt = conn.prepareStatement( sql );
			stmt.setString( 1, ssn );
			rs = stmt.executeQuery();
			
			ObjectMapper<Order> om = new ObjectMapper<Order>();
			List<Order> orderList = om.mapResultSetToObject( rs, Order.class );
			for( Order o : orderList ){
				if( !o.getDelivered() ){
					o.setDeliveryDate( null );
				}
			}
			return orderList;
			
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
	
	public List<Order> getOrdersByReceiver( String ssn ){
		
		String sql = "SELECT * FROM courier_order WHERE receiver_ssn = ?";
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try{
			conn = this.getConnection();
			stmt = conn.prepareStatement( sql );
			stmt.setString( 1, ssn );
			rs = stmt.executeQuery();
			
			ObjectMapper<Order> om = new ObjectMapper<Order>();
			List<Order> orderList = om.mapResultSetToObject( rs, Order.class );
			for( Order o : orderList ){
				if( !o.getDelivered() ){
					o.setDeliveryDate( null );
				}
			}
			return orderList;
			
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
	
	public String updateCurrentLocation( Order order ) {
		
		try{
			
			Object[] objs = new Object[]{ order.getCurrentLocation(), order.getId() };
			String sql = "UPDATE courier_order SET curr_loc = ? WHERE order_id = ?";
			int success = getJdbcTemplate().update( sql, objs );
			
		} catch( Exception e ) {
			return "Something went wrong when updating current location. Please try again with proper values";
		}
		return "Current location is Successfully added";
	}
}
