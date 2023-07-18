
public class Solution {

	public int solution(int a, int b) {
		int answer = 0;

		int sol01 = a;
		int sol02 = b;

		int[] arr = new int[b];

		for (int i = 0; i < b; i++) {
			arr[i] = a + i;
		}

		for (int j = 0; j < b; j++) {
			answer = answer + arr[j];
		}

		return answer;
	}

}
