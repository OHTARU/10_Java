
public class Ex11_while_exam {

	public static void main(String[] args) {

		int i = 1;
		int sum = 0;

		while (i <= 10) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		System.out.println("===========");

		i = 0;

		while (i <= 4) {
			i++;
			System.out.println("****");
		}

		System.out.println("===========");

		i = 0;

		do {
			++i;
			System.out.println("****");
		} while (i <= 4);

		System.out.println("===========");

		i = 0;


		while (i <= 4) {
			int j = 0;
			while (j <= 3) {
				System.out.print("*");
				++j;
			}
			System.out.println();
			i++;
		}

	}
}
