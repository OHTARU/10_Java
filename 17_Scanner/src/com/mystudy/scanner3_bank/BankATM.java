package com.mystudy.scanner3_bank;

import java.util.ArrayList;
import java.util.Scanner;

public class BankATM {
	private int money;
	private Scanner scanner;
	private ArrayList<String> historyAccount;

	public BankATM() {
		money = 0;
		scanner = new Scanner(System.in);
		historyAccount = new ArrayList();
	}

	public void showMenu() {
		System.out.println("-----------------------------------------");
		System.out.println("1.입금  2.출금  3.통장확인 4.거래내역조회 0.종료");
		System.out.println("-----------------------------------------");
		System.out.print(">>작업선택 : ");
	}

	public void processJob(int choice) {
		switch (choice) {
		case 1:
			inputMoney();
			break;
		case 2:
			outputMoney();
			break;
		case 3:
			showMoney();
			break;
		case 4:
			showHistory();
			break;
		case 0:
			System.out.println("시스템을 종료합니다.");
			System.out.println("종료 전 마지막 잔액 : " + money);
			System.exit(0);
			break;
		default:
			System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
		}
	}

	public void inputMoney() {
		int input = 0;
		System.out.print(">>입금액 : ");
		input = ValidnumInput();
		if (input > 0) {
			money += input;
			System.out.println("통장 잔고 : " + money);
			historyAccount.add("입금액 : " + input + " 통장 잔고 : " + money);
		} else {
			System.out.println("입금액은 0원보다 커야합니다.");
			historyAccount.add("[입금오류] : 입금액 수정요청");
		}
	}

	public void outputMoney() {
		int output = 0;
		System.out.print(">>출금액 : ");
		output = ValidnumInput();
		if (output > 0 && output <= money) {
			money -= output;
			System.out.println("통장 잔고 " + money);
			historyAccount.add("출금액 : " + output + " 통장 잔고 : " + money);
		} else if (output <= 0) {
			System.out.println("출금액이 0원보다 커야합니다.");
			historyAccount.add("[출금오류] : 출금액 수정요청");
		} else {
			System.out.println("출금액이 통장 잔고보다 적어야합니다.");
			historyAccount.add("[출금오류] : 출금액 부족");
		}
	}

	public void showHistory() {
		System.out.println(">> 거래내역 <<");
		int cnt = 0;
		if (historyAccount.isEmpty()) {
			System.out.println("거래 내역 없음");
		} else {
			for (String history : historyAccount) {
				cnt++;
				System.out.println("-----------------");
				System.out.println(cnt + "번째 사용 내역 : " + history);
			}
		}
	}

	public void showMoney() {
		System.out.println("::통장 잔고 : " + money);
	}

	private int ValidnumInput() {
		while (!scanner.hasNextInt()) {
			System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
			scanner.next();
			System.out.print(">> 다시 입력하세요 :");
			historyAccount.add("[입력오류] : 재입력 요청");
		}
		return scanner.nextInt();
	}

	public void startBank() {
		System.out.println(">> 어서오세요");
		int choice;
		while (true) {
			showMenu();
			choice = ValidnumInput();
			processJob(choice);
		}
	}
}
