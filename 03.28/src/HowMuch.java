import java.util.Scanner;

public class HowMuch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int T = Integer.parseInt(scanner.next());
		int S = Integer.parseInt(scanner.next());
		if (S == 0) {
			if (12 <= T && T <= 16) {
				System.out.println(320);

			} else {
				System.out.println(280);
			}
		} else if (S == 1) {
			System.out.println(280);
		}
		scanner.close();
	}
}