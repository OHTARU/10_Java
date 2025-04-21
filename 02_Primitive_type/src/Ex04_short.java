
public class Ex04_short {

	public static void main(String[] args) {

		// 정수형 short : 2byte( 갯수 : 65536 , 범위 : -32768 ~ 32767 )
		System.out.println("---- short 최소 , 최댓값 ----");
		System.out.println("short 최소값 : " + Short.MIN_VALUE);
		System.out.println("short 최대값 : " + Short.MAX_VALUE);
		System.out.println("-----");

		short short1 = 20000;
		short short2 = 30000;

		System.out.println("short1 : " + short1);
		System.out.println("short2 : " + short2);

//		int sum = short1 + short2;
		short sum = (short) (short1 + short2);

		System.out.println("sum : " + sum);

		int sumInt = short1 + short2;
		System.out.println("int sumInt : " + sumInt);
	}

}
