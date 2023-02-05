package com.vti.entity;

import java.time.LocalDate;

public class Account {
	public int id;
	public String email;
	public String username;
	public String fullname;
	public String position;
	public Department department;
	public LocalDate creatDate;

// Exercise 1 (Optional): Constructor
	// Question 1:
	// a)không có parameters
	public Account() {

	}

	// b) Có các parameter là id, Email, Username, FirstName,LastName (với FullName
	// = FirstName + LastName)
	public Account(int id, String email, String username, String FirstName, String LastName) {
		this.id = id;
		this.email = email;
		this.username = username;
		this.fullname = FirstName + " " + LastName;
	}

	// c)
	public Account(int id, String email, String username, String FirstName, String LastName, String position) {
		super();
		this.id = id;
		this.email = email;
		this.username = username;
		this.fullname = FirstName + " " + LastName;
		this.position = position;
		this.creatDate = LocalDate.now();
	}

	// d)
	public Account(int id, String email, String username, String FirstName, String LastName, String position,
			LocalDate creatDate) {
		super();
		this.id = id;
		this.email = email;
		this.username = username;
		this.fullname = FirstName + " " + LastName;
		this.position = position;
		this.creatDate = creatDate;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", email=" + email + ", username=" + username + ", fullname=" + fullname + "]";
	}

}
