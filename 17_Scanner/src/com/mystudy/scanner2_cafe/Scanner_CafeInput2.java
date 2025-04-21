package com.mystudy.scanner2_cafe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Scanner_CafeInput2 {

	private int deposit; // 입금액
	private int balance; // 잔액
	private int menu; // 메뉴 번호
	private int count; // 개수
	private int total; // 총 금액

	// 메뉴 리스트 생성
	private List<Menu> menuList = new ArrayList<>();
	private int americanoCount = 0;
	private int latteCount = 0;
	private int mochaCount = 0;
	private int juiceCount = 0;

	// 주문 내역을 저장할 리스트 추가
	private List<Order> orders = new ArrayList<>();

	Scanner sc = new Scanner(System.in);

	public void scannerCafeInput2() {
        menuList.add(new Menu(1, "아메리카노", 3000));
        menuList.add(new Menu(2, "카페라떼", 3500));
        menuList.add(new Menu(3, "카페모카", 4000));
        menuList.add(new Menu(4, "과일주스", 5000));
    }

	public void start() {
		scannerCafeInput2();
		while (true) {
			input();
			payment();
		}
	}

	private void input() {
		while (true) {
			System.out.println("메뉴를 선택해주세요.");
			for (Menu item : menuList) {
				System.out.printf("%d. %s ( %d원 )\n", item.getNumber(), item.getName(), item.getPrice());
			}
			System.out.print("메뉴 선택 (1 ~ 4) - 종료시 0번 : ");
			menu = sc.nextInt();

			if (menu == 0) {
				System.out.println("종료합니다.");
				printSalesReport(); // 판매 보고서 출력
				printReceipt(); // 영수증 출력
				System.exit(0);
			}

			System.out.print("주문 수량 : ");
			count = sc.nextInt();

			// 총 금액 계산 및 판매 개수 증가
			int itemTotal = 0;
			Menu selectedMenu = null;
			for (Menu item : menuList) {
				if (item.getNumber() == menu) {
					selectedMenu = item;
					itemTotal = item.getPrice() * count;
					total += itemTotal;

					// 판매 개수 증가
					switch (menu) {
					case 1:
						americanoCount += count;
						break;
					case 2:
						latteCount += count;
						break;
					case 3:
						mochaCount += count;
						break;
					case 4:
						juiceCount += count;
						break;
					}
					break;
				}
			}

			if (selectedMenu == null) {
				System.out.println("잘못된 메뉴 번호입니다.");
				continue;
			}

			orders.add(new Order(menu, count, itemTotal));

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

	private void printSalesReport() {
		System.out.println("판매 보고서:");
		System.out.println("아메리카노 판매 개수: " + americanoCount);
		System.out.println("카페라떼 판매 개수: " + latteCount);
		System.out.println("카페모카 판매 개수: " + mochaCount);
		System.out.println("과일주스 판매 개수: " + juiceCount);
		System.out.println("총 매출 금액: " + total + "원");
	}

	private void printReceipt() {
		System.out.println("영수증:");
		for (Order order : orders) {
			String menuName = "";
			for (Menu item : menuList) {
				if (item.getNumber() == order.menu) {
					menuName = item.getName();
					break;
				}
			}
			System.out.println(menuName + " x " + order.count + " : " + order.itemTotal + "원");
		}
		System.out.println("총 금액: " + total + "원");
	}

	private static class Order {
		int menu; // 메뉴 번호
		int count; // 개수
		int itemTotal; // 해당 메뉴 총 금액

		public Order(int menu, int count, int itemTotal) {
			this.menu = menu;
			this.count = count;
			this.itemTotal = itemTotal;
		}
	}

	private static class Menu {
		private int number; // 메뉴 번호
		private String name; // 메뉴 이름
		private int price; // 메뉴 가격

		public Menu(int number, String name, int price) {
			this.number = number;
			this.name = name;
			this.price = price;
		}

		public int getNumber() {
			return number;
		}

		public String getName() {
			return name;
		}

		public int getPrice() {
			return price;
		}
	}
}
