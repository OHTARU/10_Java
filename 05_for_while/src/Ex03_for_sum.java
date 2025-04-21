
public class Ex03_for_sum {

	public static void main(String[] args) {

		// 1~ 10까지 합계
		
		int sum = 0;
		for (int i = 1 ; i <= 10 ; i++) {
			sum += i;
		}
		
		System.out.println(sum);

		
		
		
		int i = 1;
		int sum1 = 0;
		
		do {
			sum1 += i;
			i++;
		} while (i<=10);
		System.out.println(sum1);
		
		
	}

}
