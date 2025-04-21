
public class Ex01_if {

	public static void main(String[] args) {
		/*
		 * 제어문 - 분기문(비교문) : if문 if (조건문){ 실행할 문장들(조건이 참일때); }
		 * 
		 */
		int num1 = 10;
		int num2 = 20;

		if (num1 < num2) {
			System.out.println("num1이 num2 보다 작다");
		}

		System.out.println(" >> 비교작업 끝");
		System.out.println("=====================");

		boolean result = num1 < num2;

		if (result) {
			System.out.println("num1이 num2 보다 작다");
		}

		System.out.println(" >> 비교작업 끝2");

		System.out.println("======성적처리======");

		String name = "연창현";
		int score = 100;
		String result2 = null;
		
		if (score >= 90 && score <= 100) {
//			System.out.println("평과결과 : A");
			result2 = "A";
		}
		if (score >= 80 && score <= 89) {
//			System.out.println("평과결과 : B");
			result2 = "B";
		}
		if (score >= 70 && score <= 79) {
			result2 = "C";
//			System.out.println("평과결과 : C");
		}
		if (score >= 79 && score <= 60) {
			result2 = "D";
//			System.out.println("평과결과 : D");
		}
		if (score >= 0 && score <= 59) {
			result2 = "F";
//			System.out.println("평과결과 : F");
		}		
		System.out.println("평가 성적 : " + result2);
		System.out.println("======성적처리종료======");

	}

}
