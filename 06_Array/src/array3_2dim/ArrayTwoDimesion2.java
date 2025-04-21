package array3_2dim;

import java.util.Arrays;

public class ArrayTwoDimesion2 {

	public static void main(String[] args) {

		
		int[][] nums = new int[3][];
		
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.deepToString(nums));
		
		nums[0] = new int[2];
		nums[0][0] = 10;
		nums[0][1] = 20;
		

		System.out.println(Arrays.toString(nums[0]));
		System.out.println(Arrays.deepToString(nums));
		
		
		
		nums[1] = new int[] {30,40};
		nums[2] = new int[] {50,60,70};
		
		System.out.println(Arrays.deepToString(nums));
		
	}

}
