
public class Ex10_while {

	public static void main(String[] args) {

		// 반복문 : for , while , do ~ while
		/*
		 * while 반복문 사용 형태 while (실행 조건식) { 반복인자의 선언 및 초기값 설정(선택적);
		 * 
		 * }
		 */

		int i = 1;

		while (i <= 10) {

			System.out.println(i + " 번째 출력");

			i++;
		}
		
		
		
		System.out.println("======do ~ while======");
		
		i = 0;
		do {

			System.out.println(i);
			i++;
		} while ( i < 10);
		
		
	}
}
