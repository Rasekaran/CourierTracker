package com.courier.tracking.model;

import java.util.Date;

import com.cinergix.mapper.annotation.ResultField;
import com.cinergix.mapper.annotation.ResultMapped;

@ResultMapped
public class Staff extends Person {

//	//------------------------
//	//properties from Person
//	@ResultField( "ssn" )
//	private String ssn = "";
//	@ResultField( "f_name" )
//	private String fName = "";
//	@ResultField( "l_name" )
//	private String lName = "";
//	@ResultField( "street" )
//	private String street = "";
//	@ResultField( "city" )
//	private String city = "";
//	@ResultField( "country" )
//	private String country = "";
//	@ResultField( "postal_code" )
//	private String postalCode = "";
//	//------------------------
	
	@ResultField( "staff_id" )
	private int id;
	@ResultField( "dob" )
	private Date dob;
	@ResultField( "branch_id" )
	private int branchID;
	private Branch branch;
	@ResultField( "joined_date" )
	private Date joinDate;
	@ResultField( "designation" )
	private String designation;
	@ResultField( "username" )
	private String username;
	@ResultField( "password" )
	private String password;
	@ResultField( "userRole" )
	private String userRole;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getBranchID() {
		return branchID;
	}
	public void setBranchID(int branchID) {
		this.branchID = branchID;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	
	
}
