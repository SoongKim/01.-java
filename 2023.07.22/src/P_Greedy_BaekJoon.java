import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P_Greedy_BaekJoon {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		int count = 0;
		for(int i = 1; i < N; i++) {
			arr[i] = arr[i] - arr[i-1];
			count+=arr[i-1];
		}
		count+=arr[N-1];
		System.out.println(count);
	}
}
