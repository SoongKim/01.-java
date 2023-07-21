import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class I_Stack_Practice {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		Stack<Integer> myStack = new Stack<Integer>();

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int target = Integer.parseInt(st.nextToken());
			if (target == 0) {
				myStack.pop();
			}
			else {
				myStack.add(target);
			}
		}
		
		int answer = 0;
		for (int i = 0; i < myStack.size(); i++) {
			answer += myStack.get(i);
		}
		System.out.println(answer);
	}
}