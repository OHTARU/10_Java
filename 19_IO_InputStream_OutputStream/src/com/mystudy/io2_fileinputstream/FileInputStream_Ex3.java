package com.mystudy.io2_fileinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStream_Ex3 {

	public static void main(String[] args) {
		File file = new File("file/test01.txt");

		FileInputStream fis = null;

		try {
			// 1. 파일을 읽기 위한 객체 생성
			fis = new FileInputStream(file);

			// read(byte[] b) 사용을 위한 byte 배열 선언
			byte[] bytes = new byte[10];
//			System.out.println("bytes : " + Arrays.toString(bytes));

			// (실습)2. 객체 사용 작업 처리(읽고, 화면출력 반복)
//			int readCount = fis.read(bytes);
			int readCount = 0; // 변수 초기화
			while ((readCount = fis.read(bytes)) != -1) { // 파일에서 데이터를 읽어 bytes 배열에 저장하고 읽은 바이트 수를 .readCount 에 저장 [파일
														// 종료시 -1 반환 하여 종료하면 while문 종료
				System.out.println("읽은횟수 : " + readCount);
				System.out.println("bytes : " + Arrays.toString(bytes));
				for (int i = 0; i < readCount; i++) {
					System.out.println("int값: " + bytes[i] + ", char: " + (char) bytes[i]);
				}
				System.out.println("------------");
				Arrays.fill(bytes, (byte) 0); // 10개 넘어가면 다음 배열은 0으로 설정 후 다시 시작
			}

//			readCount = fis.read(bytes);
//			System.out.println("읽은횟수 : " + readCount);
//			System.out.println("bytes : " + Arrays.toString(bytes));
//			for (int i = 0; i < readCount; i++) {
//				System.out.println("int값: " + bytes[i] + ", char: " + (char) bytes[i]);
//			}
//			System.out.println("------------");
//
//			readCount = fis.read(bytes);
//			System.out.println("읽은횟수 : " + readCount);
//			System.out.println("bytes : " + Arrays.toString(bytes));
//			for (int i = 0; i < readCount; i++) {
//				System.out.println("int값: " + bytes[i] + ", char: " + (char) bytes[i]);
//			}
//			System.out.println("------------");
//
//			readCount = fis.read(bytes);
//			System.out.println("읽은횟수 : " + readCount);
//			System.out.println("bytes : " + Arrays.toString(bytes));
//			for (int i = 0; i < readCount; i++) {
//				System.out.println("int값: " + bytes[i] + ", char: " + (char) bytes[i]);
//			}
//			System.out.println("------------");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 3. 사용 객체 닫기(close)
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
