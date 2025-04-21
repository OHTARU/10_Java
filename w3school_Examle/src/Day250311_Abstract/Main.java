package Day250311_Abstract;

abstract class Main {

	public String fname = "John";
	public int age = 24;
	public abstract void study();
	
}
	class Student extends Main{
		public int graduationYear = 2018;
		public void study() {
			System.out.println("공부를 하루종일 함");
		}

	}

