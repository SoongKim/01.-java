import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class K_Practicing {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		long[] arr = new long[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Long.parseLong(st.nextToken());
		}

		Arrays.sort(arr);
		int answer = 0;
		for (int i = 0; i < N; i++) {
			int start_index = 0;
			int end_index = N - 1;
			long K = arr[i];
			while (start_index < end_index) {
				long sum = arr[start_index] + arr[end_index];
				if (sum == K) {
					if (start_index != i && end_index != i) {
						answer++;
						break;
					} else if (start_index == i) {
						start_index++;
					} else {
						end_index--;
					}
				} else if (sum < K) {
					start_index++;
				} else {
					end_index--;
				}
			}
		}
		System.out.println(answer);
	}
}