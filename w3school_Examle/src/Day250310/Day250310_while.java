package Day250310;

public class Day250310_while {

	public static void main(String[] args) {
		
//		int i = 0;
//		while (i < 5) {
//			System.out.println(i);
//			i++;
//		}
		
		
		
//		int countdown = 3;
//		while (countdown > 0) {
//			System.out.println(countdown);
//			countdown--;
//		}
//		System.out.println("finish");
		
		int dice = 1;
		
		while (dice <= 6) {
			if (dice < 6) {
				System.out.println("No yatzy" + dice);
			} else {
				System.out.println("Yatzy" + dice);
			}
			dice += 1;
		}
		
	}

}
