package com.vti.frontend;

import com.vti.entity.Account;

public class demo1 {
	public static void main(String[] args) {
		Account ac1 = new Account();
		ac1.setid(1);
		ac1.setemail("email1@gmail.com");
		ac1.setUsername("username1");
		ac1.setFullname("fullname1");

		System.out.println("Thông tin account");
		System.out.println("ID: " + ac1.getId());
		System.out.println("Email: " + ac1.getEmail());
		System.out.println("Username: " + ac1.getUsername());
		System.out.println("Fullname: " + ac1.getFullname());
	}
}
