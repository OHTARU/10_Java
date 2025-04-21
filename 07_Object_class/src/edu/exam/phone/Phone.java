package edu.exam.phone;

public class Phone {

	String model;
	String type;
	int hsize;
	int vsize;
	boolean hasLCD;

//	Phone(String m, String t, boolean LCD) {
//		model = m;
//		type = t;
//		hasLCD = LCD;
//	}
	
	Phone(){
		model = "갤럭시20";
		type = "갤럭시";
	}
	
	void call() {
		System.out.println("전화 걸기");
	}

	void receiveCall() {
		System.out.println("전화 받기");
	}

	String sendMsg(String Msg) {
		System.out.println("[메시지 전송] : " + Msg);
		return receiveMsg(Msg);
	}

	String receiveMsg(String Msg) {
		System.out.println("[메시지 수신] : " + Msg);
		return "메시지가 정상적으로 보내졌습니다";
	}

	void view() {
		System.out.println("모델 명 :" + model);
		System.out.println("타입 : " + type);
		System.out.println("가로 크기 : " + hsize + "mm");
		System.out.println("세로 크기 : " + vsize + "mm");
		System.out.println("LCD 유무 : " + hasLCD);
	}

}
