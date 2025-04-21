package com.mystudy.io2_fileinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_Ex2 {

	public static void main(String[] args) {
		File file = new File("file/test01.txt");

		FileInputStream fis = null;

		try {
			// 1. 객체 생성
			fis = new FileInputStream(file);
			int readValue = fis.read();
			// 2. 객체 사용 작업처리(1 byte 읽고, 화면 출력)

			while (true) {
				try {
					readValue = fis.read();
				} catch (IOException e) {
					e.printStackTrace();
					break;
				}
				if (readValue == -1)
					break;
				System.out.println("read() int값 : " + readValue);
				System.out.println("char : " + (char) readValue);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
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
