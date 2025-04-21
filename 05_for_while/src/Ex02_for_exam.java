
public class Ex02_for_exam {

	public static void Ex01(int i) {
		System.out.println("1번문제.-------------------");
		for ( ; i <= 5; i++) {
			System.out.println(i);
		}
	}

	public static void Ex02(int i) {
		System.out.println("2번문제.-------------------");
		for (; i <= 15; i++) {
			System.out.println(i);
		}
	}

	public static void Ex03(int i) {
		System.out.println("3번문제.-------------------");
		for (; i < 10; i += 2) {
			System.out.println(i);
		}
	}

	public static void Ex04(int i) {
		System.out.println("4번문제.-------------------");
		for (; i <= 10; i += 2) {
			System.out.println(i);
		}
	}

	public static void Ex05(int i) {
		System.out.println("5번문제.-------------------");
		for (; i > 0; i--) {
			System.out.println(i);
		}
	}
	
	public static void Ex06(int i) {
		System.out.println("6번문제.-------------------");
		
		for(; i <= 10; i += 2) {
			if (i%2 == 0) {
				System.out.println(i);
			} 
		}
	}
	
	public static void Ex07(int i) {
		System.out.println("7번문제.-------------------");
		
		for(; i <= 10; i += 2) {
			if (i%2 == 1) {
				System.out.println(i);
			} 
		}
	}

	
	
	
	public static void main(String[] args) {

		// 실습 1,2,3,4,5 화면출력

//		System.out.println("1번문제.-------------------");
//		for (int i = 1; i <= 5; i++) {
//			System.out.println(i);
//		}

//		System.out.println("2번문제.-------------------");
//		for (int i = 11; i <= 15; i++) {
//			System.out.println(i);
//		}

//		System.out.println("3번문제.-------------------");
//		for (int i = 1; i < 10; i += 2) {
//			System.out.println(i);
//		}

//		System.out.println("5번문제.-------------------");
//		for (int i = 2; i <= 10; i += 2) {
//			System.out.println(i);
//		}

//		System.out.println("6번문제.-------------------");
//		for (int i = 5; i > 0; i--) {
//			System.out.println(i);
//		}

		Ex01(1);
		Ex02(11);
		Ex03(1);
		Ex04(2);
		Ex05(5);
		Ex06(2);
		Ex07(1);
	}

}
