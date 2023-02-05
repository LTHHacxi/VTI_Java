package com.vti.entity;

public class Student {
	public int id;
	// int id (có nghĩa là đang dùng default thay tại vị trí public)
	public String name;

	public void study() {
		System.out.println("yourid: " + this.id);
		System.out.println("yourname: " + this.name);
	}
}
