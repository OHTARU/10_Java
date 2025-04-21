package com.mystudy.ex02_myexception;

public class MyExceptionTest {

	public static void main(String[] args) {

		System.out.println("메인");

		try {
			firstMethod(true);
		} catch (MyException e) {
			e.printStackTrace();

		}
		System.out.println("메인종료");
	}

	private static void firstMethod(boolean ex) throws MyException {
		System.out.println("firstMethod 시작");
		System.out.println("firstMethod() -- 동작");

		secondMethod(ex);
		System.out.println("firstMethod 종료");
	}

	private static void secondMethod(boolean ex) throws MyException {
		System.out.println("secondMethod 시작");
		System.out.println("secondMethod() -- 동작");

		// 예외 발생 시키기
		if (ex) {
			throw new MyException("[예외 발생] - secondMethod 실행중");
		}

		System.out.println("secondMethod 종료");
	}
}
