import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class E_Examples {

	public static void main(String[] args) throws Exception {
		// 백준 1940번 문제.
		// 투 포인터. A + B == M일 때 count++;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);

		int start_index = 0;
		int end_index = N - 1;
		int answer = 0;
		while (start_index < end_index) {
			if (arr[start_index] + arr[end_index] > M) {
				end_index--;
			} else if (arr[start_index] + arr[end_index] < M) {
				start_index++;
			} else {
				start_index++;
				end_index--;
				answer++;
			}
		}
		System.out.println(answer);
	}
}