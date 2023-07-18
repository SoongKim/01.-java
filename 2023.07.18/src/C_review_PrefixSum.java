import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class C_review_PrefixSum {

	public static void main(String[] args) throws Exception {
		// 백준 11659번
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] arr = new int[N];
		int[] arrs = new int[N + 1];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		arrs[0] = 0;
		for (int i = 1; i < N+1; i++) {
			arrs[i] = arrs[i - 1] + arr[i-1];
		}
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int newa = Integer.parseInt(st.nextToken());
			int newb = Integer.parseInt(st.nextToken());
			int answer = arrs[newb] - arrs[newa-1];
			System.out.println(answer);
		}
		// 포인트 :
		// 1. 누계 부분합을 구하는 N+1길이의 배열을 신설하자.(신배열[0]은 0)
		// 2. BufferedReader와 InputStreamReader, StringTokenizer 사용법
		// 3. m ~ n까지의 누계합 = 신배열[m] - 신배열[n-1];
	}
}