import java.util.Scanner;

public class Baekjoon_1008 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = Integer.parseInt(scanner.next());
		int B = Integer.parseInt(scanner.next());
		double result;
		result = (double)A/B;
		System.out.printf("%.9f", result);
		// double�� ĳ���� �����.
		// ��ǻ�ʹ� �Ҽ��� �Ʒ� �������� �����ϸ� �ٺ��� �ȴ�.
	}
}