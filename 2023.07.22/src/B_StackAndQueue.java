import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_StackAndQueue {
	public static void main(String[] args) throws Exception {
		// 백준 대표값2. 2587번 문제
		// 다섯 개 자연수 중 평균과 중앙값 구하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = 5;
		int[] arr = new int[N];
		int[] arr2 = new int[N + 1];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);

		arr2[0] = 0;
		for (int i = 1; i < N + 1; i++) {
			arr2[i] = arr2[i - 1] + arr[i - 1];
		}
		System.out.println(arr2[N] / N);
		System.out.println(arr[(int) (N / 2)]);
	}
}