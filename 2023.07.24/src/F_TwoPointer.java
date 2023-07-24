import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class F_TwoPointer {

	public static void main(String[] args) throws Exception{
		// 투 포인터. 알고리즘 시간 복잡도를 최적화한다.
		// 백준 2018. 연속된 자연수의 합 구하기
		// 1 <= N <= 10,000,000. 2초.
		// 연속된 자연수의 합으로 나타내는 가짓수.
		// 10
		//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		// 1, 2, 3, 4
		// 10 의 두 가짓수가 존재하므로 답은 2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = i+1;
		}
		System.out.println(Arrays.toString(arr));
		
		int startNum = 0;
		int endNum =  startNum;
		int count = 0;
		int result = 0;
		while(startNum <= N-1) {
			 result += arr[endNum];
			 if(result > N) {
				 startNum++;
				 endNum = startNum;
				 result = 0;
			 }
			 else if(result == N) {
				 count++;
				 startNum++;
				 endNum = startNum;
				 result = 0;
			 }
			 else {
				 endNum++;
			 }
		}
		System.out.println(count);
		// 포인터를 두 개 만들었으면
		// 두 개 다 사용해라 등신아.
	}

}
