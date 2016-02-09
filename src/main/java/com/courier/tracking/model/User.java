package com.courier.tracking.model;

import java.util.Date;

public class User extends Person {

	private int id;
	private Date dob;
	private int branchID;
	private Branch branch;
	private Date joinDate;
	private String designation;
	private String username;
	private String password;
	private String userRole;
}
