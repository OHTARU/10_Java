
public class Ex07_for_star_exam {

	public static void main(String[] args) {

		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("=====================");

//		int cnt = 5;
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= cnt; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			cnt--;
//		}
//		System.out.println("=====================");

		// 문제 2 ----------
		/*
			     *
			    **
			   ***
			  ****
			 *****
			******
		 */

		for (int i = 0; i <= 5; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("=====================");
		// 문제 3 ------------
		/*
		 *****
		  ****
		   ***
		    **
		     *
		 */
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("=====================");
		/*
		 * 1 
		 * 2 2 
		 * 3 3 3 
		 * 4 4 4 4 
		 * 5 5 5 5 5
		 */

		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println("=====================");

		/*
		 * 1 
		 * 2 3 
		 * 4 5 6 
		 * 7 8 9 10
		 */

		int cnt2 = 1;
		for (int i = 2; i <= 5; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(cnt2 + " ");
				cnt2++;
			}
			System.out.println();
		}
		System.out.println("=====================");

		// ======= 이중 중첩문 한번에 빠져나가기 =======
		outter: for (int out = 1; out <= 5; out++) { // outter: << 라벨링
			for (int in = 1; in <= 5; in++) {
				System.out.println("out : " + out + " in : " + in);

				if (out == 4 && in == 3) {
					break outter; // 현재 반복중(내부반복문)
				}
			}
			System.out.println("----");
		}

		System.out.println("=====================");
		
		for (int i = 2; i <= 9 ; i++) {
			System.out.println("2 * " + i +" = " + (2*i));
		}
		
//		System.out.println("=====================");
//		
//		int start = 1;
//		int end = 9;
//		
//		for (int gugudan = 3 ; start <= end ; start++) {
//			System.out.println(gugudan + " * " + start + " = " + gugudan*start);
//		}
//		
		
		System.out.println("=====================");
		
		for ( int i = 2 ; i <= 9 ; i++) {
			System.out.println("===" + i + "단 계산" + "===");
			for ( int j = 1 ; j <= 9 ; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}
		
		
		System.out.println("=====================");
		
		for ( int i = 2 ; i <= 9 ; i++) {
			System.out.print(i + "단\t\t");
		}
		System.out.println();
	
		for ( int i = 1 ; i <= 9 ; i++) {
			for ( int j = 2 ; j <= 9 ; j++) {
	
				System.out.print(j + " * " + i + " = " + i*j  + "\t");
			}
			System.out.println();
		}
		
		
	}
}
