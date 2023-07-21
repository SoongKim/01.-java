import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class K_Stack_Last {

	public static void main(String[] args) throws Exception {
		// 백준 1874 '스택 수열'
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> myStack = new Stack<Integer>();

		for (int i = 0; i < N; i++) {
			int target = Integer.parseInt(br.readLine());
			if (myStack.isEmpty()) {
				for(int j = 1; j <= target; j++) {
					myStack.add(j);
					System.out.println("+");
				}
				continue;
			}
			if(myStack.peek() < target){
				i = target-myStack.peek();
				while(myStack.peek() > i) {
					myStack.add(i);
					System.out.println("+");
				}
			} else {
				while(myStack.peek() >= target) {
					myStack.pop();
					System.out.println("-");
				}
			}
		}
	}
}