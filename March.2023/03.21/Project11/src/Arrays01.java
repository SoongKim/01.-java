import java.util.Scanner;

public class Arrays01 {

	public static void main(String[] args) {
		//�л� 10 ���� ������ �Է�
		
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
//		�̷��� ���� �ʹ� ������ϱ�
		
//		�䷸�� ���ش�.
		int[] score = new int[10];
		// ������ 10 ���� ���� �� �ִ� score �迭�� �����.
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < 10; i++) {
			System.out.println((i+1) + " ��° �л��� ������ �Է����ּ���.");
			score[i] = scanner.nextInt();
		}
			System.out.println("�Էµ� ���� Ȯ��");
			System.out.println(java.util.Arrays.toString(score));
			int totalScore = 0;
			for(int i = 0; i < 10; i++) {
				totalScore = totalScore + score[i];
			}
			System.out.println("����:" + totalScore);
			System.out.println("���:" + (totalScore/ (double)10));
	}

}