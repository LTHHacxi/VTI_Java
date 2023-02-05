package com.vti.entity;

import java.time.LocalDate;

import com.vti.entity.Position;
import com.vti.entity.Group;

public class Account {
	public int id;
	public String email;
	public String username;
	public String fullName;
	public Position position;
	public Department department;
	public LocalDate createDate;
	public Group[] groups;
// Exercise 1 (Optional): Constructor
	// Question 2:
	// a)không có parameters
	public Account() {

	}

	// b) Có các parameter là id, Email, Username, FirstName,LastName (với FullName
	// = FirstName + LastName)
	public Account(int id, String email, String username, String FirstName, String LastName) {
		this.id = id;
		this.email = email;
		this.username = username;
		this.fullName = FirstName + " " + LastName;
	}

	// c)
	public Account(int id, String email, String username, String FirstName, String LastName, Position position) {
		super();
		this.id = id;
		this.email = email;
		this.username = username;
		this.fullName = FirstName + " " + LastName;
		this.position = position;
		this.createDate = LocalDate.now();
	}

	// d)
	public Account(int id, String email, String username, String FirstName, String LastName, Position position,
			LocalDate creatDate) {
		super();
		this.id = id;
		this.email = email;
		this.username = username;
		this.fullName = FirstName + " " + LastName;
		this.position = position;
		this.createDate = creatDate;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", email=" + email + ", username=" + username + ", fullname=" + fullName + "]";
	}

}
