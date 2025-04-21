package com.mystudy.list2_vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Vector_Exam {

	public static void main(String[] args) {
		// Vector 클래스 : List 계열
		Vector<String> v = new Vector<String>();
		v.add("1번");
		v.add("2번");
		v.add("3번");

		System.out.println(v);
		System.out.println("v.size() : " + v.size());
		System.out.println("v.capacity() : " + v.capacity());

		System.out.println("--- trimToSize() ---");
		v.trimToSize();

		System.out.println(v);
		System.out.println("v.size() : " + v.size());
		System.out.println("v.capacity() : " + v.capacity());

		v.addElement("4번문자열");
		System.out.println(v);

		System.out.println("===== Enumeration 객체 사용 ======");
		v.elements();
		v.addElement("4번문자");
		System.out.println(v);

		Enumeration<String> enu = v.elements();
		while (enu.hasMoreElements()) {
			System.out.println("enu.nextElements() : " + enu.nextElement());
		}

		for (; enu.hasMoreElements();) {
			System.out.println("enu.nextElements() : " + enu.nextElement());
		}

		System.out.println("Iterator 사용");
		Iterator<String> ite = v.iterator(); // 수정된 부분
		while (ite.hasNext()) {
			String str = ite.next();
			System.out.println("ite.next() : " + str);
			if ("AAA".equals(str)) {
				ite.remove();
			}

		}
	}

}
