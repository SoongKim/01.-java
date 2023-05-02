import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		int[] answer = {};
		long n = 12345;
		String s = String.valueOf(n);
		System.out.println(s);
		answer = new int[s.length()];
		for(int i = s.length()-1; i == 0; i--) {
			answer[i] = Integer.parseInt(s.substring(i));
		}
		System.out.println(Arrays.toString(answer));
	}
}
