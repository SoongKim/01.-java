
class Solution03 {

	public int solution(int[] array, int n) {
		int answer = 0;

		int solInt = n;
		int[] solArray = array;

		for (int i = 0; i < solArray.length; i++) {
			if (solArray[i] == n) {
				continue;
			} else if (solArray[i] != n) {
				for (int j = 0; j < solArray.length; j++) {
					if (i != j && solArray[i] != solArray[j]) {
						answer = answer + 1;
						break;
					} else {
						continue;
					}
				}
			}
		}
		return answer;
	}

}
