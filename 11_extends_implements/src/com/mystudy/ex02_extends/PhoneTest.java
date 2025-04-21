package com.mystudy.ex02_extends;

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
		Mp3Phone ph2 = new Mp3Phone("010-2222-2222");
		ph2.call();
		ph2.receiveCall();
		ph2.playMusic();
		ph2.view();
		
		
		System.out.println("===== WebPhone =====");
	
		WebPhone ph3 = new WebPhone("010-3333-3333");
	
		ph3.call();
		ph3.receiveCall();
		ph3.webSearch();
		ph3.view();
		
		
		System.out.println("===== Mp3WebPhone =====");
		
		Mp3WebPhone ph4 = new Mp3WebPhone("010-4444-4444");
		
		ph4.call();
		ph4.receiveCall();
		ph4.playMusic();
		ph4.webSearch();
		ph4.view();
	}

}
