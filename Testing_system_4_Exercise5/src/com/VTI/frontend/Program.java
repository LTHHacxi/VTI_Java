package com.VTI.frontend;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("+-----------------MENU---------------+");
			// dấu - để căng dòng
			// 36 là số kí tự tối thiểu trong cả dòng này
			// %n để xuống dòng
			System.out.printf("|%-36s|%n", "Mời bạn chọn yêu cầu: ");
			System.out.printf("|%-36s|%n", "1. Thêm mới cán bộ");
			System.out.printf("|%-36s|%n", "2. Kiếm theo họ tên");
			System.out.printf("|%-36s|%n", "3. Thông tin danh sách cán bộ");
			System.out.printf("|%-36s|%n", "4. Nhập tên để xóa cán bộ");
			System.out.printf("|%-36s|%n", "5. Thoát khỏi chương trình");
			System.out.println("+------------------------------------+");
			int choseMenu = scanner.nextInt();
			switch (choseMenu) {
			case 1:
				;
				break;
			case 2:
				;
				break;
			case 3:
				;
				break;
			case 4:
				;
				break;
			case 5:
				;
				break;
			default:
				System.out.println("Mời bạn chọn lại");
				break;
			}

		}
	}

}
