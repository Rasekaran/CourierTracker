package com.courier.tracking.model;

import com.cinergix.mapper.annotation.ResultField;
import com.cinergix.mapper.annotation.ResultMapped;

@ResultMapped
public class Person {

	@ResultField( "ssn" )
	private String ssn = "";
	@ResultField( "f_name" )
	private String fName = "";
	@ResultField( "l_name" )
	private String lName = "";
	@ResultField( "street" )
	private String street = "";
	@ResultField( "city" )
	private String city = "";
	@ResultField( "country" )
	private String country = "";
	@ResultField( "postal_code" )
	private String postalCode = "";
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
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
