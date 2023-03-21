import java.util.Scanner;

public class Arrays01 {

	public static void main(String[] args) {
		//학생 10 인의 성적을 입력
		
//		int a1 = scanner.nextInt();
//		int a2 = scanner.nextInt();
//		int a3 = scanner.nextInt();
//		int a4 = scanner.nextInt();
//		int a5 = scanner.nextInt();
//		int a6 = scanner.nextInt();
//		int a7 = scanner.nextInt();
//		int a8 = scanner.nextInt();
//		int a9 = scanner.nextInt();
//		int a10 = scanner.nextInt();
		
		
//		int[] score = new int[10];
//		score[0] = scanner.nextInt();
//		score[1] = scanner.nextInt();
//		score[2] = scanner.nextInt();
//		score[3] = scanner.nextInt();
//		score[4] = scanner.nextInt();
//		score[5] = scanner.nextInt();
//		score[6] = scanner.nextInt();
//		score[7] = scanner.nextInt();
//		score[8] = scanner.nextInt();
//		score[9] = scanner.nextInt();
//		이렇게 쓰면 너무 길어지니까
		
//		요렇게 써준다.
		int[] score = new int[10];
		// 데이터 10 개를 담을 수 있는 score 배열을 만든다.
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < 10; i++) {
			System.out.println((i+1) + " 번째 학생의 점수를 입력해주세요.");
			score[i] = scanner.nextInt();
		}
			System.out.println("입력된 점수 확인");
			System.out.println(java.util.Arrays.toString(score));
			int totalScore = 0;
			for(int i = 0; i < 10; i++) {
				totalScore = totalScore + score[i];
			}
			System.out.println("총점:" + totalScore);
			System.out.println("평균:" + (totalScore/ (double)10));
	}

}