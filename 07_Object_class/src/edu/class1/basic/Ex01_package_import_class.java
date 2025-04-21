package edu.class1.basic;

// (java.lang) 이외의 패키지에 있는 타입 사용시 적용
import java.util.Scanner;
//import java.util.*; 

public class Ex01_package_import_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("package, import, class 알아보기");

		Scanner sc = new Scanner(System.in);
		System.out.print(">> 인사말 : ");
		String Hello = sc.nextLine();
		System.out.println(Hello);
	}

}
