package Day250319;

enum Level {
	LOW, MEDIUM, HIGH
}

public class Ex03_Switch_Enum {

	public static void main(String[] args) {
		Level myVar = Level.LOW;

		switch (myVar) {
		case LOW:
			System.out.println("Low level");
			break;
		case MEDIUM:
			System.out.println("Medium level");
			break;
		case HIGH:
			System.out.println("High level");
			break;
		}
	}

}
