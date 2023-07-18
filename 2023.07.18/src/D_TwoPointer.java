import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D_TwoPointer {

	public static void main(String[] args)throws Exception {
		// TODO 백준 2018번
		// N(1<=N<=10,000,000)을 연속된 자연수의 합으로 나타내는 경우의 수를 구하자.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		int count = 1;
		int start_index = 1;
		int end_index = 1;
		int sum = 1;
		
		while(end_index < N) {
			if(sum==N) {
				count++;
				sum -= start_index;
				start_index++;
			}
			else if(sum > N) {
				sum -= start_index;
				start_index++;
			}
			else{
				end_index++;
				sum += end_index;
			}
		}
		System.out.println(count);
		// 투 포인터에 관한 개념을 이제야 이해했다.
		// 서로 독립적인 움직임을 지니는 포인터 둘이 이동한다.
		// 잘못 이해하고 억지로 배열에 넣어 운용하려 했던 내 잘못이다.
		// A O O O B O O ==> A O O O O B O 식으로 따로 움직인당.
	}
}