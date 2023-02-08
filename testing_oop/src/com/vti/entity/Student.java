package com.vti.entity;

public class Student extends Staff {
	public Student(int id, String name, String gender) {
		super(id, name, gender);
		// TODO Auto-generated constructor stub
	}

	private String job;

	public void setJob(String job) {
		this.job = job;
	}

	public String getJob() {
		return job;
	}

}