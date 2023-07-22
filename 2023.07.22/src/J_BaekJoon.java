import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class J_BaekJoon {
	static Stack<Integer> myStack;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int[] data = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			data[i] = Integer.parseInt(st.nextToken());
		}
		myStack = new Stack<Integer>();
		
		for(int i = 0; i < N; i++) {
			while(!myStack.isEmpty() && data[myStack.peek()] < data[i]) {
				data[myStack.pop()] = data[i];
			}
			myStack.add(i);
		}
		while(!myStack.isEmpty()) {
			data[myStack.pop()] = -1;
		}
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i = 0; i < N; i++) {
			bw.write(data[i] + " ");
		}
		bw.flush();
		
	}
}