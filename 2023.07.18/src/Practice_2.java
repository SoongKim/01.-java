import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Practice_2 {

	public static void main(String[] args) throws Exception{
		// 백준 2164
		// 시간 제한 2초, N = 500000
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		// 스택 문제가 아니다. 앞뒤로 뱉어내는 걸 보니 큐 문제다.
		Queue<Integer>myQ = new LinkedList<>();
		for(int i = 1; i <= N; i++) {
			myQ.add(i); // Queue에 값을 넣을 때는 add로
		}
		for(int i = 0; i < N; i++) {
			if(myQ.size() == 1) {
				System.out.println(myQ.peek());
				break;
			}
			myQ.remove();
			int answer = myQ.poll();
			myQ.add(answer);
		}
	}
}