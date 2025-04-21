package array1;

import java.util.Arrays;

public class Ex01_array1 {

	public static void main(String[] args) {

		// 배열(array) : 동일한 데이터 타입들의 연속된 저장공간
		// 배열의 선연 : 자료형[] 변수명;
		// 배열에 값 저장: 배열변수명[인덱스번호] = 값;

		// 배열의 선언 및 생성
		// 1. 자료형[] 변수명 = new 자료형[크기];
		// 2. 자료형 변수명[] = new 자료형[크기];
		// 3. 자료형[] 변수명 = new 자료형[] { 값1, 값2, 값3...};
		// 4. 자료형[] 변수명 = { 값1, 값2, 값3...};

		int[] arr = new int[5]; // 5개를 저장할 수 있는 int배열 선언
//		System.out.println("arr : " + arr);
//		System.out.println("arr[0] : " + arr[0]);
//		
		arr[0] = 10;
		arr[1] = 11;
		arr[2] = 12;
		arr[3] = 13;
		arr[4] = 14;
//		System.out.println("변경된 arr[0] : " + arr[0]);

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
			sum += arr[i];
		}
		System.out.println("sum : " + sum);

		System.out.println("====================");

		int[] num = new int[] { 100, 101, 102, 103, 104 };

		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

		System.out.println("====================");

		int[] arr3 = { 10, 11, 12, 13, 14 };

		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}

		System.out.println("=========배열에 값넣기=========");

		int[] nums = new int[10];
		
		for ( int i = 0 ; i < nums.length ; i++) {
			nums[i] = i;
			System.out.println(nums[i] );
		}
		
		System.out.println("=====A to Z 추가하기=======");

		char[] AtoZ = new char[26];
		
		for (int i = 0; i < AtoZ.length ; i++) {
			AtoZ[i] = (char)('A' + i);
//			System.out.println(Arrays.toString(AtoZ));
		}
		System.out.println(Arrays.toString(AtoZ));
		
		
	}
}
