import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Practice {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int[] Arr = new int[N];
		for (int i = 0; i < N; i++) {
			Arr[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < N; i++) {
			Stack<Integer> sol = new Stack<Integer>();
			int index = i;
			while (index <= N - 1) {
				if (i == N - 1) {
					sol.push(-1);
					System.out.printf(sol.peek() + "");
					break;
				} else if (i == index) {
					sol.push(Arr[i]);
					index++;
					continue;
				}
				if (sol.peek() < Arr[index]) {
					sol.push(Arr[index]);
					System.out.printf(sol.peek() + " ");
					break;
				} else if (sol.peek() > Arr[index]) {
					index++;
				}
				if (index == N - 1 && sol.peek() > Arr[index]) {
					sol.push(-1);
					System.out.print(sol.peek() + " ");
					break;
				}

			}
		}
	}
}