
public class Ex08_double {

	public static void main(String[] args) {

		// 실수형 double : 8byte
		// 표시형식 숫자.숫자 또는 숫자.숫자 + D 또는 d
		// 참고 : 소수점 이하 15자리까지만 정확도 유지

		System.out.println("double 최소값 : " + Double.MIN_VALUE);
		System.out.println("double 최대값 : " + Double.MAX_VALUE);

		System.out.println("-----------------------------------");

		double d1 = 1.1;
		double d2 = 1.12345678901234567890d;

		System.out.println("double d1 : " + d1);
		System.out.println("double 1.12345678901234567890 : " + d2);

		double sum = d1 + d2;

		System.out.println("d1 + d2 : " + sum);

		System.out.println("3.4d + 3.2d : " + (3.4d + 3.2d));
	}

}
