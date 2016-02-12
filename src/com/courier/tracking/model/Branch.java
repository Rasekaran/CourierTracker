package com.courier.tracking.model;

import com.cinergix.mapper.annotation.ResultField;
import com.cinergix.mapper.annotation.ResultMapped;

@ResultMapped
public class Branch {

	@ResultField( "branch_id" )
	private int id;
	@ResultField( "street" )
	private String street;
	@ResultField( "city" )
	private String city;
	@ResultField( "country" )
	private String country;
	@ResultField( "postal_code" )
	private String postalCode;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	
}
