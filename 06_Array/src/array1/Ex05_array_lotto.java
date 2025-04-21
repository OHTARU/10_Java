package array1;

import java.util.Scanner;

public class Ex05_array_lotto {

	public static void main(String[] args) {

//		int[] lotto = new int[45];
//
//		
//		// lotto[45] 배열 초기화
//		for (int i = 0; i < lotto.length; i++) {
//			lotto[i] = i + 1;
//		}
//
//		System.out.println("== 당첨번호 ==");
//
//		// correct[6] 배열 새로 생성
//		int[] correct = new int[6];
//		
//			for (int i = 0; i < 6; i++) {
//				
//				// number 변수에 1~45 까지 랜덤값 생성
//				int number = (int) (Math.random() * 45 + 1);
//				
//				
//				// number에서 생성된 랜덤 값 correct[i] 값에 넣기
//				correct[i] = number;
//				
//				// 
//				for (int j = 0 ; j < i ; j++) {
//					if (correct[i] == correct[j]) {
//						i--;
//						break;
//					}
//					
//				}
//				
//				System.out.print(correct[i] + " ");
//			}

		System.out.println("\n==당첨 번호 ==");

		// int 타입의 숫자 45개 저장할 수 있는 배열 선언 (balls)
		// 초기화 : 1 ~ 45까지 숫자(번호 입력)
		// 충분히 많이 섞고 > 0 ~ 44 임의의 숫자 생성(Math.random()사용)
		// 0번 인덱스 위치값 랜덤값( 0 ~ 44 ) 위치값 서로 맞교환
		// 6개의 번호 추출 ( 앞에서부터 6개 )

		int[] balls = new int[45];

		// 1 ~45 배열초기화
		for (int i = 0; i < balls.length; i++) {
			balls[i] = i + 1;
		}

		for (int i = 0; i < balls.length; i++) {

			// randomIndex에 랜덤값 입력
			int randomIndex = (int) (Math.random() * 45);

			// 현 인덱스[i] 와 [randomIndex] 위치 변경
			int temp = balls[i];
			balls[i] = balls[randomIndex];
			balls[randomIndex] = temp;

		}

		// 0 ~ 5번지 배열 출력
		for (int i = 0; i < 6; i++) {
			System.out.print(balls[i] + " ");
		}

		System.out.println();

		int[] InputNum = new int[6];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 6; i++) {
			System.out.print(i + "번째 값을 넣어주세요 : ");
			InputNum[i] = sc.nextInt();
		}

		int same = 0;

		for (int i = 0; i < balls.length; i++) {
			for (int j = 0; j < InputNum.length; j++) {
				if (balls[i] == InputNum[j]) {
					same++;
					break;
				}
			}
		}

		switch (same) {
		case 6:
			System.out.println("1등");
			break;
		case 5:
			System.out.println("2등");
			break;
		case 4:
			System.out.println("3등");
			break;
		case 3:
			System.out.println("4등");
			break;
		case 2:
			System.out.println("5등");
			break;
		case 1:
			System.out.println("꽝");
			break;
		}
	}
}
