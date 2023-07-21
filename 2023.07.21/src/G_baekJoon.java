import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class G_baekJoon {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 2 <= N <= 25이므로 N**2 시간 복잡도 알고리즘 사용 가능.
		// 2중 for 문을 사용하였다.
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			Stack<String> myStack = new Stack<String>();
			String target = br.readLine();
			for (int j = 0; j < target.length(); j++) {
				// 비어있다면 j번째 문자열을 추가
				if (myStack.isEmpty()) {
					myStack.add(target.split("")[j]);
					continue;
				}
				// VPS에 해당한다면 myStack에 추가하지 않고 pop()
				if (!target.split("")[j].equals(myStack.peek()) && myStack.peek().equals("(")) {
					myStack.pop();
				} 
				// VPS에 해당하지 않는다면 j번째 문자열 추가
				else {
					myStack.add(target.split("")[j]);
				}
			}
			// Stack이 비어있다면 YES를, 아니라면 NO를 출력
			// -- 1 for문 회전 간
			if (!myStack.isEmpty()) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		}
	}
}