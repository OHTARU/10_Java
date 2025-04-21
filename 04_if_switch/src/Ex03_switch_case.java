import java.util.Scanner;

public class Ex03_switch_case {

	public static void main(String[] args) {
		// switch_case 문 : 동등비교구문

		/*
		 * switch (조건값) { case 비교값1 : 실행할 문장; break; case 비교값2 ; 실행할 문장; break; ....
		 * 
		 * default : 실행할 문장; break; }
		 */

//		int month = 2;
//
//		switch (month) {
//		case 1:
//			System.out.println(month + "월은 31일까지 있습니다.");
//			break;
//
//		case 2:
//			System.out.println(month + "월은 28, 29일까지 있습니다.");
//			break;
//
//		case 3:
//			System.out.println(month + "월은 31일까지 있습니다.");
//			break;
//
//		case 4:
//			System.out.println(month + "월은 30일까지 있습니다.");
//			break;
//
//		default:
//			System.out.println("일치하는 값이 없습니다.");
//			break;
//		}
//		System.out.println("--------------");

		String result = "휴지";

		Scanner scanner = new Scanner(System.in);
		System.out.print("등수를 입력하세요 : ");
		int score = scanner.nextInt();

		switch (score) {
		case 1:
//				System.out.println(score + "등 입니다. 상품 : 냉장고");
			result = "냉장고";
			break;
		case 2:
//				System.out.println(score + "등 입니다. 상품 : 김치냉장고");
			result = "김치냉장고";
			break;
		case 3:
//				System.out.println(score + "등 입니다. 상품 : 세탁기");
			result = "세탁기";
			break;
		case 4:
//				System.out.println(score + "등 입니다. 상품 : 청소기");
			result = "청소기";
			break;
		default:
//				System.out.println("꽝입니다. 상품 : 휴지");
			break;
		}
		System.out.println(score + "등 입니다. 상품 : " + result);
	}
}
