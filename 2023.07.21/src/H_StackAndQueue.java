import java.util.Stack;

public class H_StackAndQueue {

	public static void main(String[] args) {
		boolean answer = true;

		String s = "()()";
		Stack<Character> myStack = new Stack<Character>();
		int lenS = s.length();

		int i = 0;
		while (i < lenS) {
			if (myStack.isEmpty()) {
				myStack.add(s.charAt(i));
				i++;
				continue;
			}
			if (s.charAt(i) != myStack.peek() && myStack.peek().equals('(')) {
				myStack.pop();
				i++;
			} else {
				myStack.add(s.charAt(i));
				i++;
			}
		}
		if (!myStack.isEmpty()) {
			answer = false;
		}
		System.out.println(answer);
	}

}

class solution3 {
	boolean solution(String s) {
		boolean answer = true;
		Stack<Character> myStack = new Stack<Character>();
		int lenS = s.length();

		int i = 0;
		while (i < lenS) {
			if (s.charAt(i) != myStack.peek() && s.charAt(i) != ')') {
				myStack.add(s.charAt(i));
				i++;
			}
			else {
				myStack.pop();
				i++;
			}
		}
		if (!myStack.isEmpty())
			answer = false;
		return answer;
	}
}