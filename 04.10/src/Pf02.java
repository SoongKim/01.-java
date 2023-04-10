import java.util.Scanner;

public class Pf02 {

	public int solution(int n) {
		int answer = 0;
		Scanner scanner = new Scanner(System.in);
		int userNum = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < (userNum+1); i++) {
				answer = answer+ i;
			}
		return answer;
	}
}