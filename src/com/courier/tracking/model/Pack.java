package com.courier.tracking.model;

import com.cinergix.mapper.annotation.ResultField;
import com.cinergix.mapper.annotation.ResultMapped;

@ResultMapped
public class Pack {

	@ResultField( "package_id" )
	private int id;
	@ResultField( "type" )
	private String type;
	@ResultField( "weight" )
	private double weight;
	@ResultField( "cost" )
	private double cost;
	@ResultField( "order_id" )
	private double orderID;
	private Order order;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public double getOrderID() {
		return orderID;
	}
	public void setOrderID(double orderID) {
		this.orderID = orderID;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
	
}
