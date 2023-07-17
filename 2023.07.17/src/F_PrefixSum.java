import java.util.Arrays;
import java.util.Scanner;

public class F_PrefixSum {

	public static void main(String[] args) {
		// S[i] = A[0] + A[1] + ... A[i-1] + A[i]
		// S[i] = S[i-1] + A[i] 로 공식화할 수 있다.
		// 이러면 시간 복잡도가 N에서 1로 감소한다.
		// i 에서 j 사이의 값들의 합집합: S[j] - S[i-1]
		// i번째부터 j-1까지의 합을 확보할 수 있다. i to j ==> i ~ j-1
		// ex. S[5] = A[0] + A[1] + A[2] + A[3] + A[4] + A[5]
		// ex. S[1] = A[0] + A[1]
		// ex. S[5] - S[1] = [ A[2] + A[3] + A[4] + A[5] ]
		
		// 백준 11659. 구간 합 구하기.
		// 1번째 줄에 수의 개수 N(1 <= N <= 100000) & \
		// 합을 구해야 하는 횟수( 1 <= M <= 100000)
		// 2번째 줄에 N 개의 수가 주어진다. 각 수는 1000 이하의 자연수.
		// 3번째 줄에 M개의 줄에 합을 구해야 하는 i와 j가 주어진다.
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int[]Arrs = new int[N+1];
		for(int i = 1; i < Arrs.length; i++) {
			Arrs[i] = Arrs[i-1] + scanner.nextInt();
		}
		for(int i = 0; i < M; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			System.out.println(Arrs[y]-Arrs[x-1]);
		}
		// Point 01 : 배열 선언 간 빈 칸에는 0값이 자동으로 자리매김한다.
		// Point 02 : 구간 합 공식. S[i] = S[i-1] + A[i].
		// Point 03 : 구간 합 공식 2. i~j구간의 합 공식 : S[j] - S[i-1]
		
		// BufferedReader 사용 방법 슬슬 배워두자.
	}
}