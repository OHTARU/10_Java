package Day250319;

import java.util.Scanner;

public class Ex05_Scanner {

	public static void main(String[] args) {

		Scanner myObj = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String userName = myObj.nextLine();
		
		System.out.print("나이 입력 : ");
		int age = myObj.nextInt();
		
		System.out.print("월급 입력 : ");
		double salary = myObj.nextDouble();
		
		System.out.println("이룸 : " + userName);
		System.out.println("나이 : " + age);
		System.out.println("월급 : " + salary);

	}

}

/*
 * nextBoolean() : boolean 
 * nextByte() : byte 
 * nextDouble() : double 
 * nextFloat() : float 
 * nextInt() : int 
 * nextLine() : String 
 * nextLong() : long 
 * nextShort() : short
 */