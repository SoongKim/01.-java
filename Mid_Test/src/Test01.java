import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		int answer = 0;
		Scanner scanner = new Scanner(System.in);

		// 대상 변수인 N, M, K를 scanner로 입력 받는다.
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int K = scanner.nextInt();

		// 빈 배열을 선언. 길이는 수열의 길이인 N.
		Integer[] arr = new Integer[N];

		// for문을 통해 배열 arr에 scanner로 입력 받은 양의 정수 데이터들을 입력한다.
		for (int i = 0; i < N; i++) {
			arr[i] = scanner.nextInt();
		}
		// 배열을 역순 정렬. 이를 위한 Integer 타입 선언.
		Arrays.sort(arr, Collections.reverseOrder());

		// index 선언. index가 M이 되면 for문을 탈출한다.
		int index = 0;
		for (int i = 0; i < N; i++) {
			if(index == M) {
				break;
			}
		//index < M인 경우 for문을 통해 배열 내 가장 큰 수부터 K회 더해준다.
			else if(index < M) {
				for (int j = 0; j < K; j++) {
					answer = answer + arr[i];
					index++;
				}
			}
		}
		// answer를 출력
		System.out.println(answer);
	}
}
