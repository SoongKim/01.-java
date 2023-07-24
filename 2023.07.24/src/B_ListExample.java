import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class B_ListExample {
	static Stack<Double> myStack;
	static double sumation;

	public static void main(String[] args) throws Exception {
		// 백준 1546. 평균 구하기
		// N <= 1000, 모든 값은 100이하 양의 정수. 하나 이상은 >0
		// 시간 제한 2초. N = 1000이어도 N^2까지 가능.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		double[] arr = new double[N];
		myStack = new Stack<Double>();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (i == 0) {
				myStack.push(arr[i]);
				continue;
			}
			if (myStack.peek() < arr[i]) {
				myStack.push(arr[i]);
			}
		}
		sumation = 0;
		for (int i = 0; i < N; i++) {
			sumation += arr[i];
		}
		System.out.println(sumation * 100 / myStack.peek() / N);
		br.close();
		// 슬슬 코드의 형태를 띄기 시작한다.
	}
}