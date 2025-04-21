package Day250311;


public class Day250311_Constructors {

	int modelYear;
	String modelName;
	
//	final int x = 10;
	
	
	public Day250311_Constructors(int year, String name) {
		modelYear = year;
		modelName = name;
	}
	
	public static void main(String[] args) {
		
		Day250311_Constructors myObj = new Day250311_Constructors(1969,"머스탱");
		System.out.println(myObj.modelYear + " " + myObj.modelName);

//		myObj.x = 20; >> final 로 선언된 변수는 변경 불가능
		
	}
}
