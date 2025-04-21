package com.mystudy.bean;

public class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;

	
	//생성자
	public Student() {
		// super: 부모클래스
		super(); //부모클래스 객체(인스턴스)의 기본생성자 호출 생략시 컴파일러가 자동 추가
	}
	


	public Student(String name,int kor , int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	@Override
	public String toString() {
		//return super.toString(); // 부모타입 Object의 toString() 호출(사용)
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", tot=" + tot + ", avg="
				+ avg + "]";
	}
	
	
	// 기능(동작) 메소드 -----------
	// 외부에서 사용할 수 있도록 메소드 제공(public)

	// 외부에서 데이터를 전달받아 필드(멤버변수)에 데이터 저장
	// 명칭(호칭) : set메소드, setter , set property(속성값 설정,쓰기)

	public void setKor(int kor) {
		// 적절한 데이터여부를 확인할 수 있다.
		if (kor >= 0 && kor <= 100) {
			this.kor = kor;
			setTot(tot);
			setAvg(avg);
		} else {
			System.out.println("[예외 발생]");
		}
	}

	public void setEng(int eng) {
		if (eng >= 0 && eng <= 100) {
			this.eng = eng;
			setTot(tot);
			setAvg(avg);
		} else {
			System.out.println("[예외 발생]");
		}
	}

	public void setMath(int math) {
		if (math >= 0 && math <= 100) {
			this.math = math;
			setTot(tot);
			setAvg(avg);
		} else {
			System.out.println("[예외 발생]");
		}
	}

	public void setTot(int tot) {
		if (tot >= 0 && tot <= 300) {
			tot = math + eng + kor;
			this.tot = tot;
		} else {
			System.out.println("[예외 발생]");
		}
	}

	public void setAvg(double avg) {
		if (avg >= 0 && avg <= 100) {
			avg = (double) (math+eng+kor) / 3;
			this.avg = avg;
		} else {
			System.out.println("[예외 발생]");
		}
	}

	public void setName(String name) {
		this.name = name;
	}

	// 외부에서 데이터를 읽어가기 위한 get 메소드
	// 명칭(호칭) : get메소드 , getter , get property(속성값 읽기)
	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public int getTot() {
		return tot;
	}

	public double getAvg() {
		return avg;
	}

}
