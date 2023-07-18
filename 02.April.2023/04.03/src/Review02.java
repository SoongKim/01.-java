import java.util.Scanner;

public class Review02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int N;
		int[] arr;
		int[] cnt;
		for(int test_case = 1; test_case <=T; test_case++) {
			N = sc.nextInt();
			cnt = new int[11];
			arr = new int[N];
			for(int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
				cnt[arr[i]]++;
			}
		
		
		for(int i = 0; i < 11; i++) {
			if(cnt[i] > 0) {
				System.out.println(i);
			}
		}
		System.out.println();

		// 뭔 말인지 모르겠어용
	}

}
}
