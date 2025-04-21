package Day250311_Abstract;

public class Second {

	public static void main(String[] args) {

		Student myObj = new Student();
		
		System.out.println("이름 : " + myObj.fname);
		System.out.println("나이 : " + myObj.age);
		System.out.println("졸업년도 : " + myObj.graduationYear);
		myObj.study();
	}

}
