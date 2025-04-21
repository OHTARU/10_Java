package com.mystudy.bean.vo;

/* 자바빈(Java Bean) 형태의 클래스 작성
VO(Value Object) : 값(데이터)을 저장하기 위한 클래스(객체) - Oxxx, OxxxVO, OxxxVo
  사용예) Student, StudentVO, StudentVo
DTO(Data Transfer Object) : 값(데이터)을 저장해서 전달하기 위한 클래스(객체) 
  Oxxx, OxxxDTO, OxxxDto
  사용예) Student, StudentDTO, StudentDto
------------ */
public class StudentVO {
	// (실습)필드(변수)선언 ------------------
	// 성명 - name : String
	// 국어 - kor : int
	// 영어 - eng : int
	// 수학 - math : int
	// 총점 - tot : int
	// 평균 - avg : double

	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;

	private boolean korValid;
	private boolean engValid;
	private boolean mathValid;
	private boolean totValid;
	
	// 생성자 작성(기본생성자 없음) ----------------------
	// 생성자 - 성명, 국어, 영어, 수학 입력받는 생성자
	// 생성자 - 성명, 국어, 영어, 수학, 총점, 평균 입력받는 생성자

	// name,kor,eng,math 만 입력하면 tot , avg 는 자동계산
	public StudentVO(String name, int kor, int eng, int math) {
		this.name = name;
//		this.kor = kor;
//		this.eng = eng;
//		this.math = math;
//		this.tot = kor + eng + math;
//		this.avg = tot / 3.0;
		setKor(kor);
		setEng(eng);
		setMath(math);
		isValidtot();
	}

	// name,kor,eng,math,tot,avg 값을 전체 넣어줘야함
	public StudentVO(String name, int kor, int eng, int math, int tot, double avg) {
		this.name = name;
//		this.kor = kor;
//		this.eng = eng;
//		this.math = math;
		setKor(kor);
		setEng(eng);
		setMath(math);
		this.tot = tot;
		this.avg = avg;
		isValidtot();
	}

	
	
	private void recalculate() {
		this.tot = (korValid ? this.kor : 0) + (engValid ? this.eng : 0) + (mathValid ? this.math : 0);
		this.avg = this.tot/3.0;
	}
	
	private boolean isValidScore(int score) {
		return score >= 0 && score <= 100;
		
	}
	
	private void isValidtot() {
		this.totValid = korValid && engValid && mathValid;
	}
	
	
	// setter, getter 메소드 작성 ----------------------
	// (나중에) 국어, 영어, 수학 점수는 0~100 까지 값만 입력되도록 처리
	// (나중에) 국어, 영어, 수학 점수 변경되면 총점, 평균 재계산 처리
	public String getName() {
		return name;
	}

//	public int getKor() {
//		return kor;
//	}
//
//	public int getEng() {
//		return eng;
//	}
//
//	public int getMath() {
//		return math;
//	}

	public String getKor() {
		return korValid ? String.valueOf(kor) : "/";
	}
	
	public String getEng() {
		return engValid ? String.valueOf(eng) : "/";
	}
	
	public String getMath() {
		return mathValid ? String.valueOf(math) : "/";
	}
	
	
	public String getTot() {
		return totValid ? String.valueOf(tot) : "/";
	}

	public String getAvg() {
		return totValid ? String.format("%.2f",avg) : "/";
	}

	// Setter

	public void setName(String name) {
		this.name = name;
	}

	public void setKor(int kor) {
		if (isValidScore(kor)) {
			this.kor = kor;
			korValid = true;
			recalculate();
		} else {
			this.kor = 0;
			korValid = false;
//			System.out.println("[예외 발생]");
			recalculate();
		}
		isValidtot();
	}

	public void setEng(int eng) {
		if (isValidScore(eng)) {
			this.eng = eng;
			engValid = true;
			recalculate();
		} else {
			this.eng = 0;
			engValid = false;
//			System.out.println("[예외 발생]");
			recalculate();
		}
		isValidtot();
	}

	public void setMath(int math) {
		if (isValidScore(math)) {
			this.math = math;
			mathValid = true;
			recalculate();
		} else {
			this.math = 0;
			mathValid = false;
//			System.out.println("[예외 발생]");
			recalculate();
		}
		isValidtot();
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	

}
