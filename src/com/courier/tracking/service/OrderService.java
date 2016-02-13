package com.courier.tracking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.courier.tracking.dao.OrderDAO;
import com.courier.tracking.model.Order;

@Service
public class OrderService {

	@Autowired
	private OrderDAO orderDAO;
	public String createOrder( Order order ){
		
		return orderDAO.addOrder( order );
	}
	
	public Order getOrder( int orderID ){
		
		return orderDAO.getOrder( orderID );
	}
	
	public List<Order> getOrdersBySender( String senderSsn ){
		
		if( senderSsn == null && senderSsn.trim() == "" ) {
			return null;
		}
		return orderDAO.getOrdersBySender( senderSsn );
	}
	
	public List<Order> getOrdersByReceiver( String receiverSsn ){
		
		if( receiverSsn == null && receiverSsn.trim() == "" ) {
			return null;
		}
		return orderDAO.getOrdersByReceiver( receiverSsn );
	}
	
	public String updateCurrentLocation( Order order ) {
		
		if( order.getCurrentLocation() == null && order.getCurrentLocation().trim() == "" ) {
			return "Please give a valid location";
		}
		return orderDAO.updateCurrentLocation( order );
	}
}
