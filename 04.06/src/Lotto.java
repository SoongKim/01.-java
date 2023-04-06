import java.util.Arrays;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 1~45 ���� ���� �� 6���� �����ϰ� �̴� ���α׷��� �ۼ��Ͻÿ�. �ߺ��� ���ڸ� �����ϴ� ������ ���ԵǾ�� ��.
		
		Random random = new Random();
		// ���� ������ ȣ��
		int[] lotto = new int[6];
		// ���� ���� ���ϴ� 6ĭ �迭 ����
		int lento = lotto.length;
		// lento : lotto �迭�� ����.
		for (int i = 0; i < lento; i++) {
			lotto[i] = (random.nextInt(45) + 1);
			// lotto[i] �� ������ (0~44) + 1�� ��(1~45)�� array lotto�� 0~5�� �ε���, �� 6ĭ�� ����
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					// ���� lotto[i]�� //lotto[j]�� ���� ������
					i--;
					// i ���� �ϳ� ���̰�
					break;
					// �ݺ����� Ż���� lotto[i]�� �缳��.
					// �ߺ��Ǵ� ���� ������ ���� ������.
				}
			}
		}
		for (int i = 0; i < lento; i++) {
			for (int j = 0; j < lento; j++) {
				if (lotto[i] < lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		// Selection Sort�� ����� �������� ����.

		System.out.println("�迭 ���");
		System.out.println(Arrays.toString(lotto));
		// ���� �������� ���ĵ� �ζ� ��ȣ ���� ���� �迭 ���·� ���.

		System.out.println();

		// ���� ���� ������ ����ϰ� �ʹٸ�
		System.out.println("���� ���");
		for (int i = 0; i < lento; i++) {
			System.out.print(lotto[i] + "�� ");
		}
	}
}