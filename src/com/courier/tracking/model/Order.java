package com.courier.tracking.model;

import java.util.Date;

public class Order {

	private int id;
	private int staffID;
	private String senderSSN;
	private Person sender;
	private String receiverSSN;
	private String receiver;
	private double weight;
	private Date packDate;
	private String currentLocation;
	private String lastUpdate;
	private String deliveryDate;
	private Boolean delivered;
	private double totalCharges;
}
