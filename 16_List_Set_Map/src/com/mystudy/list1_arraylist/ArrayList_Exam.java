package com.mystudy.list1_arraylist;

import java.util.ArrayList;

public class ArrayList_Exam {

	public static void main(String[] args) {
		// ArrayList : Array(배열)의 속성을 가진 List(목록)
		// ---------------------------

		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("list.size() : " + list.size());
		System.out.println("list : " + list);

		// 추가 (C) , 맨 앞에 데이터 추가
		System.out.println("---- add(index) ----");
		list.add(new Integer(5)); // Integer 저장
		list.add(1);
		list.add(5);
		list.add(7);
		list.add(9);
		System.out.println("list : " + list);

		// 추가(C) , 지정 위치에 데이터 추가
		System.out.println("---- add(index , 데이터) ----");
		list.add(0, 100);
		System.out.println("list : " + list);

		// 수정(U) , 지정된 위치에 데이터 수정 변경
		System.out.println("---- set(index , 데이터) ----");
		list.set(0, 999);
		System.out.println("list : " + list);

		// 조회 , 검색 (R) : 특정 위치의 데이터 읽기( 조회, 검색, 확인 , 선택)
		System.out.println("---- get(index) ----");
		int firstData = list.get(0);
		System.out.println("list.get(0) : " + firstData);
		System.out.println("list.get(1) : " + list.get(1));
		System.out.println("list : " + list);

		// 삭제 (D) : 특정 위치 데이터 삭제
		System.out.println("---- remove(index) ----");
		System.out.println("삭제 전 list : " + list);
		int returnValue = list.remove(0);
		System.out.println("list.remove(0) : " + list.remove(0));
		System.out.println("list.remove(0) : " + returnValue);
		System.out.println("삭제 후 list : " + list);

		System.out.println("------------------------");

		list.add(888);
		System.out.println("삭제 전 list : " + list);
		System.out.println("삭제 전 list.size() : " + list.size());

		// remove(int index) 삭제
		Integer removedData = list.remove(3); // int 3 전달
		list.remove(removedData);
		System.out.println("삭제 후 list : " + list);
		System.out.println("삭제 후 list.size() : " + list.size());

		// remove(Object o)
		boolean removceSuccess = list.remove(Integer.valueOf(5));
		System.out.println("list.remove(Integer 5) 실행 후 list : " + list);
		System.out.println("삭제 후 list.size() : " + list.size());
		System.out.println("삭제여부 : " + removceSuccess);

		System.out.println("==== 전체 데이터 사용 ====");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}

		System.out.println("==== (실습) 모든 데이터 삭제 (반복문 사용) ====");

		// list.clear();

//		for (int i = (list.size() - 1); i >= 0; i--) {
//			list.remove(i);
//		}

		int lastIdx = (list.size() - 1); // cnt(count) 변수명보다는 lastIdx(lastIndex) 로 직관적으로 하는게 더 좋음

		while (lastIdx >= 0) {

			list.remove(lastIdx);
			lastIdx--;
		}

		System.out.println("삭제 후 list : " + list);
		System.out.println("삭제 후 list.size() : " + list.size());

	}

}
