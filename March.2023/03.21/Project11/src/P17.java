import java.util.Scanner;

public class P17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] score = new int[10];
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i+"��° �л� ���� �Է�");
			String inputNumber = scanner.nextLine();
			score[i] = Integer.parseInt(inputNumber);
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(i+" ��° �л��� ������"+score[i]);
		}
		int highScore = 0;
		int highScoreIndex = 1;
		for(int i = 0; i < 10; i++) {
			if(score[i]>highScore) {
				highScore = score[i];
				highScoreIndex = i;
			}			
		}
		System.out.println(highScoreIndex+"��° �л��� "+highScore+"���� ���� �����ϴ�.");
	
	}

}
