package com.courier.tracking.model;

import java.util.Date;

import com.cinergix.mapper.annotation.ResultField;
import com.cinergix.mapper.annotation.ResultMapped;

@ResultMapped
public class Order {

	@ResultField( "order_id" )
	private int id;
	@ResultField( "staff_id" )
	private int staffID;
	@ResultField( "sender_ssn" )
	private String senderSSN;
	private Person sender;
	@ResultField( "receiver_ssn" )
	private String receiverSSN;
	private String receiver;
	@ResultField( "weight" )
	private double weight;
	@ResultField( "pack_date" )
	private Date packDate;
	@ResultField( "curr_loc" )
	private String currentLocation;
	@ResultField( "last_update" )
	private String lastUpdate;
	@ResultField( "delivery_date" )
	private Date deliveryDate;
	@ResultField( "delivery_status" )
	private Boolean delivered;
	@ResultField( "total_charge" )
	private double totalCharges;
	@ResultField( "type" )
	private String type;
	@ResultField( "description" )
	private String description;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStaffID() {
		return staffID;
	}
	public void setStaffID(int staffID) {
		this.staffID = staffID;
	}
	public String getSenderSSN() {
		return senderSSN;
	}
	public void setSenderSSN(String senderSSN) {
		this.senderSSN = senderSSN;
	}
	public Person getSender() {
		return sender;
	}
	public void setSender(Person sender) {
		this.sender = sender;
	}
	public String getReceiverSSN() {
		return receiverSSN;
	}
	public void setReceiverSSN(String receiverSSN) {
		this.receiverSSN = receiverSSN;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public Date getPackDate() {
		return packDate;
	}
	public void setPackDate(Date packDate) {
		this.packDate = packDate;
	}
	public String getCurrentLocation() {
		return currentLocation;
	}
	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}
	public String getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public Boolean getDelivered() {
		return delivered;
	}
	public void setDelivered(Boolean delivered) {
		this.delivered = delivered;
	}
	public double getTotalCharges() {
		return totalCharges;
	}
	public void setTotalCharges(double totalCharges) {
		this.totalCharges = totalCharges;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
