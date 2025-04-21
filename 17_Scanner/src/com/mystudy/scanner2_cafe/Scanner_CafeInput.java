package com.mystudy.scanner2_cafe;

import java.util.Scanner;

public class Scanner_CafeInput {

	private int deposit; // 입금액
	private int balance; // 잔액
	private int menu; // 메뉴 번호
	private int count; // 개수
	private int total; // 총 금액

	private int americano = 3000;
	private int latte = 3500;
	private int mocha = 4000;
	private int juice = 5000;
	Scanner sc = new Scanner(System.in);

	public void start() {
		while (true) {
			input();
			payment();
		}
	}

	private void input() {

		while (true) {
			System.out.println("메뉴를 선택해주세요.");
			System.out.println("1. 아메리카노 ( 3000원 ) 2. 카페라떼( 3500원) 3. 카페모카(4000원) 4. 과일주스(5000원)");
			System.out.print("메뉴 선택 (1 ~ 4) - 종료시 0번 : ");
			menu = sc.nextInt();

			if (menu == 0) {
				System.out.println("종료합니다.");
				System.exit(0);
			}

			System.out.print("주문 수량 : ");
			count = sc.nextInt();

			// 총 금액 계산
			switch (menu) {
			case 1:
				total += (americano * count);
				break;
			case 2:
				total += (latte * count);
				break;
			case 3:
				total += (mocha * count);
				break;
			case 4:
				total += (juice * count);
				break;
			default:
				System.out.println("잘못된 메뉴 번호입니다.");
				continue;
			}

			System.out.println("현재 총 금액: " + total + "원");

			System.out.print("추가 메뉴 선택이 필요하신가요? (예: 1, 아니오: 0) : ");
			int addMenu = sc.nextInt();
			if (addMenu == 0)
				break;
		}

		System.out.print("입금액 : ");
		deposit = sc.nextInt();
	}

	private void payment() {
		balance = deposit - total;
		if (balance < 0) {
			System.out.println("총 금액 " + total + " 추가입금 : " + (balance * -1));
			System.out.println("추가 결제가 필요합니다");
		} else {
			System.out.println("잔액 : " + balance);
		}
	}
}
