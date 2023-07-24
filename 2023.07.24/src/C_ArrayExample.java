import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C_ArrayExample {
	public static void main(String[] args) throws Exception {
		// 백준 11659. 구간 합 구하기
		// 구간합 값을 지니는 배열을 신설할 것.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] sol = new int[N + 1];
		sol[0] = 0;
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i < N + 1; i++) {
			sol[i] = sol[i - 1] + Integer.parseInt(st.nextToken());
		}
		// 입력받는 대로 바로 바로 합해서 배열에 넣어버릴 것.
		// 본연의 값을 지니는 배열이 필요한가? 라는 의문에서 출발할 것.
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int firNum = Integer.parseInt(st.nextToken());
			int lasNum = Integer.parseInt(st.nextToken());
			System.out.println(sol[lasNum] - sol[firNum - 1]);
		}
	}
}
