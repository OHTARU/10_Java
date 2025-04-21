package array4_copy;

public class ArrayCopy {

	public static void main(String[] args) {

		// 배열 복사
		int[] num1 = new int[5];
		int[] num2 = new int[5];
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);

		System.out.println("num1 == num2 은 " + (num1 == num2)); // 서로다른 객체

		num1[0] = 10;
		num1[1] = 20;
		num1[2] = 30;
		num1[3] = 40;
		num1[4] = 50;

//		for (int i = 0; i < num1.length; i++) {
//			System.out.println(num1[i] + " ");
//		}
//		

		printData(num1);
		printData("num1", num1);

		System.out.println("====== 배열 복사 ( 주소값 복사 , 얕은 복사 ) =====");

		num2 = num1; // 주소값 복사(참조형 데이터)

		System.out.println("====== 배열 복사 ( 물리적 복사 ) =====");
		int[] num3 = new int[3];
		printData(num3);

		for (int i = 0; i < num3.length; i++) {
			num3[i] = num1[i];
		}

		printData("num1", num1);
		printData("num3", num3);

		System.out.println("============================");

		int[] num4 = new int[num1.length];

		//system.arraycopy(src,srcPos,des,desPos,length)
		//system.arraycopy(소스객체,시작위치,대상객체,대상시작위치,갯수)
		
		System.arraycopy(num1, 0, num4, 0, num1.length);
		
		System.out.println(">>System.arraycopy() 복사 후 ");
		printData("num1",num1);
		printData("num4",num4);
		
		
		// 배열복사방식 
	
	}

	static void printData(int[] num1) {
		for (int i = 0; i < num1.length; i++) {
			System.out.println(num1[i] + " ");
		}
	}

	// 오버라이딩
	static void printData(String name, int[] arr) {
		System.out.print(name + " : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
