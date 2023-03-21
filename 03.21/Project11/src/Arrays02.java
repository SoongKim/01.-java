import java.util.Arrays;
import java.util.Scanner;

public class Arrays02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] score = new int[10];
		int maxNum = Integer.MIN_VALUE;
		int mvpNum = 0;
		for(int i = 0; i < 10; i++) {
			System.out.println((i+1)+"번쨰 학생의 점수를 입력해주세요.");
			score[i] = scanner.nextInt();
			if(score[i]>maxNum) {
				maxNum = score[i];
				mvpNum = i+1;
			}	
		}
		for(int i = 0; i < 10; i++) {
			System.out.println((i+1)+"번 학생의 점수는 "+score[i]);
		}
		System.out.println("최고 점수는");
		System.out.println(mvpNum+"번 학생의" + maxNum+"점");
	scanner.close();
	}

}