import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class M_Last {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int[][] Arr = new int[N][2];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			Arr[i][0] = Integer.parseInt(st.nextToken());
			Arr[i][1] = Integer.parseInt(st.nextToken());
		}
		// Comparator를 사용한 이중 배열의 정렬 방법.
		// compare를 Override해와 비교한다.
		Arrays.sort(Arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[0] == o2[0]) {
					return o1[1] - o2[1];
				} else {
					return o1[0] - o2[0];
				}
			}
		});
		for (int i = 0; i < N; i++) {
			System.out.println(Arr[i][0] + " " + Arr[i][1]);
		}
	}
}