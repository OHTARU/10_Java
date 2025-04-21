
public class Ex06_long {

	public static void main(String[] args) {

		// 정수형 long : 8byte
		// 범위 : -9223372036854775808 ~ 223372036854775807
		// long 타입값 명시적 표현 : 숫자 + L or l( 영문 대소문자 상관없음 )

		System.out.println("---- long 타입 최소, 최댓값 ----");
		System.out.println("long 타입 최소값 : " + Long.MIN_VALUE);
		System.out.println("long 타입 최대값 : " + Long.MAX_VALUE);
		System.out.println("------------");

		long num1 = 20000000000L; // long 타입을 의미하는 접미어 (L , l) 사용
		long num2 = 30000000000l;
		long sum = num1 + num2;

		System.out.println(num1);
		System.out.println(num2);
		System.out.println("num1 + num2 = " + sum);

		System.out.println("-----------");

	}

}
