package com.courier.tracking.dao;

import org.springframework.stereotype.Repository;

import com.courier.tracking.model.Order;

@Repository
public class OrderDAO extends AbstractDAO {

	public String addOrder( Order order ) {

		try{
			
			Object[] objs = new Object[]{ order.getStaffID(), order.getSenderSSN(), order.getReceiverSSN(), order.getWeight(), order.getPackDate(), order.getCurrentLocation(), order.getDeliveryDate(), order.getDelivered(), order.getTotalCharges() };
			String sql = "INSERT INTO order ( staff_id, sender_ssn, receiver_ssn, weight, pack_date, curr_loc, delivery_date, delivery_status, total_charge ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ? )";
			int success = getJdbcTemplate().update( sql, objs );
			
		} catch( Exception e ) {
			return "Something went wrong when creating order. Please try again with proper values";
		}
		return "Branch is Successfully added";
	}
}
