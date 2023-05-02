import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Programmers01_ProtoType {
	public int[] solution(int n, int m) {
		int[] answer = {};
		answer = new int[2];
		ArrayList arr01 = new ArrayList();
		ArrayList arr02 = new ArrayList();
		ArrayList arr03 = new ArrayList();
		ArrayList arr04 = new ArrayList();
		ArrayList arr05 = new ArrayList();
		ArrayList arr06 = new ArrayList();
		// 공약수
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				arr01.add(i);
			}
		}
		Collections.sort(arr01, Collections.reverseOrder());

		for (int i = 1; i <= m; i++) {
			if (m % i == 0) {
				arr02.add(i);
			}
		}
		Collections.sort(arr02, Collections.reverseOrder());
		// 현재 개별 약수까지 구해낸 상황.

		for (int i = 0; i < arr01.size(); i++) {
			for (int j = 0; j < arr02.size(); j++) {
				if (arr01.get(i) == arr02.get(j)) {
					arr03.add(arr01.get(i));
				}
			}
		}
		Collections.sort(arr03, Collections.reverseOrder());
		answer[0] = (int) arr03.get(0);
		// 공약수 구분 완료.

		for (int i = 1; i <= m; i++) {
			arr04.add(n * i);
		}
		Collections.sort(arr04);

		for (int i = 1; i <= n; i++) {
			arr05.add(m * i);
		}
		Collections.sort(arr05);

		for (int i = 0; i < arr04.size(); i++) {
			for (int j = 0; j < arr05.size(); j++) {
				if (arr04.get(i) == arr05.get(j)) {
					arr06.add(arr04.get(i));
				}
			}
		}
		Collections.sort(arr06);
		answer[1] = (int) arr06.get(0);
		return answer;
	}
}
