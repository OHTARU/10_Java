package com.mystudy.ex03_interface;

//기능 : 전화걸기 , 전화받기, 정보확인
class Phone { // extends Object 생략가능
	private String type;
	private String phoneNo;
	
	public Phone() {
		
	}
	
	public Phone(String phoneNo) {
		this.type = "Phone 타입";
		this.phoneNo = phoneNo;
	}
	
	public Phone(String type,String phoneNo) {
		super();
		this.type = type;
		this.phoneNo = phoneNo;
		
	}

	public String getType() {
		return type;
	}

	public String getPhoneNo() {
		return phoneNo;
	}
	
	// 전화 걸기 기능
	public void call() {
		System.out.println("Phone >> 전화 걸기");
	}
	
	// 전화 받기 기능
	public void receiveCall() {
		System.out.println("Phone >> 전화 받기");
	}
	
	// 메세지보내기

	public void sendMsg() {
		System.out.println("Phone >> 메세지 보내기");
	}

	// 메세지 받기

	public void receivceMsg() {
		System.out.println("Phone >> 메시지 받기");
	}
	
	// 전화 정보 보기
	public void view() {
		System.out.println("타입 : " + type + " 전화번호 : "+ phoneNo);
	}
	
}
