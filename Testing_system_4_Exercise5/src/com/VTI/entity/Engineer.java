package com.VTI.entity;

public class Engineer extends Staff {
private String specialize;
//khai báo contructor không tham số

//khai báo contructor đủ tham số
public Engineer(int age, String name, Gender gender, String address, String specialize) {
	super(age, name, gender, address);
	this.specialize = specialize;
}
//khai báo geter seter




}
