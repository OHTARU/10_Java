
public class Ex04_plusEqual {

	public static void main(String[] args) {

		// 대입연산자 : = , +=, -= , *= , /= , %=
		// 예) num += 2; ---> num = num + 2;

		int num1 = 10;
		int num2 = 20;
		int result = 0;

		System.out.println("==== += 연산자 ====");
		System.out.println("result 초기값 : " + result);

		result += num1;
		System.out.println("result += num2 : " + result);

		System.out.println("==== -= 연산자 ====");

		result -= 15;
		System.out.println("result -= num2 : " + result);

		System.out.println("==== *= 연산자 ====");

		result *= 15;
		System.out.println("result *= num2 : " + result);
		
		System.out.println("==== /= 연산자 ====");

		result /= 15;
		System.out.println("result /= num2 : " + result);
		
		System.out.println("==== %= 연산자 ====");

		result %= 2;
		System.out.println("result &= num2 : " + result);
	}

}
