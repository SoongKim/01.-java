import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BaekJoon_11047 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Integer N = Integer.parseInt(scanner.next());
		Integer K = Integer.parseInt(scanner.next());

		Integer[] arr = new Integer[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(scanner.next());
		}
		
		Arrays.sort(arr, Collections.reverseOrder());

		Integer count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (K < arr[i]) {
				continue;
			} else if (K >= arr[i]) {
				for (int e = 0; e < 999; e++) {
					if (K < arr[i]) {
						break;
					} else {
						K = K - arr[i];
						count++;
					}
				}
			}
			if (K == 0) {
				break;
			}
		}
		System.out.println(count);
	}

}