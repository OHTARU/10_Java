package edu.exam.phone;

import java.util.Scanner;

public class PhoneMain {

	public static void main(String[] args) {

		// model , type, LCD
//		Phone tel = new Phone("아이폰 14 플러스", "아이폰", true);
		
		// 기본 생성자
		Phone tel = new Phone();
		
		// 기본 생성자
		
		tel.hsize = 100;
		tel.vsize = 150;
		
		
		System.out.println("=== 휴대폰 정보 ===");
		tel.view();
		
		System.out.println("=== 휴대폰 기능 ===");
		
		Scanner sc = new Scanner(System.in);

		tel.call();
		tel.receiveCall();
//		tel.sendMsg(sendMsg);

		System.out.print("메세지를 입력해주세요 : ");
		String sendMsg = sc.nextLine();
		String response = tel.sendMsg(sendMsg);
		System.out.println(response);

	}

}
