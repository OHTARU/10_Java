package edu.class2.basic;

public class Carmain {

	public static void main(String[] args) {
		System.out.println("=======CarMain=======");
		// Car 클래스 이용해서 Car 타입의 객체(인스턴스) 생성
		
		
		Car myCar = new Car();
		
		myCar.color = "초록색";
		
		System.out.println(myCar);
		System.out.println("차량명 : " + myCar.name);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색상 : " + myCar.color);
		System.out.println("에어백 : " + myCar.airBag);
		System.out.println("길이 : " + myCar.CAR_LENGTH);
		System.out.println("폭 : " + myCar.CAR_WIDTH);
		System.out.println("-- 기능테스트 --");
		myCar.run(100);
		myCar.stop();
		myCar.back();
		System.out.println("---- 차량 정보 ---- \n");
		myCar.car_Info();
		
		System.out.println("\n=======Car2=======");
		Car myCar2 = new Car("패밀리카","제네시스","검정색");
		
		System.out.println("차량명 : " + myCar2.name);
		System.out.println("모델명 : " + myCar2.model);
		System.out.println("색상 : " + myCar2.color);
		
		
	}

}
