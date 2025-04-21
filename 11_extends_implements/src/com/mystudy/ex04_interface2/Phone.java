package com.mystudy.ex04_interface2;

class Phone implements I_Phone {

	private String type;
	private String phoneNo;

	public Phone() {

	}

	public Phone(String phoneNo) {
		this.type = "Phone 타입";
		this.phoneNo = phoneNo;
	}

	public Phone(String type, String phoneNo) {
		super();
		this.type = type;
		this.phoneNo = phoneNo;

	}

	@Override
	public void view() {
		// TODO Auto-generated method stub
		System.out.println("Phone>>타입 : " + type + " 전화번호 : " + phoneNo);
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Phone >> 전화 걸기");
	}

	@Override
	public void receivceCall() {
		// TODO Auto-generated method stub
		System.out.println("Phone >> 전화 받기");
	}

	@Override
	public void sendMsg() {
		// TODO Auto-generated method stub
		System.out.println("Phone >> 메시지 보내기");
	}

	@Override
	public void receivceMsg() {
		// TODO Auto-generated method stub
		System.out.println("Phone >> 메시지 받기");

	}

}
