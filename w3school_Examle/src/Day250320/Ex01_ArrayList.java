package Day250320;

import java.util.ArrayList;

public class Ex01_ArrayList {

	public static void main(String[] args) {

		ArrayList<String> cars = new ArrayList<String>();
		
		
		cars.add("Volvo"); // 0번배열부터 추가
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		
		cars.add(0,"Mazda"); // 0번 배열에 있는 값 덮어쓰기
		cars.set(1, "KIA"); // 1번 배열에 있는 값 변경
		
		for(int i = 0 ; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		
	}

}
