
public class Ex03_AND_OR_NOT {

	public static void main(String[] args) {

		// 논리연산자 : &&(AND) , ||(OR)
		// 논리연산자(&&,||)의 좌, 우에는 true, false 값이 있어야함

		System.out.println("======= && (AND) =======");
		System.out.println("true && true : " + (true && true));
		System.out.println("true && false : " + (true && false));
		System.out.println("false && true : " + (false && true));
		System.out.println("false && false : " + (false && false));

		System.out.println("=======================");
		int num1 = 1;
		int num2 = 2;
		boolean bool1 = true;
		boolean bool2 = false;

		boolean result = (num1 < num2) && bool1; // true && bool1(true) = true

		System.out.println(num1 + "<" + num2 + " && " + bool1 + " : " + result);

		System.out.println("======== || (OR) ========");

		System.out.println("true || true : " + (true || true));
		System.out.println("true || false : " + (true || false));
		System.out.println("false || true : " + (false || true));
		System.out.println("false || false : " + (false || false));
		System.out.println("=======================");

		boolean result2 = (num1 < num2) || bool2; // true || bool2(false) = true

		System.out.println(num1 + "<" + num2 + " || " + bool2 + " : " + result2);
		
		System.out.println("======== ! (NOT) ========");
		System.out.println("!true = " + !true); // false
		System.out.println("!false = " + !false); // true
		
		result = !(num1 < num2 || bool1);
		
		System.out.println("!num1 < num2 || bool1 : " + result);
	}

}
