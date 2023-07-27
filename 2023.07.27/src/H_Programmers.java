import java.io.BufferedReader;
import java.io.InputStreamReader;

public class H_Programmers {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		if(N == 0) {
			System.out.println(0);
		}
		int answer = 0;
		for(int i = 1; i <= N; i++) {
			if(N % i == 0) {
				answer += i;
			}
		}
		System.out.println(answer);
	}
}

class sole{
	public int solution(int n) {
		int answer = 0;
		if(n == 0) {
			return 0;
		}
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				answer += i;
			}
		}
		return answer;
	}
}