import java.util.Arrays;
import java.util.Stack;

public class G_Programmers {

	public static void main(String[] args) {
		// Programmers : '같은 숫자는 싫어'
		int[] arr = { 1, 1, 3, 3, 0, 1, 1 };
		int[]answer = {};
		Stack<Integer> myStack = new Stack<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (myStack.isEmpty()) {
				myStack.add(arr[i]);
			}
			if (myStack.peek() != arr[i]) {
				myStack.add(arr[i]);
			}
		}
		System.out.println(myStack);
		
		for(int i = 0; i < myStack.size(); i++) {
			answer[i] = (int)myStack.get(i);
		}
		
	}
}

class Solution2 {
	public int[] solution(int[] arr) {
		int[] answer = {};
		Stack<Integer> myStack = new Stack<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (myStack.isEmpty()) {
				myStack.add(arr[i]);
				continue;
			}
			if (myStack.peek() != arr[i]) {
				myStack.add(arr[i]);
			}
		}
		answer = new int[myStack.size()];
		for(int i = 0; i < myStack.size(); i++) {
			answer[i] = myStack.get(i);
		}
		return answer;
	}
}