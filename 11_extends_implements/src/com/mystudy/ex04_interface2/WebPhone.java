package com.mystudy.ex04_interface2;

// WebPhone 클래스를 정의하고 기능구현
// I_WebPhone 인터페이스 기능을 모두 구현

// Mp3Phone 클래스를 상속확장(extends)해서 사용하고
// I_WebPhone 인터페이스를 구현해서 만들기

class WebPhone extends Mp3Phone implements I_WebPhone{
	private String type;
	private String phoneNo;

	public WebPhone() {

	}

	public WebPhone(String phoneNo) {
		super("WebPhone", phoneNo); // Phone 클래스에다가
	}

	public WebPhone(String type, String phoneNo) {
		super();
		this.type = type;
		this.phoneNo = phoneNo;

	}

	@Override
	public void searchWeb() {
		// TODO Auto-generated method stub
		System.out.println(">> 웹 검색");
	}
}
