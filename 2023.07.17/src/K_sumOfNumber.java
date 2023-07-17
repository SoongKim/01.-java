import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class K_sumOfNumber {

	public static void main(String[] args) throws Exception {
		// 백준 2003번 문제.
		// N칸 수열에서 연속된 수열의 합이 M이 되는 경우의 수를 구하라.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] Arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			Arr[i] =  Integer.parseInt(st.nextToken()); 
		}
		int index = 0;
		int start_index = 0;
		int end_index = 0;
		int sum = 0;
		while(start_index < N) {
			if(sum > M || end_index == N) {
				sum -= Arr[start_index];
				start_index++;
			}
			else {
				sum += Arr[end_index];
				end_index++;
			}
			if(sum == M) {
				index++;
			}
		}
		System.out.println(index);
	}
}