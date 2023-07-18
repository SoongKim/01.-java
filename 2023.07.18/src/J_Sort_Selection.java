import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class J_Sort_Selection {

	public static void main(String[] args) throws Exception {
		// 백준 2750
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		for(int i = 0; i < N; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N-1; j++) {
				if(arr[i] < arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for(int i = 0; i < N; i++) {
			System.out.println(arr[i]);
		}
	}
}