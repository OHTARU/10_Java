package array3_2dim;

import java.util.Arrays;

public class ArrayTwoDimesion {

	public static void main(String[] args) {
		
		
		// 2차원 배열 선언 및 객체 생성
		// 타입[][] 변수명 = new 타입[크기][크기];
		// 타입 변수명[][] = new타입[크기][크기];
		// 타입[][] 변수명 = {{..},{,,}...,{,,}};
		
		int[][] nums = {{10,20},{30,40},{50,60}};
		
		
//		System.out.println("nums : " + nums);
//		System.out.println("nums[0] : " + nums[0]);
//		System.out.println("nums[0][0] : " + nums[0][0]);
//		System.out.println("nums[0][1] : " + nums[0][1]);
//		System.out.println("nums[1][1] : " + nums[1][1]);
//		System.out.println("nums[1][0] : " + nums[1][0]);
		
		
		for (int i = 0 ; i < nums.length; i++) {
			for(int j = 0 ; j < nums[i].length; j++) {
				System.out.println("nums["+i+"]"+"["+j+"] : " + nums[i][j]);
			}
			System.out.println();
		}
		
		

		
	}

}
