import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class K_BaekJoon_Stack_IGotIt {

	public static void main(String[] args) throws Exception {
		// 입력 예시 : 4 / 3 5 2 7

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Stack<Integer> myStack = new Stack<Integer>();
		for(int i = 0; i < N; i++) {
			if(!myStack.isEmpty() && arr[myStack.peek()] < arr[i]) {
				arr[myStack.pop()] = arr[i];
			}
			myStack.push(i);				
		}
		while(!myStack.isEmpty()) {
			myStack.push(-1);
		}
		System.out.println(myStack);
		System.out.println(Arrays.toString(arr));
	}

}
