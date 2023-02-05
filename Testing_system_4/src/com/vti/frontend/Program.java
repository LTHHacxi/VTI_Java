package com.vti.frontend;

import java.time.LocalDate;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Position;

public class Program {
	public static void main(String[] args) {
// Exercise 1 (Optional): Constructor
		// Question 1:
		// a)
		Department dep1 = new Department();
		// b)
		Department dep2 = new Department("Sale");
		// Question 2:
		// a)
		Account ac1 = new Account();
		// b)
		Account ac2 = new Account(2, "letuhao@gmail.com", "letuhao", "Hao", "Le");
		// c)
		Account ac3 = new Account(3, "letuhao3@gmail.com", "letuhao3", "Le3", "Hao3", "Truong Phong");
		// d)
		Position pos4 = new Position();
		Account ac4 = new Account(4, "letuhao1@gmail.com", "letuhao1", "Hao1", "Le1", "Nhan Vien",
				LocalDate.of(2020, 12, 30));

	}
}
