package com.vti.entity;

public class Account {
	private int id;
	private String email;
	private String username;
	private String fullname;

//TÍNH ĐÓNG GÓI
	// cung cấp cho bên khác mượn nếu đã set private
	// hàm getter (có trong ctrl+alt+s)
	public int getId() {
		return this.id;
	}

	public String getEmail() {
		return this.email;
	}

	public String getUsername() {
		return this.username;
	}

	public String getFullname() {
		return this.fullname;
	}

	// trả lại (có trong ctrl+alt+s)
	public void setid(int id) {
		this.id = id;
	}

	public void setemail(String email) {
		this.email = email;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

}
