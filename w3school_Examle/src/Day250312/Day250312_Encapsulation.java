package Day250312;

public class Day250312_Encapsulation {

	public String name;
	
	//Getter
	public String getName() {
		return name;
	}
	
	//Setter
	public void setName(String newName) {
		this.name = newName;
	}
	
	public static void main(String[] args) {

		
		Day250312_Encapsulation pname = new Day250312_Encapsulation();
		
		pname.setName("창현");
		
		System.out.println(pname.getName() + " 입니다.");
		
		
		
	}

}
