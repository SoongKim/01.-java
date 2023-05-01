import java.util.Scanner;

public class Pf05 {

	public String solution(int num) {
		Scanner scanner = new Scanner(System.in);
		String answer = "";

		num = scanner.nextInt();
		if (num % 2 == 0) {
			answer = "Even";
		} else if(num % 2 == 1) {
			answer = "Odd";
		}
		return answer;
	}

}
