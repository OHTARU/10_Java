
public class Ex05_int {
	public static void main(String[] args) {

		// 정수형 int : 4byte , 범위(-2147483648 ~ 2147483647)
		// 대략 21억까지 안전하다

		System.out.println("---- int 최소값, 최대값 ----");
		System.out.println("int 최소값 : " + Integer.MIN_VALUE);
		System.out.println("int 최대값 : " + Integer.MAX_VALUE);

		int num1 = 70000;
		int num2 = 30000;
		int sum = num1 + num2;

//		ctrl + / = 줄단위 주석처리
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("sum : " + sum);
		System.out.println("num1 : " + num1 + " num2 : " + num2 + " = " + sum);
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + (num1 / num2));

		// 나눈 후 나머지 구해줌 %
		System.out.println("num1 % num2 = " + (num1 % num2));

		// num2 = 0;
		// System.out.println(num1/num2); //Exception in thread "main"
		// java.lang.ArithmeticException: / by zero

		System.out.println("----main() 메소드 종료----");

	}
}
