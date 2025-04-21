package com.mystudy.ex02_extends;


//Phone 클래스를 상속받아서(extends : 확장해서 )
// Phone 허용한 속성, 기능을 사용 + Mp3Phone 속성 ,기능 추가 작성
public class Mp3Phone extends Phone{
	
	public Mp3Phone(String phoneNo) {
		super("Mp3Phone타입",phoneNo);
	}
	
	
	public Mp3Phone(String type , String phoneNo) {
		super(type, phoneNo);
	}
	

	public void playMusic() {
		System.out.println("Mp3Phone >> Mp3Phone - 음악 플레이");
	}
}
