package com.mystudy.ex04_interface2;

// 인터페이스는 static final 속성값 ,추상(abstract) 메소드가 있다.

interface I_Phone { // public 있고 없고

	
	//{} 없음 abstract method (추상 메소드)
	public abstract void view();
	public void call(); // abstract 생략
	void receivceCall(); // public abstract 생략
	void sendMsg(); // public abstract 생략
	void receivceMsg(); // public abstract 생략
}
