import java.util.Arrays;
import java.util.Random;

public class ExecClass00_Homework02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] numbers = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
		// �̷��� �迭�� �����Ͽ��� 2�� �迭�� ������ �� �ִ�.
		// = int numbers[][] = new int[4][4];
		
		// �� �� ������ �迭�� �ʱⰪ�� �������.(����� �� ������)
		// �� ���� ����ϴ� ����� �ٸ���,
		// � ���� �ʱⰪ ������ ���� �����ϱ�. ȣȯ�� ����� ����
		
		Random random = new Random();
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				numbers[i][j] = random.nextInt(100);
			}
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				numbers[i][3] = numbers[i][3] + numbers[i][j];
				numbers[3][j] = numbers[3][j] + numbers[i][j];
				numbers[3][3] = numbers[3][3] + numbers[i][j];
		// 2. 3�� / 3�� / 3�� 3��/ �� ���� ���� �� ��/���� ������ ����ϰ� ���� ��
		// ���� ���� ���·� �ۼ��� �� �ִ�.
			}
		}
		
		System.out.println("���� ������ �迭�� ������ �����ϴ�.");
		System.out.println(Arrays.deepToString(numbers));
		// 1. ���� ������ ���� �迭
		
		System.out.println();
		System.out.println("4X4 ���·� ���ĵ� �迭�� ������ �����ϴ�.");
		System.out.println();
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers.length; j++) {
				System.out.printf("%5d", numbers[i][j]);
			}
			System.out.println();
			// printf�� ���. ���ù����� ���̾���.
			// �̳��� �迭�� 4 X 4 ���·� ����� �� �ִ� ���̴�.
			// 1 �� ���� ����� ���ڻ쳵��. ������ ��...
			// printf ��� �߰� �н� ���. �������� ����÷��� �� ���̴�.
			// printf�� %4d : 4�� �ڸ����� �ǹ��Ѵ�.
			// �����Ͱ� �����ϴ� �ڸ� ���� ���Ѵ�.
			// if. "%6d %03.1f", ��� ��� ������
			// : 6ĭ ����ְ�, �տ� 3.1 ���� �������� ������ �����!
		}
	}
}