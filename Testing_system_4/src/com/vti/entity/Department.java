package com.vti.entity;

public class Department {
	public int id;
	public String name;

// Exercise 1 (Optional): Constructor
	// Question 1:
	// a)
	// hàm khởi tạo (contructor) (không tham số (parameter))
	// hàm khởi tạo không có dữ liệu trả về (có chữ void)
	// hàm khởi tạo (không tham số) mặc định (không khai báo vẫn tự có miễn là không
	// có khai báo hàm có tham số)
	public Department() {
		System.out.println("Bạn vừa tạo mới 1 phòng ban");
	}

	// b)
	// hàm khởi tạo (có parameter) (muốn dùng hàm mặc định bên trên thì phải khai
	// báo
	// chứ nó không tự động hỗ trợ nữa)
	public Department(String name) {
		this.name = name;
		this.id = 0;
	}

	// hàm khởi tạo (có 2 tham số)
	public Department(int idParam, String nameParam) {
		this.id = idParam;
		this.name = nameParam;
	}

	public void abc() {
	}

	// có thể làm hàm tạo tự động alt+shift+s chọn "generate contructors using
	// field"

	// phương thức in thông tin phòng ban
	public void toPrintDepartment() {
		System.out.println("Thông tin phòng ban là: id: " + this.id + ",name: " + this.name);
	}

	// phương thức in thông tin phòng ban cách 2
	public String toPrintDepartment2() {
		return "id: " + this.id + ", name: " + this.name;
	}
	// có thể làm hàm tạo tự động alt+shift+s chọn "generate toString"

}
