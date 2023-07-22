import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class C_BaekJoon {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		br.close();
		Arrays.sort(arr);
		Stack<Integer> myStack = new Stack<Integer>();
		for(int i = 0; i < N; i++) {
			myStack.add(arr[i]);
		}
		for(int i = 0; i < k-1; i++) {
			myStack.pop();
		}
		System.out.println(myStack.peek());
	}
}
