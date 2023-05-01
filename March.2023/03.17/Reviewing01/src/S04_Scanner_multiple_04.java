import java.util.Scanner;

public class S04_Scanner_multiple_04 {

	public static void main(String[] args) {
		System.out.println("숫자입력:");
		Scanner user = new Scanner(System.in);

		int userData = user.nextInt();
		if (userData < 21) {
			for (int i = userData; i < 21; i++) {
				System.out.println("7 X " + i + " " + 7 * i);
			}
		} else {
			System.out.println("ERROR");
		}
		user.close();
	}
}