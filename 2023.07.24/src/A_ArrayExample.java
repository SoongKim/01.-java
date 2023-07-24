import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A_ArrayExample {
	public static void main(String[] args) throws Exception {
		// 백준 11720. 숫자의 합 구하기
		// 시간 제한 1초. Max(N) = 100. N^2도 가능하다.
		// 5
		// 54321
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		String target = st.nextToken();
		int answer = 0;
		for (int i = 0; i < N; i++) {
			answer += Integer.parseInt(target.split("")[i]);
		}
		// 시간 복잡도 N 방식. 최대 100까지.
		System.out.println(answer);
	}
}