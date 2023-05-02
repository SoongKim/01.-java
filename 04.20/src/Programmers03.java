import java.util.Arrays;

class Programmers03 {
	public int solution(int[] array) {
		int answer = 0;
		int sol = (int) (array.length / (double) 2);
		Arrays.sort(array);
		answer = array[sol];
		return answer;
	}
}