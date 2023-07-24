import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class G_TwoPointer {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		// N, M 변수를 할당하여 입력 받은 정수 값을 저장.

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		// StringTokenizer를 사용하여 정수 값들을 기선언한 배열 arr에 저장.

		Arrays.sort(arr);
		// 오름차순 정렬
		int startIndex = 0;
		int endIndex = N - 1;
		int count = 0;
		// arr[startIndex] + arr[endIndex] 를 따로 할당 하는 건 어땠을까.
		// > M, == M, <M의 세 가지 경우를 고려한다.
		// 오름차순된 배열이므로 arr[startIndex] < arr[startIndex+1]의 구조,
		// 반면, arr[endIndex] > arr[endIndex - 1]이다. while 요건에 부합하면 반복하자.
		while (startIndex < endIndex) {
			if (arr[startIndex] + arr[endIndex] == M) {
				count++;
				endIndex--;
			} else if (arr[startIndex] + arr[endIndex] > M) {
				endIndex--;
			} else {
				startIndex++;
			}
		}
		System.out.println(count);
	}
}