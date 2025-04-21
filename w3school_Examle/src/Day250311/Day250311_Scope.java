package Day250311;

public class Day250311_Scope {

	int a , b ;
	static int c; 
	
	void add(int x , int y) {
		int sum = x + y; 
		System.out.println("Sumit : " + sum);
	}
	
	
	public static void main(String[] args) {

		Sample ob = new Sample();
		ob.add(10,20);
		
	}

}

class Sample{
	int num1;
	int num2;
	int add(int a, int b) {
		int c= a + b;
		return c;
	}
}
