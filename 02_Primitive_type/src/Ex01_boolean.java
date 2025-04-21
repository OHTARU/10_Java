
public class Ex01_boolean {
	public static void main(String[] args) {
		// boolean : true , false 값을 가짐 ( 논리형 )
		// 사용타입지정 사용변수명; , 사용타입지정 사용변수명 = 초기값;
		// 타입 변수명 = 값; // 변수선언 + 초기값 설정

		boolean bool1 = false;

//		System.out.println(bool1);

		if (bool1 == true) {
			System.out.println("bool1 이 true 일때 출력 > bool1 : " + bool1);
		} else {
			System.out.println("bool1 이 false 일때 출력 > bool1 : " + bool1);
		}
		System.out.println("--- main 메소드 종료 ---");
	}
}
