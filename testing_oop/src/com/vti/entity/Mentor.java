package com.vti.entity;

// muốn mượn của class cha Staff phải có lệnh extends dưới
public class Mentor extends Staff {
	private int yearsOfExperience;

//	Khai báo ra hàm Setter
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

//	Khai báo hàm getter
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

//
	public String printYearsOfExperience() {
		return "yearsOfExperience= " + this.yearsOfExperience;
	}

// hàm in thông tin mentor có id ,name, gender ,yearofExperience
	public void printInfoOfMentor() {
		System.out.println("Thông tin mentor là: ");
		System.out.println("Năm kinh nghiệm: " + this.yearsOfExperience);
		System.out.println("Id: " + super.getId());
		System.out.println("Name: " + super.getName());
		System.out.println("Gender: " + super.getGender());
	}

	public Mentor(int id, String name, String gender, int yearsOfExperience) {
		super(id, name, gender);
		this.yearsOfExperience = yearsOfExperience;
	}

}