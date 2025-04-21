
public class Ex04_break_contiune {

	public static void main(String[] args) {
		// 반복제어문 : break; continue
		// break; : 중단(반복을 중단하고 현재 실행중인 반복문 종료)
		// continue; :

		// 1 ~ 10까지 출력하되 8은 출력하지 않는다

		for (int i = 1; i <= 10; i++) {
			if (i != 8) {
				System.out.print(i + " ");
			}
		}
		
		
		System.out.println("\n====='continue문 사용'========");
		
		
		for (int i = 1; i <= 10; i++) {
			if (i == 8) {
				continue;
			}
			System.out.print(i + " ");
		}
		
		System.out.println("\n====='break문 사용'========");
		
		for (int i = 1; i <= 10; i++) {
			if (i == 8) {
				break;  // 현재 반복을 중단하고 빠져나감
			}
			System.out.print(i + " ");
		}
	}

}
