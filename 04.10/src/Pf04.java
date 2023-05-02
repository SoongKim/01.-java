import java.util.Scanner;

public class Pf04 {

	public int solution(int[] array, int n) {
		int answer = 0;
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = scanner.nextInt();
		}
		int param = scanner.nextInt();
		for(int j = 0; j < arr.length; j++) {
			if(arr[j] == param) {
				answer = answer+1;
			}
		}
		return answer;
	}

}
