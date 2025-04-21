
public class Ex02_if_else {

	public static void main(String[] args) {
		// if 문 3종류
		// if (조건) {}
		// if (조건) {} else {}
		// if (조건) {} else if (조건) {} else if (조건) {} .... else {}
		
		
//		int num1 = 100;
//		int num2 = 50;
//		System.out.println("num1 : " + num1 + " , num2 : " + num2);
//		
//		//1. if (조건) {}
//		if (num1 > num2) {
//			System.out.println("num1 이 num2 보다 크다");
//		}
//		if (num1 <= num2) {
//			System.out.println("num1 이 num2 보다 작거나 같다");
//		}
//		
//		//2. if (조건) else {}
//		if (num1 > num2) {
//			System.out.println("num1 이 num2 보다 크다");
//		} else {
//			System.out.println("num1이 num2 보다 작거나 같다");
//		}
//		System.out.println(" else if 문 종료");
//		
//		
//		// 3. if (조건) {} else if (조건) {} else if (조건) {} .... else {}
//		// if문 작성방식 : else , else if 분리해서 작성
//		
//		if (num1 > num2) {
//			System.out.println("num1 이 num2 보다 크다");
//		} else if (num1 == num2) {
//			System.out.println("num1 과 num2 는 동일하다");
//		} else {
//			System.out.println("num1 이 num2 보다 작다");
//		}
//		
//		
		// 문제풀이 
		
		
		int score = -100;
		String name = "연창현";
		String result = null;
		
		if(score >= 90 && score <= 100) {
			result = "A";
		} else if (score >= 80 && score < 90) {
			result = "B";
		} else if (score >= 70 && score < 80) {
			result = "C";
		} else if (score >= 60 && score < 70) {
			result = "D";
		} else if (score >= 0 && score < 60) {
			result = "F";
		} else {
			result = "제대로된 점수를 입력해주세요 0 ~ 100";
		}
		
		System.out.println(name + "님의 점수는 : " + score + " 학점 : " + result + "입니다");
	}

}
