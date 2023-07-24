import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class E_PartialSumation {

	public static void main(String[] args) throws Exception{
		// 백준 10986번. 나머지 합 구하기
		// N개 주고, 연속합이 M으로 나눠지는 구간 갯수를 구하자.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int[] arrs = new int[N+1];
		arrs[0] = 0;
		for(int i = 1; i < N+1; i++) {
			arrs[i] = arrs[i-1] + arr[i-1];
		}
		for(int i = 0; i < N+1; i++) {
			arrs[i] = arrs[i] % 3;
		}
		int count= 0;
		for(int i = 1; i < N+1; i++) {
			if(arrs[i] == 0) {
				count++;
			}
		}
		System.out.println(count * 2 + 1);
	}

}
