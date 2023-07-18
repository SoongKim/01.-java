import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Z_REVIEWING {
	public static void main(String[] args) throws Exception {
		// 처리 속도 샹항을 위한 BufferedReader 및 여하 식구들 소환.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		
		// Two Pointer의 각 출발 지점을 설정
		int start_index = 1;
		int end_index = 1;
		int sum = 1;	// start_index = 1이므로 sum 역시 1에서 출발
		int answer = 1; // end_index == N인 경우의 수

		while (end_index < N) {
			// 만약 sum이 N 이상이라면 sum에서 start_index 값을 제하고 s_i 1 증가.
			if (sum >= N) {
				sum -= start_index;
				start_index++;
			// sum < N이라면 end포인터를 한 칸 움직이고 sum에 산입한다.
			} else {
				end_index++;
				sum += end_index;
			}
			// 해당 과정 중에서 sum ==N이 성립한다면 answer를 1씩 증가.
			if (sum == N) {
				answer++;
			}
		}
		// answer 출력
		System.out.println(answer);
	}
}