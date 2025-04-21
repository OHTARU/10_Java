public class Ex02 {
	public static void main(String[] args) {

		// 십진수 , 2진수 , 8진수 , 16진수
		
		int decimal2 = 123_456_789; // 10진수 값 저장
		int decimal = 10;
		int binary = 0B1010; //0b , 0B 접두어 사용 - 자바 2진수값 표현
		int oct = 012; // 0 접두어 숫자(0) 사용(8진수)
		int hexaDecimal = 0Xa; // 0x , 0X 접두어 사용(16진수)
		
		System.out.println("decimal2 : " + decimal2);
		System.out.println("binary(OB0101) : " + binary);
		System.out.println("oct(012) : " + oct);
		System.out.println("hexaDecimal(0Xa) : " + hexaDecimal);
		
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toOctalString(10));
		System.out.println(Integer.toHexString(10));
	}
}
