import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A_reviewPrefixSum {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		int[] arrs = new int[N+1];
		
		arrs[0] = 0;
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= N; i++) {
			arr[i-1] = Integer.parseInt(st.nextToken());
			arrs[i] = (arrs[i-1] + arr[i-1]) % 3;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrs));
		
	}
}