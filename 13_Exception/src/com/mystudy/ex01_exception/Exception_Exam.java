package com.mystudy.ex01_exception;

public class Exception_Exam {

	public static void main(String[] args) {
		System.out.println("---- main() 시작 ----");
		int num1 = 100;
		int num2 = 30;
		int result = 0;

		System.out.println(">>> 연산 시작 ");

		num2 = 10;

		System.out.println("num1 : " + num1 + " num2 : " + num2);

		// 예외처리 -----
		if (num2 == 0) {
			System.out.println("[예외 발생] 나누는 값이 0 이다.");
		} else {
			result = num1 / num2;
			System.out.println("연산결과 result : " + result);
		}

		System.out.println("---- try ~ catch 구문으로 처리 ----");

		try {
			result = num1 / num2;
			System.out.println("연산결과 result : " + result);
		} catch (ArithmeticException e) {
			System.out.println("[예외 발생 - ArithmeticException] 나누는 값이 0 이다" + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("[예외 발생 - ArithmeticException] 나누는 값이 0 이다" + e.getMessage());
		} catch (Exception e) {
			System.out.println("[예외 발생 - Exception] 나누는 값이 0 이다");
		} finally {
			System.out.println(":::: fianlly - 무조건 실행되는 코드");
		}

		

		System.out.println("---- main() 끝 ---- ");
	}

}
