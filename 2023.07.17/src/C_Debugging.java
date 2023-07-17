import java.util.Scanner;

public class C_Debugging {

	public static void main(String[] args) {
		// 디버깅 : 프로그램에서 발생하는 문법 / 논리 오류를 찾아 바로잡는 과정.
		// 방법 :
		// 1. 코드에서 디버깅하고자 하는 줄에 중단점을 설정. 중복 설정 가능하다.
		// 2. 코드를 한 줄씩 시행 or 중단점까지 실행 가능하다. 변수 변동을 확인하자.
		// 3. 변수값 외에도 수식의 논리 오류를 파악할 수도 있다.
		
		// 결함이 있는 예제 코드
		Scanner scanner = new Scanner(System.in);
		int testcase = scanner.nextInt();
		int answer = 0;
		int A[] = new int[100001];
		int S[] = new int[100001];
		// 1000001 칸 1차원 배열 두 개.
		
		for(int i = 1; i < 10000; i++) {
			A[i] = (int)(Math.random() * Integer.MAX_VALUE);
			S[i] = S[i-1] + A[i];
		}
		
		for(int t = 1; t < testcase; t++) {
			int query = scanner.nextInt();
			for(int i = 0; i < query; i++) {
				int start = scanner.nextInt();
				int end = scanner.nextInt();
				answer += S[end] - S[start - 1];
				System.out.println(testcase + " " + answer);
			}
		}
	// 찾은 문제점 :
	// 1. i가 1부터 시작하므로 S[1] = S[0] + A[1]이 불가하다.(S[0]이 없다.)
	// 2. 2중 for문 돌 건데 돌 때마다 scanner로 입력 받아야 하나?
	//	  밖에 빠져 있어야 하지 않을까?
	// 3. A와 S의 사이즈가 100001인데 반복 기준을 10000으로 설정했다.
	// 4. MAX_VALUE를 곱하는 바람에 int형 자료 구조에 담을 수 없는 수가 담겨버렸다.
	//	  long 타입으로 선언했다면 문제를 해결할 수 있었을 것.
	// ==> 코딩 테스트 간에는 어지간해서는 long 타입으로 정수를 선언해라.
	}
}