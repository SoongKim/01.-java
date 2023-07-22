import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class L_BaekJoon {

	public static void main(String[] args) throws Exception {
		// 백준 2164
		// n장의 카드. 1번이 가장 위, N번이 가장 아래
		// 가장 위 카드를 버리고, 가장 위 카드를 가장 아래로
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> myQ = new LinkedList<Integer>();
		for (int i = 1; i <= N; i++) {
			myQ.add(i);
		}
		while (myQ.size() > 1) {
			myQ.poll();
			int tmp = myQ.poll();
			myQ.add(tmp);
		}
		System.out.println(myQ.poll());
	}
}