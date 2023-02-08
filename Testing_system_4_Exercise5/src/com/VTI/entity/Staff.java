package com.VTI.entity;

public class Staff {
	private int age;
	private String name;
	private Gender gender;
	private String address;

	public Staff(int age, String name, Gender gender, String address) {
		super();
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.address = address;
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
