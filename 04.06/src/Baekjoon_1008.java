import java.util.Scanner;

public class Baekjoon_1008 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = Integer.parseInt(scanner.next());
		int B = Integer.parseInt(scanner.next());
		double result;
		result = (double)A/B;
		System.out.printf("%.9f", result);
		// double로 캐스팅 해줘라.
		// 컴퓨터는 소수점 아래 나눗셈에 봉착하면 바보가 된다.
	}
}