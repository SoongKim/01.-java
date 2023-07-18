import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class H_stackExample {

	public static void main(String[] args) throws Exception {
		// 백준 17298번
		// 크기가 N인 수열이 있다. 수열의 Ai에 관한 NGE(i)를 구하자.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < N; i++) {
			Stack<Integer> sol = new Stack<Integer>();
			int index = i;
			while (index < N) {
				if (i == index) {
					sol.push(arr[i]);
					index++;
					continue;
				}
				if (arr[index] > sol.peek()) {
					sol.push(arr[index]);
					break;
				}
				else {
					index++;
				}
			}
			System.out.println(sol.pop());
		}
	}
}
