import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class A_BaekJoon {
	static Stack<Integer> myStack;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String std = " ";
		myStack = new Stack<Integer>();
		for (int i = 0; i < N; i++) {
			String target = br.readLine();
			String targetString = target.split(std)[0];
			if (targetString.equals("push")) {
				myStack.add(Integer.parseInt(target.split(std)[1]));
			} else if (targetString.equals("pop")) {
				if (myStack.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(myStack.pop());
				}
			} else if (targetString.equals("size")) {
				System.out.println(myStack.size());
			} else if (targetString.equals("empty")) {
				if (myStack.isEmpty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
			} else if (targetString.equals("top")) {
				if (myStack.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(myStack.peek());
				}
			}
		}
	}
}