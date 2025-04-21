
public class Ex05_max_value {

	public static void main(String[] args) {

//		// (실습) 숫자 3개 중 가장 큰 수를 구하시오
//		// a : 30 , b : 60 , c : 20
//		
//		//< 결과 >
//		//가장 큰 수 : 60
//		
//		
//		int a = 70;
//		int b = 60;
//		int c = 100;
//		
//		int max = (a > b) && (a > c) ? a : (b < c ? c : b);
//		int min = (b > a) && (c > a) ? a : (b > c ? c : b); 
//		
//		System.out.println("삼항 연산자를 이용한 최대값 : " + max);
//		System.out.println("삼항 연산자를 이용한 최대값 : " + min);
//	
//		max = 0;
//		min = 0;
//		
//		
//		//Max
//		if (a>b && a>c) {
//			max = a;
//		} else if (b < c) {
//			max = c;
//		} else {
//			max = b;
//		}
//		
//		//Min
//		if (b < a && c < a) {
//			min = a;
//		} else if (b > c) {
//			min = c;
//		} else {
//			min = b;
//		}
//		
//		System.out.println("if 문을 사용한 최대값 : " + max);
//		System.out.println("if 문을 사용한 최소값 : " + min);
//
//		
////		int max2 = Math.max(Math.max(a, b),c);
////		int min2 = Math.min(Math.min(a, b),c);
////		System.out.println(max2);
////		System.out.println(min2);
//		
//		
//		int max3 = a;
//		
//		if (b > max3) {
//			max3 = b;
//		}
//		if (c > max3) {
//			max3 = c;
//		}
//		System.out.println(max3);
		
		
		int a = 60;
		int b = 70;
		int c = 120;
		int d = 90;
		int e = 110;
		
		int max4 = a;
		
		if (b > max4) {
			max4 = b;
		}
		if (c > max4) {
			max4 = c;
		} 
		if (d > max4) {
			max4 = d;
		} 
		if (e > max4) {
			max4 = e;
		}
		System.out.println(max4);
		
		
		int max = (a > b) && (a > c) && (a > d) && (a > e) ? a : ((b > c) && (b > d) && (b > e) ? b : ((c > d) && (c > e) ? c : (d > e) ? d : e));
		System.out.println(max);
	}

}
