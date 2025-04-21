package com.mystudy.ex02_extends;

class Mp3WebPhone extends Phone{

	public Mp3WebPhone(String phoneNo) {
		super("Mp3WebPhone","010-4444-4444");
	}
	
	public Mp3WebPhone(String type,String phoneNo) {
		super(type,phoneNo);
	}

	public void webSearch() {
		System.out.println(">>Mp3WebPhone - 웹 검색");
	}
	
	public void playMusic() {
		System.out.println("Mp3WebPhone >> Mp3WebPhone - 음악 플레이");
	}
}
