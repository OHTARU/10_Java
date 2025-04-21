
public class Ex05_conditional_operator {

	public static void main(String[] args) {
		
		// ? : - 조건연산자 또는 삼항연산자
		// 조건문 ? 실행문1 : 실행문2
		// 조건 ? true 일때 실행문 : false 일때 실행문
		
		int num1 = 30;
		int num2 = 20;
		
		System.out.println("num1 : " + num1 + " / num2 : " + num2);
		
		String str = (num1 > num2) ? "num1이 크다" : "num2이 크다";
		System.out.println("num1 과 num2 비교 결과 : " + str);
		
		System.out.println("================================== ");
		
		// 제어문 분기(비교)처리
		if(num1>num2) {
			str = "num1 이 크다";
		} else {
			str = "num1 이 num2 보다 작다";
		}
		
		System.out.println("num1 과 num2 비교 결과 : " + str);
	}

}
