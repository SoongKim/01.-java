
public class Main {

	int solution(int input) {
		int answer = 0;
		int money = 1000;
		int reMon = money - input;
		int[] arr = { 500, 100, 50, 10, 5, 1 };
		int[] arr2 = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			arr2[i] = (int) (reMon / (double) arr[i]);
			reMon = reMon - arr[i] * arr2[i];
			answer += arr2[i];
			if (reMon <= 0) {
				break;
			}
		}
		return answer;
	}
}
