import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_InsertSort {
	public static void main(String[] args) throws Exception {
		// 백준 11399번 문제
		// ATM은 1대. 사람은 n명. i번 사람이 인출하는데 걸리는 시간은 Pi분
		// N명이 모두 인출하는 데 필요한 최소값을 구해라.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		int[] arr2 = new int[N + 1];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);

		arr2[0] = 0;
		for (int i = 1; i < N + 1; i++) {
			arr2[i] = arr2[i - 1] + arr[i - 1];
		}

		int answer = 0;
		for (int i = 0; i < arr2.length; i++) {
			answer += arr2[i];
		}
		System.out.println(answer);
	}
}
