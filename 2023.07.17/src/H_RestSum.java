import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class H_RestSum {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		// BufferedReader로 받은 문자열을 정수로 치환하여 변수 N에 저장
		int N = Integer.parseInt(st.nextToken());
		// 사용할 초기 변수들. count, start_index. end_index, sum 변수에 각각 1 값을 저장.
		int count = 1;
		int start_index = 1;
		int end_index = 1;
		int sum = 1;
		// 정해진 가짓수 없이 답을 찾을 때까지 기동할 것이므로 for문 대신 while문을 사용.
		while(end_index != N) {
			// 만약 sum이 N과 같다면 카운트를 하나 더하고, 시작 인덱스값에 1을 더하고, 나머지 값들을 시작 인덱스 값으로 초기화.
			if(sum == N) {
				count++;
//				end_index++;
//				sum = sum + end_index;
				start_index++;
				end_index = start_index;
				sum = start_index;
			}
			// 만약 sum 값이 N을 초과하면 시작 인덱스값에 1을 더하고, 다른 사용 변수들을 시작 인덱스값으로 초기화
			else if(sum > N) {
//				sum = sum - start_index;
				start_index++;
				end_index = start_index;
				sum = start_index;
			}
			// sum값이 N 미만인 경우 end_index에 1을 더하고, 이를 sum 값에 합산.
			else {
				end_index++;
				sum = sum + end_index;
			}
		}
		// 도달해 갯수를 출력.
		System.out.println(count);
	}
}