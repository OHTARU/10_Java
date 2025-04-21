package Day250311;

public class Day250311_ClassMethod {

	static void myStaticMethod() {
		System.out.println("스태틱 메소드");
	}
	
	public void myPublicMethod() {
		System.out.println("퍼블릭 메소드");
	}
	
	public void fullThrottle() {
		System.out.println("자동차는 최대속도로 가는중입니다.");
	}
	
	public void speed(int maxSpeed) {
		System.out.println("최대속도 : " + maxSpeed);
	}
	
	public static void main(String[] args) {

		myStaticMethod();
		
		
		Day250311_ClassMethod myObj = new Day250311_ClassMethod();
		myObj.myPublicMethod();
		
		
		myObj.fullThrottle();
		myObj.speed(200);
		
	}

}
