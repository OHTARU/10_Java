package edu.class2.basic;

/*
 	자동차 클래스
 	속성: 차량명 , 모델명, 차량색상
 	기능 : 가고 , 서고 ,뒤로가고 ,차량정보확인
 */

public class Car {

	// 필드변수(속성)
	String name = "마이카";
	String model;
	String color;
	
	boolean airBag;
	
	final int CAR_LENGTH = 350;
	final int CAR_WIDTH = 150;
	
	
	// 생성자
	// 클래스명() {} - 기본생성자
	// 클래스명(매개변수,...){}
	// 주의 : 명시적으로 생상자 선언시 기본생성자 만들어 주지 않음

	Car() {
		model = "기본모델";
	}

	Car(String n, String m, String c) {
		name = n;
		model = m;
		color = c;
	}

	// 메소드(기능, 동작, 함수)
	void run(int speed) {
		System.out.println(">> 앞으로 이동 " + speed +"km");
	}

	void stop() {
		System.out.println(">> 멈추기");
	}

	void back() {
		System.out.println(">> 후진");
	}
	
	
	void car_Info() {
		System.out.println("차량명 : " + name + " 모델명 : " + model + " 색상 : " + color);
		System.out.println("에어백 : " + airBag);
		System.out.println("차량 길이 : " + CAR_LENGTH + " 차량 폭 : " + CAR_WIDTH);
	}
	
	
}
