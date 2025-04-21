package com.mystudy.poly04_interface;

class Pig extends AbstractAnimal {

	public Pig() {
		super("돼지");
	}

	public Pig(String name) {
		super(name);
	}

	@Override
	public void sound() {
		System.out.println(">>꿀꿀~~");
	}

//class Pig implements Animal {
//
//	@Override
//	public void eat() {
//		System.out.println("먹는다");
//	}
//
//	@Override
//	public void sleep() {
//		System.out.println("잔다");
//	}
//
//	@Override
//	public void sound() {
//		System.out.println("잔다");
//	}

}
