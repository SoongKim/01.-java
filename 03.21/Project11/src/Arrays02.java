import java.util.Arrays;
import java.util.Scanner;

public class Arrays02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] score = new int[10];
		int maxNum = Integer.MIN_VALUE;
		int mvpNum = 0;
		for(int i = 0; i < 10; i++) {
			System.out.println((i+1)+"���� �л��� ������ �Է����ּ���.");
			score[i] = scanner.nextInt();
			if(score[i]>maxNum) {
				maxNum = score[i];
				mvpNum = i+1;
			}	
		}
		for(int i = 0; i < 10; i++) {
			System.out.println((i+1)+"�� �л��� ������ "+score[i]);
		}
		System.out.println("�ְ� ������");
		System.out.println(mvpNum+"�� �л���" + maxNum+"��");
	scanner.close();
	}

}