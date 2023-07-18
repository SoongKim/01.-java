import java.util.Arrays;

class Programmers04 {
	public static void main(String[] args) {
		
		long[] answer = {};
		
		int n =1000;
		int x = -10000000;
		
		answer = new long[n];
		for (int i = 0; i < n; i++) {
			answer[i] = (long)x*(i+1);
		}
		
		System.out.println(Arrays.toString(answer));
		
	}
}