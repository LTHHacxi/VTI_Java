package com.VTI.frontend;

import java.time.LocalDate;

import com.VTI.entity.Account;
import com.VTI.entity.Department;
import com.VTI.entity.Group;
import com.VTI.entity.Position;
import com.VTI.entity.Position.Pname;

public class Program {
	public static void main(String[] args) {
		// tạo instance trong Department
		Department dep1 = new Department();
		dep1.id = 1;
		dep1.name = "sale";

		System.out.println("Thông tin phòng ban số 1:");
		System.out.println("ID:" + dep1.id);
		System.out.println("Name:" + dep1.name);

		Department dep2 = new Department();
		dep2.id = 2;
		dep2.name = "Marketing";

		System.out.println("Thông tin phòng ban số 2:");
		System.out.println("ID:" + dep2.id);
		System.out.println("Name:" + dep2.name);

		Department dep3 = new Department();
		dep3.id = 3;
		dep3.name = "Human Resources";

		System.out.println("Thông tin phòng ban số 3:");
		System.out.println("ID:" + dep3.id);
		System.out.println("Name:" + dep3.name);

		// tạo instance trong Position
		Position po1 = new Position();
		po1.id = 1;
		po1.name = Pname.Dev;

		System.out.println("Thông tin chức vụ vị trí 1:");
		System.out.println("ID:" + po1.id);
		System.out.println("Name:" + po1.name);

		Position po2 = new Position();
		po2.id = 2;
		po2.name = Pname.Test;

		System.out.println("Thông tin chức vụ vị trí 2:");
		System.out.println("ID:" + po2.id);
		System.out.println("Name:" + po2.name);

		Position po3 = new Position();
		po3.id = 3;
		po3.name = Pname.Scrum_Master;

		System.out.println("Thông tin chức vụ vị trí 3:");
		System.out.println("ID:" + po3.id);
		System.out.println("Name:" + po3.name);

		Position po4 = new Position();
		po4.id = 4;
		po4.name = Pname.PM;

		System.out.println("Thông tin chức vụ vị trí 4:");
		System.out.println("ID:" + po4.id);
		System.out.println("Name:" + po4.name);

		// tạo instance trong Account
		Account ac1 = new Account();
		ac1.id = 1;
		ac1.email = "user1@gmail.com";
		ac1.username = "username1";
		ac1.fullName = "i am user1";
		ac1.department = dep1;
		ac1.position = po1;
		ac1.createDate = LocalDate.now();
		

		System.out.println("Thông tin Account 1:");
		System.out.println("ID:" + ac1.id);
		System.out.println("Email:" + ac1.email);
		System.out.println("Username:" + ac1.username);
		System.out.println("Name:" + ac1.fullName);
		System.out.println("DepartmentName:" + ac1.department.name);
		System.out.println("PositionName:" + ac1.position.name);
		System.out.println("Date:" + ac1.createDate);
		System.out.println(" Group: "+ ac1.groups[0].name + ac1.groups[1].name);

		Account ac2 = new Account();
		ac2.id = 2;
		ac2.email = "user1@gmail.com";
		ac2.username = "username1";
		ac2.fullName = "i am user1";
		ac2.department = dep2;
		ac2.position = po2;
		ac2.createDate = LocalDate.of(2021, 03, 15);

		System.out.println("Thông tin Account 2:");
		System.out.println("ID:" + ac2.id);
		System.out.println("Email:" + ac2.email);
		System.out.println("Username:" + ac2.username);
		System.out.println("Name:" + ac2.fullName);
		System.out.println("DepartmentName:" + ac2.department.name);
		System.out.println("PositionName:" + ac2.position.name);
		System.out.println("Date:" + ac2.createDate);
		System.out.println(" Group: "+ ac2.groups[0].name + ac2.groups[1].name + ac2.groups[2].name);
		
		Account ac3 = new Account();
		ac3.id = 3;
		ac3.email = "user1@gmail.com";
		ac3.username = "username1";
		ac3.fullName = "i am user1";
		ac3.department = dep3;
		ac3.position = po3;
		ac3.createDate = LocalDate.now();

		System.out.println("Thông tin Account 3:");
		System.out.println("ID:" + ac3.id);
		System.out.println("Email:" + ac3.email);
		System.out.println("Username:" + ac3.username);
		System.out.println("Name:" + ac3.fullName);
		System.out.println("DepartmentName:" + ac3.department.name);
		System.out.println("PositionName:" + ac3.position.name);
		System.out.println("Date:" + ac3.createDate);
		System.out.println(" Group: "+ ac3.groups[0].name + ac3.groups[1].name);
		
		Account ac4 = new Account();
		ac4.id = 4;
		ac4.email = "user1@gmail.com";
		ac4.username = "username1";
		ac4.fullName = "i am user1";
		ac4.department = dep2;
		ac4.position = po4;
		ac4.createDate = LocalDate.now();

		System.out.println("Thông tin Account 4:");
		System.out.println("ID:" + ac4.id);
		System.out.println("Email:" + ac4.email);
		System.out.println("Username:" + ac4.username);
		System.out.println("Name:" + ac4.fullName);
		System.out.println("DepartmentName:" + ac4.department.name);
		System.out.println("PositionName:" + ac4.position.name);
		System.out.println("Date:" + ac4.createDate);
		System.out.println(" Group: ");

		// tạo instance trong group
		Group gr1 = new Group();
		gr1.id = 1;
		gr1.name = "Grname 1";
		gr1.creator = ac1;
		gr1.createDate = LocalDate.now();
		Account[]gr1accounts = {ac1, ac2};
		gr1.accounts = gr1accounts;

		System.out.println("Thông tin Group 1:");
		System.out.println("ID:" + gr1.id);
		System.out.println("Name:" + gr1.name);
		System.out.println("UserOfCreator:" + gr1.creator.username);
		System.out.println("Date:" + gr1.createDate);

		Group gr2 = new Group();
		gr2.id = 2;
		gr2.name = "Grname 2";
		gr2.creator = ac2;
		gr2.createDate = LocalDate.now();
		Account[]gr2accounts = {ac1, ac2, ac3};
		gr2.accounts = gr2accounts;

		System.out.println("Thông tin Group 2:");
		System.out.println("ID:" + gr2.id);
		System.out.println("Name:" + gr2.name);
		System.out.println("UserOfCreator:" + gr2.creator.username);
		System.out.println("Date:" + gr2.createDate);

		Group gr3 = new Group();
		gr3.id = 3;
		gr3.name = "Grname 3";
		gr3.creator = ac3;
		gr3.createDate = LocalDate.now();
		Account[]gr3accounts = {ac2, ac3};
		gr3.accounts = gr3accounts;

		System.out.println("Thông tin Group 3:");
		System.out.println("ID:" + gr3.id);
		System.out.println("Name:" + gr3.name);
		System.out.println("UserOfCreator:" + gr3.creator.username);
		System.out.println("Date:" + gr3.createDate);
// gán group vào account
		// cách 1
		Group[] ac1Groups = new Group[2];
		ac1Groups[0] = gr1;
		ac1Groups[1] = gr2;
		ac1.groups = ac1Groups;
		// cách 2
		Group[] ac2Groups = { gr1, gr2, gr3 };
		ac2.groups = ac2Groups;
		// cách 3
		ac3.groups = new Group[] { gr2, gr3 };
		// tạo instance trong TypeQuestion
		
		TypeQuestion tq1 = new TypeQuestion();
		tq1.id = 1;
		tq1.name = "Essay";

		System.out.println("Thông tin kiểu question 1:");
		System.out.println("ID:" + tq1.id);
		System.out.println("Name:" + tq1.name);
		
		Department tq2 = new TypeQuestion();
		tq2.id = 1;
		tq2.name = "Essay";

		System.out.println("Thông tin kiểu question 2:");
		System.out.println("ID:" + tq2.id);
		System.out.println("Name:" + tq2.name);
		
		Department tq1 = new TypeQuestion();
		tq1.id = 1;
		tq1.name = "Essay";

		System.out.println("Thông tin kiểu question 1:");
		System.out.println("ID:" + tq1.id);
		System.out.println("Name:" + tq1.name);
		
		Department tq1 = new TypeQuestion();
		tq1.id = 1;
		tq1.name = "Essay";

		System.out.println("Thông tin kiểu question 1:");
		System.out.println("ID:" + tq1.id);
		System.out.println("Name:" + tq1.name);
		
		
	}

}
