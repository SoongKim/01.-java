import java.util.Scanner;

public class P17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] score = new int[10];
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i+"번째 학생 점수 입력");
			String inputNumber = scanner.nextLine();
			score[i] = Integer.parseInt(inputNumber);
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(i+" 번째 학생의 점수는"+score[i]);
		}
		int highScore = 0;
		int highScoreIndex = 1;
		for(int i = 0; i < 10; i++) {
			if(score[i]>highScore) {
				highScore = score[i];
				highScoreIndex = i;
			}			
		}
		System.out.println(highScoreIndex+"번째 학생의 "+highScore+"점이 가장 높습니다.");
	
	}

}
