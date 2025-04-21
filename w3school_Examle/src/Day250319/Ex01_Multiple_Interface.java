package Day250319;

// 1. 인터페이스 생성
interface FirstInterface { // 첫번째 인터페이스 생성
	public void myMethod();
}
// 1-2. 인터페이스 생성
interface SecondInterface{ // 두번째 인터페이스 생성
	public void myOtherMethod();
}

// 2. 클래스 및 인터페이스 implements 구현
class DemoClass implements FirstInterface, SecondInterface{ // FirstInterface와 SecondInterface를 DemoClass에서 구현
	// 2-1. 메소드 생성
	public void myMethod() { // myMethod() 생성
		System.out.println("Some text...");
	}
	// 2-2. 메소드 생성
	public void myOtherMethod() { // myOtherMethod() 생성
		System.out.println("Some other text...");
	}
}

public class Ex01_Multiple_Interface {

	public static void main(String[] args) {
		// 3. 객체 생성
		DemoClass myObj = new DemoClass(); // DemoClass 객체 선언
		// 4. 메소드 선언
		myObj.myMethod(); // myObj.myMethod() 출력
		myObj.myOtherMethod(); // myObj.myOtherMethod() 출력
	}

}
