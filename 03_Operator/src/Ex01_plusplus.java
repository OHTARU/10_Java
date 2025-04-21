
public class Ex01_plusplus {

	public static void main(String[] args) {
		// 증감연산자 : ++ , --
		// 사용형태 : ++변수명, 변수명++ , --변수명, 변수명--
		// ++ : 값을 1증감 시킴
		// -- : 값을 1감소 시킴
		// ++num; > num = num + 1;
		
		int a = 1;
		int b = 1;
		
		System.out.println("전위 연산을 이용한 a 출력 : " + (++a));

		System.out.println("후위 연산을 이용한 b 출력 : " + (b++)); // b에 아직 +1 이 안됨
		// b = b + 1;
		
		System.out.println("후위 연산이 적용된 b 출력 : " + (b++)); // b 에 1 추가 후 출력
	}

}
