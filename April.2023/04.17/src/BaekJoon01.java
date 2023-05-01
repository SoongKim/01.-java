import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BaekJoon01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nums = Integer.parseInt(scanner.next());
		ArrayList sol = new ArrayList();

		ArrayList zero = new ArrayList();
		zero.add(0);

		int index = 0;
		for (int i = 0; i < nums; i++) {
			sol.add((int) scanner.nextInt());
		}

		System.out.println(sol);
		for (int i = 0; i < nums; i++) {
			if (sol.get(i).equals(0)) {
				System.out.println(sol.get(i));
			}
		}
	}
}