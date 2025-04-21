package array2_sort;

import java.util.Arrays;

public class ArraySelectionSort {

	public static void main(String[] args) {

		int[] sortNum = { 40, 30, 20, 25, 36 };

		if (sortNum[0] > sortNum[1]) {
			int tmp = sortNum[0];
			sortNum[0] = sortNum[1];
			sortNum[1] = tmp;

			System.out.println("0번지 1번지 변경 : " + sortNum[0] + " " + sortNum[1]);
		} else {

			System.out.println("0번지 1번지 미변경 : " + sortNum[0] + " " + sortNum[1]);
		}

		int[] num = { 30, 20, 50, 40, 10 };

		System.out.println("==선택정렬 오름차순==");

		for (int i = 0; i < num.length - 1; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					int tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}

			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

		System.out.println("\n==선택정렬 내림차순==");

		for (int i = 0; i < num.length - 1; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] < num[j]) {
					int tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}

			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
//		printData(num);
	}
	
	static void printData(int[] num) {
		for (int i = 0 ; i < num.length ; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}
}
