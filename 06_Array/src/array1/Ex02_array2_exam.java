package array1;

public class Ex02_array2_exam {

	public static void main(String[] args) {

		int[] nums2 = new int[]{ 3, 8, 7, 10, 6, 9, 1, 5, 2, 4 };

		int sum = 0;

		for (int i = 0; i < nums2.length; i++) {
			System.out.println("nums2[" + i + "] : " + nums2[i]);
		}

		System.out.println("================================");
		for (int i = 0; i < nums2.length; i++) {
			if (nums2[i] % 2 == 1) {
				System.out.println("배열에 입력된 홀수 : " + nums2[i]);

				sum += nums2[i];
			}
		}
		System.out.println("홀수 총 합계 : " + sum);

		
		System.out.println("================================");
		int[] nums = new int[10];
		
		System.out.println("nums.length : " + nums.length);
		
		
		for (int i = 0 ; i < nums.length ; i++) {
			nums[i] = i + 1;
		}
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println("nums[" + i + "] : " + nums[i]);
		}
		
	}

}
