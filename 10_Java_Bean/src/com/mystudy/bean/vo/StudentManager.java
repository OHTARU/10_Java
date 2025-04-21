package com.mystudy.bean.vo;

public class StudentManager {

	public static void main(String[] args) {
		/*(실습) 3명의 성적처리 StudentVO 사용
		"김유신", 100, 90, 81
		"이순신", 95, 88, 92
		"홍길동", 90, 87, 77
		==============================
		김유신	100	90	81	271	90.33
		이순신	95	88	92	275	91.66
		홍길동	90	87	77	254	84.66
		******************************** */
		
		Object[][] data = {{"김유신", 100, 90, 81},{"이순신", 95, 88, 92},{"홍길동", 90, 87, 77}};
		
		StudentVO[] myObj = new StudentVO[3];
		
		for (int i = 0 ; i < data.length; i++) {
			String name = (String) data[i][0]; // Object 타입에서 String 형변환
            int kor = (int) data[i][1]; // Object 타입에서 int 형변환
            int eng = (int) data[i][2]; // Object 타입에서 int 형변환
            int math = (int) data[i][3]; // Object 타입에서 int 형변환
            myObj[i] = new StudentVO(name, kor, eng, math);
		}
		
		System.out.println("==============================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		
		
//		myObj[1].setKor(111);
		
		for (int i = 0; i < myObj.length; i++) {
			StudentVO student = myObj[i];
			System.out.print(student.getName() + "\t");
			System.out.print(student.getKor() + "\t");
			System.out.print(student.getEng() + "\t");
			System.out.print(student.getMath() + "\t");
			System.out.print(student.getTot() + "\t");
			System.out.print(student.getAvg());
			System.out.println();
		}
		System.out.println("==============================================");
	}

}
