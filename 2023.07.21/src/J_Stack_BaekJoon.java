import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class J_Stack_BaekJoon {

	public static void main(String[] args) throws Exception {
		// 백준 10828. '스택' 문제
		// 스택의 기초 개념을 다지는 문제. 개념 학습 후 처음 풀면 도움이 많이 될 듯.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> myStack = new Stack<Integer>();

		for (int i = 0; i < N; i++) {
			String target = br.readLine();
			if (target.split(" ")[0].equals("push")) {
				myStack.push(Integer.parseInt(target.split(" ")[1]));
			} else if (target.equals("pop")) {
				if (myStack.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(myStack.pop());
				}
			} else if (target.equals("size")) {
				System.out.println(myStack.size());
			} else if (target.equals("empty")) {
				if (myStack.isEmpty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
			} else {
				if (myStack.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(myStack.peek());
				}
			}
		}
	}

}
