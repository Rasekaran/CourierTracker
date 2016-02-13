package com.courier.tracking.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.courier.tracking.model.Order;
import com.courier.tracking.model.Person;
import com.courier.tracking.service.OrderService;

@RestController
@CrossOrigin( allowedHeaders="*", origins="*", value="*", methods={RequestMethod.GET, RequestMethod.POST} )
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@RequestMapping(value = "/create", method = RequestMethod.POST, produces = "application/json" )
	public @ResponseBody String createOrder( @RequestBody Order order ){
		
		order.setDelivered( false );
		order.setPackDate( new Date() );
		return orderService.createOrder( order );
		
	}
	
	@RequestMapping(value = "/{orderID}", method = RequestMethod.GET, produces = "application/json" )
	public @ResponseBody Order getOrder( @PathVariable int orderID ){
		
		return orderService.getOrder( orderID );
		
	}
	
	@RequestMapping(value = "/sender/{senderSsn}", method = RequestMethod.GET, produces = "application/json" )
	public @ResponseBody List<Order> getOrderBySender( @PathVariable String senderSsn ){
		
		return orderService.getOrdersBySender( senderSsn );
		
	}
	
	@RequestMapping(value = "/receiver/{receiverSsn}", method = RequestMethod.GET, produces = "application/json" )
	public @ResponseBody List<Order> getOrderByReceiver( @PathVariable String receiverSsn ){
		
		return orderService.getOrdersByReceiver( receiverSsn );
		
	}
	
	@RequestMapping(value = "/location/update", method = RequestMethod.POST, produces = "application/json" )
	public @ResponseBody String updateOrderCurrentLocation( @RequestBody Order order ){
		
		return orderService.updateCurrentLocation( order );
		
	}
}
