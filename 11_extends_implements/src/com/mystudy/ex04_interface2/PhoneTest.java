package com.mystudy.ex04_interface2;

class PhoneTest {

	public static void main(String[] args) {
		// Phone 객체 생성 후 기능 테스트
		System.out.println("=== Phone ===");
		Phone ph1 = new Phone("010-1111-1111");
		ph1.view();
		ph1.call();
		ph1.receivceCall();
		ph1.sendMsg();
		ph1.receivceMsg();

		System.out.println("===== Mp3Phone =====");
		Mp3Phone mp3ph = new Mp3Phone("010-2222-2222");
		mp3ph.view();
		mp3ph.playMusic();
		mp3ph.call();
		mp3ph.receivceCall();
		mp3ph.sendMsg();
		mp3ph.receivceMsg();

		System.out.println("===== WebPhone =====");

		WebPhone webph = new WebPhone("010-3333-3333");

		webph.view();
		webph.call();
		webph.receivceCall();
		webph.sendMsg();
		webph.receivceMsg();
		webph.searchWeb();
		webph.playMusic();

//		
//		
//		System.out.println("===== Mp3WebPhone =====");
//		
//		Mp3WebPhone ph4 = new Mp3WebPhone("010-4444-4444");
//		
//		ph4.call();
//		ph4.receiveCall();
//		ph4.playMusic();
//		ph4.webSearch();
//		ph4.view();
	}

}
