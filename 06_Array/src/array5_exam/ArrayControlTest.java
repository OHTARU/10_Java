package array5_exam;

public class ArrayControlTest {

	public static void main(String[] args) {

		// 1. 숫자 10,20,30,40 을 저장한 배열(nums) 만들기
		// 2. 세번째 위치 값을 330로 변경(수정)
		// 3. 배열의 맨 뒤에 50 숫자값을 추가
		// 4. 배열 데이터의 맨 앞쪽에 5를 추가
		// 5. 세번째 데이터를 삭제
		// 6. 배열 데이터 중 40 값이 있으면 찾아 440 으로 수정

		// 1. 숫자 10,20,30,40 을 저장한 배열(nums) 만들기
		int[] nums = { 10, 20, 30, 40 };

		// 2. 세번째 위치 값을 330로 변경(수정)
		nums[2] = 330;

		printData(nums);

		// 3. 배열의 맨 뒤에 50 숫자값을 추가
		int[] tmp = new int[nums.length + 1];

		for (int i = 0; i < nums.length; i++) {
			tmp[i] = nums[i];
		}

		tmp[nums.length] = 50;

		nums = tmp;

		printData(nums);

		// 4. 배열 데이터의 맨 앞쪽에 5를 추가
		tmp = new int[nums.length + 1];

		tmp[0] = 5;

		for (int i = 0; i < nums.length; i++) {
			tmp[i + 1] = nums[i];
		}

		nums = tmp;

		printData(nums);

		// 5. 세번째 데이터를 삭제

		tmp = new int[nums.length - 1];

		int cnt = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i != 2) {
				tmp[cnt] = nums[i];
				cnt++;
			}
		}

		nums = tmp;

		printData(nums);

		// 6. 배열 데이터 중 40 값이 있으면 찾아 440 으로 수정
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 40) {
				nums[i] = 440;
			}

		}

		printData(nums);

	}

	static void printData(int[] num1) {
		for (int i = 0; i < num1.length; i++) {
			System.out.print(num1[i] + " ");
		}
		System.out.println();
	}
}
