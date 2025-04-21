
public class Ex02_char {

	public static void main(String[] args) {
		// 문자열(char) : 2 byte 사용, 문자 한글자 저장
		// 자바 문자처리 방식은 유니코드(Unicode) 형태 - 2 byte 사용 (UTF-16)

		// UTF-16 : 2byte(16bit) 사용 - 모든 문자를 2byte로 표현한다.
		// UTF-8 : 가장 많이 사용되는 가변 길이 유니코드 인코딩
		// 가변길이 : 1 , A - 1byte 사용, 한글 3byte 사용

		char char1 = 'A'; // char 은 '' , string 은 "";
		System.out.println(char1);
		System.out.println("char1 다음 문자 : " + (char1 + 1));
		System.out.println("char1 다음 문자 : " + (char) (char1 + 1)); // 65+1

		char char2 = '한';
		System.out.println("char : " + char2);

		char char3 = '\uAC00';
		System.out.println("char3 :" + char3);
		System.out.println("(int)char3 :" + (int) char3);

	} // main 끝
} // class의 끝
