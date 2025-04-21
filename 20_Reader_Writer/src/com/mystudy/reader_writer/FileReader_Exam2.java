package com.mystudy.reader_writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_Exam2 {

	public static void main(String[] args) {
		// (실습) FileReader_Exam1 내용을 반복문으로 처리(모든 읽고 화면출력)

		File file = new File("file/test_char.txt");

		FileReader fr = null;

		try {
			// 1. 객체(인스턴스) 생성
			fr = new FileReader(file);

			// 2. 객체 사용 작업 처리(1문자 읽고, 화면출력)
//			int readValue = fr.read();
//			System.out.println("첫번째문자값 : " + readValue + ", char: " + (char) readValue);
//
//			readValue = fr.read();
//			System.out.println("두번째문자값 : " + readValue + ", char: " + (char) readValue);
//
//			readValue = fr.read();
//			System.out.println("세번째문자값 : " + readValue + ", char: " + (char) readValue);

			int readValue = 0;
			while ((readValue = fr.read()) != -1) { // readValue = fr.read() >> fr.read() 에서 불러온 값을 readValue 에 대입
				System.out.println("문자값 : " + readValue + ", char : " + (char) readValue);

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 3. 사용객체 닫기(close)
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
				}
			}
		}

	}

}
