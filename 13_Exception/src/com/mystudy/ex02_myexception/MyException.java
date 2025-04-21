package com.mystudy.ex02_myexception;

// 예외만들기 : Exception 을상속받아만들기
class MyException extends Exception {

	// 생성자
	public MyException() {
		// 수퍼 ( 부모 ) 클래스의 생성자 호출( 메시지 출력 )
		super(">> 내가 만든 Exception");
	}

	public MyException(String msg) {
		super(">> 내가 만든 Exception" + msg);
	}

}
