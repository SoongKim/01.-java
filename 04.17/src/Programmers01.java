import java.util.ArrayList;
import java.util.Collections;

public class Programmers01 {
	public int[] solution(int n, int m) {
		int[] answer = {};
		answer = new int[2];
		ArrayList arr = new ArrayList();
		ArrayList arr2 = new ArrayList();
		int sol = n > m ? n : m;

		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (n * i == m * j) {
					arr.add(n * i);
				}
			}
		}
		Collections.sort(arr);
		answer[0] = (int) arr.get(0);

		for (int i = 1; i <= sol; i++) {
			if (n % i == 0 && m % i == 0) {
				arr2.add(i);
			}
		}
		Collections.sort(arr2, Collections.reverseOrder());
		answer[1] = (int) arr2.get(0);
		return answer;
	}
}
