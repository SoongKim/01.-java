import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int openNum = scanner.nextInt();
		Integer[] arr = new Integer[openNum];
		for (int i = 0; i < openNum; i++) {
			arr[i] = scanner.nextInt();
		}
		Arrays.sort(arr, (e1, e2) -> {
			return e1 - e2;
		});
		for(int j = 0; j < openNum; j++) {
			System.out.println(arr[j]);
		}
	}
}