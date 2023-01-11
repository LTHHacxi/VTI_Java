package com.VTI.frontend;

import java.util.Scanner;

import com.VTI.entity.Department;

public class demo2 {
	public static void main(String[] args) {

// java scaner: lấy dữ liệu nhập từ bàn phím	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào số thứ 1: ");
		int a = scanner.nextInt();

		System.out.println("Mời bạn nhập vào số thứ 2: ");
		int b = scanner.nextInt();

		int result = a + b;
		System.out.println("Tổng 2 số là: " + result);

		System.out.println("------------------");
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào tên: ");
		String name = scanner1.nextLine();
		System.out.println("Tên bạn là: " + name);
// hãy thực hiện thao tác ng dùng nhập id, và tên ng dùng từ phòng ban mới
		Scanner dpscanner = new Scanner(System.in);
		
		System.out.println("Tạo mới phòng ban");
		System.out.println("Mời bạn nhập vào id phòng ban: ");
		int iddep = dpscanner.nextInt();

		System.out.println("Mời bạn nhập vào tên phòng ban: ");
		String namedep = dpscanner.nextLine();

		Department dpnew = new Department();
		dpnew.id = iddep;
		dpnew.name = namedep;
	}
}
