import java.util.Arrays;

public class Programmers01 {

	public static void main(String[] args) {
		// 자연수 뒤집어 배열 만들기. ver 01
		int[] answer = {};

		long n = 12345;

		String sol = Integer.toString((int)n);
		
		answer = new int[sol.length()];
		
		for(int i = 0; i < answer.length; i++) {
			answer[(answer.length-1) - i] = Integer.parseInt(sol.split("")[i]);
		}
		
		System.out.println(Arrays.toString(answer));
	}

}
