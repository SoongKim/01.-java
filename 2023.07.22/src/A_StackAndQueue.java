import java.util.Stack;

public class A_StackAndQueue {
	static Stack<Integer> myStack;

	public static void main(String[] args) {
		int[] arr = { 4, 4, 4, 3, 3 };
		myStack = new Stack<Integer>();
		int lenArr = arr.length;
		myStack.add(arr[0]);
		for (int i = 1; i < lenArr; i++) {
			if (arr[i] != myStack.peek()) {
				myStack.add(arr[i]);
			}
		}
		System.out.println(myStack);

	}
}

class Solution {
	static Stack<Integer> myStack;

	public int[] solution(int[] arr) {
		int[] answer = {};
		myStack = new Stack<Integer>();
		int lenArr = arr.length;
		myStack.add(arr[0]);
		for (int i = 0; i < lenArr; i++) {
			if (arr[i] != myStack.peek()) {
				myStack.add(arr[i]);
			}
		}
		answer = new int[myStack.size()];
		for (int i = 0; i < myStack.size(); i++) {
			answer[i] = myStack.get(i);
		}
		return answer;
	}
}