
public class Ex07_float {

	public static void main(String[] args) {
		// 실수형 float : 4byte
		// f or F를 붙여야 float 타입이 됨 -> 안하면 double

		System.out.println("---- float 최소, 최대값 ----");
		System.out.println("---- float 최소값: " + Float.MIN_VALUE);
		System.out.println("---- float 최대값: " + Float.MAX_VALUE);
		System.out.println("========");

		float f1 = 3.4f;
		float f2 = 3.2F;

		System.out.println("float 3.4f: " + f1);
		System.out.println("float 3.2f: " + f2);
		System.out.println("3.4f + 3.2f: " + f1 + f2);
		System.out.println("3.4f + 3.2f: " + (3.4f + 3.2f));
	}

}
