public class fibonazzi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userNum = 10;
		System.out.println(func(userNum));
	}

	public static int func(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else
			return func(n - 2) + func(n - 1);
	// �Ǻ���ġ ������ �ڽ��� �� �� ���� ���� ���� �ڽ��� ������ �ϴ� �����Դϴ�.
	// �̿� �ڽ��� �տ� �� ���� �����Ͱ� �������� �ʴ� 0�� 1�� ��� �״�� �ڽ��� ����ϰ�,
	// �׷��� ���� ��� n-2�� n-1�� �ش��ϴ� �Ǻ���ġ ���� �Լ��� �ҷ������ν�
	// n ��°�� ��ġ�� ���� ����� �� �ֽ��ϴ�.
	// �ش� �ڵ带 ���� 10 ��° ������ 55�� ��µ��� Ȯ���� �� �ֽ��ϴ�.
	}
}