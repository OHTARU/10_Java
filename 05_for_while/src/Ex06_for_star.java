
public class Ex06_for_star {

	public static void main(String[] args) {

//		for (int i = 1; i <= 3; i++) {
//			for (int j = 1; j <= 5; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		System.out.println("==== 삼각형 * 찍기 ====");

		for (int i = 1; i <= 5; i++) {
			for (int j = 0 ; j < i ; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

		// 별 하나 후 줄바꿈 i = 1 , j = 0 
		// 별 두개 후 줄바꿈 i = 2 , j = 1
		// 별 세개 후 줄바꿈 i = 3 , j = 2
		// 별 네개 후 줄바꿈 i = 4 , j = 3
		// 별 다섯개 후 줄바꿈 i = 5, j = 4
		
		
		
	}
}
