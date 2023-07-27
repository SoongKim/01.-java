import java.util.Stack;

class Sol {
	public static int[] Debug(int n, int m) {
		int[] answer = {};
		answer = new int[2];
		Stack<Integer> myStack = new Stack<Integer>();
		int sol = n > m ? n : m;
		for (int i = 0; i <= sol; i++) {
			if (n % i == 0 && m % i == 0) {
				myStack.add(i);
			}
		}
		answer[0] = myStack.pop();

		int a = 1;
		int b = 1;
		while (a * n != b * m) {
			if (a * n < b * m) {
				a++;
			} else if (a * n > b * m) {
				b++;
			}
		}
		answer[1] = a * n;
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(Sol.Debug(3, 12));
	}
}