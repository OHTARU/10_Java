package com.mystudy.ex01_class;

class PhoneTest {

	public static void main(String[] args) {
		//Phone 객체 생성 후 기능 테스트
		System.out.println("=== Phone ===");
		Phone ph1 = new Phone("010-1111-1111");
		ph1.call();
		ph1.receiveCall();
		ph1.view();
		
		
		
		System.out.println("===== Mp3Phone =====");
//		System.out.println(ph1.toString());
		Mp3Phone ph2 = new Mp3Phone("삼성갤럭시","010-2222-2222");
		ph2.call();
		ph2.receiveCall();
		ph2.playMusic();
		ph2.view();
	}

}
