import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class G_Programmers {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] answer = {};
		answer = new int[2];
//		int[] arr = new int[2];
//		Stack<Integer> myStack = new Stack<Integer>();
//		int sol = n > m ? n : m;
//		for(int i = 1; i <=sol; i++) {
//			if(n % i == 0&& m % i == 0) {
//				myStack.add(i);
//			}
//		}
//		arr[0] = myStack.pop();
//		// 최대공약수
//		
//		// 최소 공배수를 구하자
//		int a = 1;
//		int b = 1;
//		while(a * n != b * m) {
//			if(a * n < b * m) {
//				a++;
//			}
//			else if(a * n > b * m) {
//				b++;
//			}
//		}
//		arr[1] = a * n;
//		System.out.println(Arrays.toString(arr));
	}
}
