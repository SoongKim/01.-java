import java.util.Arrays;
import java.util.Random;

public class Sort {

	public void doSort() {
		int[] numbers = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		//�̸��� numbers, �ʱⰪ�� 0�� 10ĭ¥�� �迭�� ���������.
		
		int lenNum = numbers.length;
		
		// 1. Random���� ����
		Random random = new Random();
		for(int i = 0; i < lenNum; i++) {
			numbers[i] = (random.nextInt(100)+1);
		//	1���� 100������ ���� ���ϴ� �������� �迭 �����ͷ� ����
		//	numbers[i] = (int)Math.floor(Math.random()*100)+1;
		//	�䷸�Ե� ���� ���� ������ �� �ִ�.
		}
		System.out.println(Arrays.toString(numbers));
		// �����κ��� �߻��� �����Ͱ��� �迭�� ��� ����Ͽ���.
		
		// 2. ���� �˰����� Ȱ���� ������ ����(sort)
		
			// 2-1. Selection Sort
		
//		for(int i = 0; i < lenNum; i++) {
//			for(int j = i+1; j < lenNum; j++) {
//				if(numbers[i] > numbers[j]) {
//					int temp = numbers[i];
//					numbers[i] = numbers[j];
//					numbers[j] = temp;
//					//���� ���� ���� �˰���
//				}
//			}
//		}
		for(int k = 0; k < lenNum; k++) {
			for(int y = k+1; y < lenNum; y++) {
				if(numbers[k] < numbers[y]) {
					int temp02 = numbers[k];
					numbers[k] = numbers[y];
					numbers[y] = temp02;
					// ���� ���� ���� �˰���
				}
			}
		}
		
		// ������ ������ �߰�ȣ �ȿ����� ��� �����ϴ�.
		// �ش� �߰�ȣ�� ������ �������� �ʴ� �ٸ� �������� ��� �Ұ��ϴ�.
		
		// i > j �� �����Ѵٸ� ���� ��������,
		// i < j �� �����Ѵٸ� ���� �������� �����Ѵ�.
		
		// Arrays.sort(numbers);
		// �迭 ���� ����� ȣ���ϴ� ��ɾ�. Arrays.sort
		
		System.out.println(Arrays.toString(numbers));
		// ���ĵ� �迭�� ���.
	}
}