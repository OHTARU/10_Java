package edu.class1.basic;

public class Ex03_method {

	// 메소드 4가지 형태
	// 1. 리턴값 없음 , 파라미터 있음
	// void 메소드명(){}

	// 2. 리턴값 있음 , 파라미터 있음(1~n개)
	// void 메소드명(파라미터 타입 변수명 , ....) {}

	// 3. 리턴값 있음, 파라미터 없음
	// 리턴타입 메소드명() {}

	// 4. 리턴값 있음, 파라미터 있음
	// 리턴타입 메소드명(파라미터타입 변수명, ...){}

	public Ex03_method() { // 생성자
	}

	public static void main(String[] args) {

		int num1 = 300;
		int num2 = 200;
		int sum = 0;

		sum = add(num1, num2);

//		System.out.println(sum);
		
		Ex03_method ex03 = new Ex03_method();
		
		int result = ex03.add1(num1, num2);
		System.out.println(result);
	}

	private static int add(int num1, int num2) {
		return num1 + num2;
	}

	static int add1(int a, int b) {
		return a + b;
	}

	int sub(int a, int b) {
		return a - b;
	}

	int mul(int a, int b) {
		return a * b;
	}

	int div(int a, int b) {
		return a / b;
	}

	void method1(String param) {
		System.out.println("파라미터값 X , return 값 X");
	}

	void method2(String param) {
		System.out.println("파라미터값 0 , return 값 x");
	}

	String method3(String param) {
		System.out.println("파라미터값 x , return 값 0");
		return "파라미터값 X , return 값 0";
	}

	String method4(String param) {
		System.out.println("파라미터값 0 , return 값 0");
		return "파라미터값 0 , return 값 0";
	}
}
