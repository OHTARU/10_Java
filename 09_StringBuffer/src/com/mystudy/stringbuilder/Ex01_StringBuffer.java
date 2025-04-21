package com.mystudy.stringbuilder;

public class Ex01_StringBuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		// StringBuffer 클래스 : 쓰레드에서 안전하게 사용 가능
		
		System.out.println("sb : " + sb);
		System.out.println("sb : " + sb.toString());
		System.out.println("sb.length() : " + sb.length());
		System.out.println("sb.capacity() : " + sb.capacity());

		System.out.println("---------------------------------");
		System.out.println("sb.toString() : " + sb.toString());
		StringBuffer appendReturn = sb.append(" 반갑습니다.");

		System.out.println("append 후 sb : " + sb.toString());
		System.out.println("appendReturn : " + appendReturn);
		System.out.println("sb == appendReturn : " + (sb == appendReturn));

		System.out.println("sb.length() : " + sb.length());
		System.out.println("sb.capacity() : " + sb.capacity());

		sb.reverse();
		System.out.println("reverse() : " + sb);
		sb.reverse();
		System.out.println("reverse() : " + sb);

		System.out.println("--- delete() , insert() , replace() ---");

		System.out.println("sb.delete(0, 6) : " + sb.delete(0, 6));
		System.out.println("sb : " + sb.toString());

		sb.insert(0, "Hello");
		System.out.println("sb.toString() : " + sb.toString());

		System.out.println("sb.replace(0,5,\"Hi,\") : " + sb.replace(0, 5, "Hi"));
		System.out.println("sb : " + sb.toString());
		
		System.out.println("sb.length() : " + sb.length());
		System.out.println("sb.capactiy() : " + sb.capacity());
		System.out.println("-------------------------");
		
		StringBuffer sb2 = new StringBuffer(100);
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println("sb2.capactiy() : " + sb2.capacity());
		
		System.out.println("---- trimToSize() ----");
		sb.trimToSize();
		System.out.println("sb2 : " + sb2.toString());
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println("sb2.capacity() : " + sb2.capacity());
		
		System.out.println(">> sb2.setLength(5) 실행후 ---");
		sb2.setLength(5);
//		sb2.delete(5, 0);
		System.out.println("sb2 : " + sb2.toString());
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println("sb2.capacity() : " + sb2.capacity());
		
		
		
	}
}
