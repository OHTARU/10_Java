package array1;

public class Ex03_array3_star {

	public static void main(String[] args) {

		//char 배열을 이용한 피라미드 쌓기

		char[] arr1 = { '0', '1', '2', '3', '4' };
		char[] arr2 = { '!', '@', '#', '$', '%' };

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(arr1[j] + " ");
			}
			System.out.println();
		}

		System.out.println("==================");

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				System.out.print(arr1[j] + " ");
			}
			System.out.println();
		}

		System.out.println("=======================");

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(arr2[j] + " ");
			}
			System.out.println();
		}

		System.out.println("==================");

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				System.out.print(arr2[j] + " ");
			}
			System.out.println();
		}

	}

}
