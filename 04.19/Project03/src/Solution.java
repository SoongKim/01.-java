import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		String answer = "";
		String my_string = "hello";
		int n = 5;
		String[] sol = new String[my_string.length()];
		
		for(int i = 0; i < my_string.length(); i++) {
			sol[i] = my_string.substring(i, i+1);
		}
		for(int i = 0; i < sol.length; i++) {
			for(int j = 0; j < n; j++) {
				answer += sol[i];
			}
		}
		
		System.out.println(answer);
		
	}
}
