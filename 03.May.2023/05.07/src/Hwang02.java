import java.util.Arrays;

public class Hwang02 {

	public static void main(String[] args) {
		// 프로그래머스 이상한 문자 만들기.
		// 짝수 번째는 대문자, 홀수 번째는 소문자로 return.
		String answer = "";

		String s = "HELLO WORLD";

		String sol = s;
		String[] sols = new String[sol.length()];
		for (int i = 0; i < sols.length; i++) {
			sols[i] = sol.split("")[i];
		}
		System.out.println(Arrays.toString(sols));
		
		int index = 0;
		for(int i = 0; i < sols.length; i++) {
			if(sols[i].equals(" ")) {
				index = 0;
			}
			else if(index % 2 == 0) {
				sols[i] = sols[i].toUpperCase();
				index++;
			}
			else if(index % 2 == 1) {
				sols[i] = sols[i].toLowerCase();
				index++;
			}
		}
		System.out.println(Arrays.toString(sols));
	}

}
