
public class Ex05_for_exam {
	public static void main(String[] args) {

		// 문제 : 1~10까지의 숫자중 2의 배수(짝수) 를 출력해라
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				continue;
			}
			System.out.print(i + " ");
		}

		System.out.println();

		// 문제 : 1 ~ 20 숫자 중 3의 배수인 숫자를 출력
		for (int i = 1; i <= 20; i++) {
			if (i % 3 != 0) {
				continue;
			}
			System.out.print(i + " ");
		}

		System.out.println();

		// 문제 : 900 ~ 1000 숫자 중 17의 배수인 숫자를 출력
		for (int i = 900; i <= 1000; i++) {
			if (i % 17 != 0) {
				continue;
			}
			System.out.print(i + " ");
		}

		System.out.println();

		// 문제 : 20000 ~ 30000 숫자 중 399의 배수인 숫자를 출력
		for (int i = 20000; i <= 30000; i++) {
			if (i % 399 != 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		
		//변수를 사용해서 일반화 하기
		int startNum = 900;
		int endNum = 1000;
		int divNum = 17;
		
		
		for(int i = startNum; i <= endNum; i++) {
			if (i % divNum != 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		
		
	}
}
