package com.mystudy.ex01_class;


// 기능 : 전화걸기, 전화받기, 정보확인, 음악플레이
// 상속관계없이 작성한 클래스
public class Mp3Phone {

	private String type;
	private String phoneNo;
	
	public Mp3Phone() {
		
	}
	
	public Mp3Phone(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public Mp3Phone(String type, String phoneNo) {
		super();
		this.type = type;
		this.phoneNo = phoneNo;
	}
	
	
	// 전화 걸기 기능
	public void call() {
		System.out.println(">> 전화 걸기");
	}
	
	// 전화 받기 기능
	public void receiveCall() {
		System.out.println(">> 전화 받기");
	}

	// 전화 정보 보기
	public void view() {
		System.out.println("타입 : " + type + " 전화번호 : "+ phoneNo);
	}
	
	public void playMusic() {
		System.out.println(">> 음악 플레이");
	}
	
}
