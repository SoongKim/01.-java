public class F_StackAndQueue {

	public static void main(String[] args) throws Exception {
		int[] absolute = {1, 2, 3};
		boolean[] signs = {false, false, true};
		int result = 0;
		
		for(int i = 0; i < absolute.length; i++) {
			if(signs[i]) {
				result += absolute[i];
			}
			else {
				result-=absolute[i];
			}
		}
		System.out.println(result);
	}

}

// Programmers : '음양 더하기'
class Solution{
	public int solution(int[] absolutes, boolean[] signs) {
		int answer = 123456789;
		int result = 0;
		for(int i = 0; i < absolutes.length; i++) {
			if(signs[i]) {
				result+=absolutes[i];
			}
			else {
				result-=absolutes[i];
			}
		}
		answer = result;
		return answer;
	}
}