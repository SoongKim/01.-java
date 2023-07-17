import java.util.Arrays;
import java.util.Scanner;

public class G_PrefixSum_2 {

	public static void main(String[] args) {
		// 백준 11660번 문제.
		// NxN 수가 NxN 표에 채워져 있다. 이중 (X1, Y1) ~ (X2, Y2) 합을 구하자.
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int[][] arr = new int[N + 1][N + 1];
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		int[][] arr2 = new int[N + 1][N + 1];
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				arr2[i][j] = arr2[i][j - 1] + arr2[i - 1][j] - arr2[i - 1][j - 1] + arr[i][j];
			}
		}
		for (int i = 0; i < M; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			int d = scanner.nextInt();
			int result = arr2[c][d] - arr2[a - 1][d] - arr2[c][b - 1] + arr2[a - 1][b - 1];
			System.out.println(result);
		}
	}
}