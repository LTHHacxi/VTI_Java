package com.VTI.entity;

public class Worker extends Staff{
private int rank;
// khai báo contructor không tham số

//khai báo contructor đủ tham số
public Worker(int age, String name, Gender gender, String address, int rank) {
	super(age, name, gender, address);
	this.rank = rank;
}


//khai báo geter seter
public int getRank() {
	return rank;
}

public void setRank(int rank) {
	this.rank = rank;
}



}
