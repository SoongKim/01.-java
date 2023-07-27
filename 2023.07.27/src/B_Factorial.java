import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B_Factorial {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println(B_Factorial.factorial(N));
	
		int M = Integer.parseInt(br.readLine());
		System.out.println(B_Factorial.sumations(200));
	}

	public static int factorial(int number) {
		if (number == 1) {
			return 1;
		}
		int answer = number * factorial(number - 1);
		return answer;
	}

	public static int sumations(int number) {
		if (number == 100) {
			return 100;
		}
		int answer = sumations(number - 1) + number;
		return answer;
	}
}