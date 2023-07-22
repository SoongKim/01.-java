import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class M_BaekJoon {

	public static void main(String[] args) throws Exception {
		// 백준 11286
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Stack<Integer> myStack = new Stack<Integer>();
		for (int i = 0; i < N; i++) {
			int temp = Integer.parseInt(br.readLine());
			if (temp != 0) {
				if (!myStack.isEmpty() && Math.abs(myStack.peek()) >= Math.abs(temp)) {
					if (temp < myStack.peek()) {
						arr.add(temp);
						myStack.push(temp);
						continue;
					}
				} else if (!myStack.isEmpty()) {
					arr.add(temp);
					continue;
				} else {
					arr.add(temp);
					myStack.push(temp);
				}
			} else {
				if (myStack.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(M_BaekJoon.calAbs(arr, myStack));
					myStack.pop();
					continue;
				}
			}
		}
	}
	public static int calAbs(ArrayList<Integer> arr, Stack<Integer> stack) {
		int answer = 0;
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) == stack.peek()) {
				answer = arr.get(i);
				break;
			}
		}
		return answer;
	}
}
