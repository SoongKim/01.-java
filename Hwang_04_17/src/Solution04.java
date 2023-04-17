
class Solution04 {
	public int[] solution(int[] array, int n) {
		int[] answer;

//		int sol01 = n;
		
		answer = new int[array.length];
		
		int[] sol02 = array;

		for (int i = 0; i < sol02.length; i++) {
			answer[i] = n * sol02[i];
		}

		return answer;
	}
}