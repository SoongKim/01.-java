
class Solution05 {

	public String solution(int n) {
		String answer = "";

		int sol = n;

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				answer = answer + "코";
			} else {
				answer = answer + "포";
			}
		}
		return answer;
	}
}