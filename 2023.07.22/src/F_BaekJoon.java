import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class F_BaekJoon {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < N; i++) {
			int target = arr[i];
			int k = i + 1;
			while (k <= N - 1) {
				if (arr[k] > target) {
					System.out.printf(arr[k]+" ");
					break;
				} else {
					k++;
				}
				if (k == N && target > arr[k - 1]) {
					System.out.printf(-1 + " ");
				}
			}
		}
		System.out.println(-1);;
	}
}