import java.util.Arrays;
import java.util.Scanner;

public class E_question002 {

	public static void main(String[] args) {
		// 백준 1546번 문제
		// 자기 점수 중 최댓값 = M
		// 모든 점수를 점수 / M*100 으로 고쳤다.
		// 새로운 평균을 구하는 프로그램을 작성하시오.
		// 첫 줄에 과목 수 N. N <= 1000
		// 둘쨋 줄에 현재 성적이 주어진다. 0<=성적<=100. 적어도 하나 이상은 0보다 큼
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int A[] = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = scanner.nextInt();
		}
		long sum = 0;
		long maxNum = Integer.MIN_VALUE;
		for(int i = 0; i < A.length; i++) {
			if (A[i] > maxNum) {
				maxNum = A[i];
			}
			sum += A[i];
		}
		System.out.println(sum * 100 / maxNum / N);
		//   ((A / C) * 100 + (B / C) * 100 + (C / C) * 100) / N
		// = ((A + B + C) * 100 / C) / N
	}
}