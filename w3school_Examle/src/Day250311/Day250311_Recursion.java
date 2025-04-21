package Day250311;

public class Day250311_Recursion {

	public static void main(String[] args) {

		int result = sum(10);
		System.out.println("1~10 더하기 : " + result);

		System.out.println("거듭제곱 : " + power(2,5));
		
		System.out.println("재귀함수 5 ~ 10 더하기 : " + sum1(5,10));
	}

	public static int power(int base , int exponent) {
		if (exponent == 0 ) {
			return 1;
		} else {
			return base * power(base , exponent - 1);
		}
	}

	public static int sum(int k) {
		if (k > 0) {
			return k + sum(k - 1);
		} else {
			return 0;
		}
	}
	
	public static int sum1(int start, int end) {
		if ( end > start ) {
			return end + sum1(start , end - 1);
		} else {
			return end;
		}
	}
	
	
}
