package com.mystudy.scanner2_cafe;

public class Scanner_Cafe {

	public static void main(String[] args) {
		// 카페 음료 주문처리
		// 음료의 종류
		// 1. 아메리카노 ( 3000원 ) 2. 카페라떼( 3500원) 3. 카페모카(4000원) 4. 과일주스(5000원)
		// 입력값 : 메뉴번호 , 주문수량 , 입금액(고객이 낸 돈)
		// 처리 : 판매액( 단가 * 수량 ) , 잔돈(입금액- 판매액)
		// 출력 : 입금액 , 판매액 , 잔액

		// 1. 아메리카노 ( 3000원 ) 2. 카페라떼( 3500원) 3. 카페모카(4000원) 4. 과일주스(5000원)
		// 메뉴선택(1~4) :
		// 주문수량 :
		// 입금액 :
//		new Scanner_CafeInput().start();
		new Scanner_CafeInput2().start();
	}

}
