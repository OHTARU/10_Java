package com.mystudy.net_multi2;

// 메시지를 보내고 싶을 때 보내고, 서버에서 보낸 메시지를 언제든지 받기
// 쓰기전용 쓰레드 : 메시지 작성 및 전송을 독립적으로 처리(언제든지 메시지 보내기)
// 읽기전용 쓰레드 : 서버쪽으로 부터 받은 메시지를 읽어서 화면 출력(언제든지 읽기)
public class TCPClientMultiChat {

	public void start() {
		System.out.println(">> client 시작!!");
		
	}

}
