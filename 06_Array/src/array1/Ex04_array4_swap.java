package array1;

public class Ex04_array4_swap {

	public static void main(String[] args) {

		// 변수값 서로 교환하기
		int a = 500;
		int b = 300;
		int temp = 0;

		System.out.println("교환 전 a : " + a);
		System.out.println("교환 전 b : " + b);

		System.out.println("------------");

		temp = a;
		a = b;
		b = temp;

		System.out.println("교환 후 a : " + a);
		System.out.println("교환 후 b : " + b);

		System.out.println("------------");

		int[] arr1 = { 1, 2, 3, 4 };

		for (int i = 0; i < arr1.length; i++) {
			System.out.println("변경 전 arr1 : " + arr1[i]);
		}

		System.out.println("------------");

		temp = arr1[0];
		arr1[0] = arr1[1];
		arr1[1] = temp;

		for (int i = 0; i < arr1.length; i++) {
			System.out.println("변경 후 arr1 : " + arr1[i]);
		}

		int[] arr2 = { 100, 200, 300, 400, 500 };

		for (int i = 0; i < arr2.length; i++) {
			if (i == 0) {
				temp = arr2[i];
				arr2[i] = arr2[4];
				arr2[4] = temp;
			}
			else if (i == 1) {
				temp = arr2[i];
				arr2[i] = arr2[3];
				arr2[3] = temp;
			}
			System.out.println("바뀐 arr2 : " + i + "번지 : " + arr2[i]  );
		}

	}

}
