import java.util.Scanner;

public class ElegantCode {

	public static void main(String[] args) {
		int money = 1000;
		Scanner scanner = new Scanner(System.in);
		int price = Integer.parseInt(scanner.next());
		int reMon = money - price;
		int[] arr = { 500, 100, 50, 10, 5, 1 };
		int[] arr2 = new int[arr.length];
		int answer = 0;

		for (int i = 0; i < arr.length; i++) {
			arr2[i] = (int) (reMon / (double) arr[i]);
			reMon = reMon - arr[i] * arr2[i];
			answer += arr2[i];
			if (reMon <= 0) {
				break;
			}
		}

		System.out.println(answer);
	}
}