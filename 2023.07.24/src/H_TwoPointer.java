import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class H_TwoPointer {
	public static void main(String[] args) throws Exception{
		// 백준 1253. 좋은 수 구하기
		// 시간 제한 2초. N <= 2000인 자연수.
		// 주어진 배열에서 A[i] = A[j] + A[k]인 경우의 수를 구하자.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int startIndex = 0;
		int endIndex = startIndex+1;
		int targetIndex = N-1;
		int count = 0;
		while(startIndex < targetIndex) {
			int targetNum = arr[startIndex] + arr[endIndex];
			if(startIndex != endIndex && targetNum == arr[targetIndex]) {
				count++;
				endIndex++;
			}
			else if(targetNum > arr[targetIndex]) {
				startIndex++;
				endIndex = 0;
				targetIndex--;
			}
			else {
				endIndex++;
			}
		}
		System.out.println(count);
	}
}
