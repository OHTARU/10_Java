package com.mystudy.poly04_interface;

public class TypeTest {

	public static void main(String[] args) {
		// Cat cat = new Cat("마이고양이");
		Cat cat = new Cat();
		System.out.println("cat name : " + cat.getName());

		cat.eat();
		cat.sleep();
		cat.sound();
		cat.jump();

		Dog dog = new Dog();
		System.out.println("dog name : " + dog.getName());

		dog.eat();
		dog.sleep();
		dog.sound();

		Pig pig = new Pig();
		System.out.println("pig name : " + pig.getName());

		pig.eat();
		pig.sound();
		pig.sleep();

		System.out.println("===== Animal ( 인터페이스 ) 타입 사용 =====");
		// 인터페이스 타입으로 형변환시 인터페이스에 정의된 기능(메소드) 만 사용 가능

		Animal animal = new Cat();
		animal.eat();

		System.out.println("===== Animal ( 인터페이스 ) 타입 사용 =====");
		soundPoly(new Cat());
		soundPoly(new Dog());

		eatPoly(new Cat());
		eatPoly(new Dog());
	}

	// 인터페이스 Animal 타입으로 데이터를 받아서
	// 정의된 sound() 메소드 호출(실행)
	// (메소드 오버라이딩에 의해 저장된 객체의 메소드 호출된다)
	static void soundPoly(Animal animal) {
		animal.sound();

	}

	// 먹는 기능
	static void eatPoly(Animal animal) {
		animal.eat();
	}
	
	
}
