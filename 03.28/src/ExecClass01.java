import java.util.Arrays;

public class ExecClass01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �迭�� ���Ͽ� ���캸��.
		int []numbers = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		// �ڿ� �ε����� ���� ���� numbers�� ������ �ƴϴ�.
		// �ݸ� �ε����� ���� numbers[0]�� �����̴�.
		// ��, numbers ��ü�� �ּҸ� ����Ű�� ��ǥ���� ��, ������ �ƴ�.

		System.out.println(numbers);
		// �迭�� �̵����� �ؼ� ����ϸ� �迭�� �޸� �� �ּҰ� ��µȴ�.
		// �ش� ����� ��� [I@5d22bbb7 �� ��µȴ�.
		// ��Ȯ���� �迭�� ����ϴ� ������ �޸� �� �ּҰ�.
		
		int[]mm;
		mm = numbers;
		// mm = �迭 numbers�̹Ƿ� mm ���� ������ �ּҸ� ����Ų��.
		
		System.out.println(Arrays.toString(mm));
		System.out.println(Arrays.toString(numbers));
		// ���� �� ��� ������ ������ �迭�� ����Ѵ�.
		// mm�� numbers�� �Ȱ��� �ִϱ�.
		
		// �̻� �迭�̾����ϴ�.
		// ��� ���α׷� ���� ����ϴ� ģ�����ϴ�.
		// ��Ī�ϴ� �ܾ�� �޶�, ��� ���� ������ �ٷ�ϴ�.
	}

}
