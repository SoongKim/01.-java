public class fiveFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userNum = 5;
		System.out.println(func(userNum));
	}

	public static int func(int n) {
		if(n <=1) {
			return n;
		}
		else
			return func(n-1)*n;
	}
}

// n ���� 1 ���Ͽ� �ش��ϸ� n�� return �����Ƿ� 1�� return�޽��ϴ�.
// �̿� �Է��� 5�κ��� 1�� �۾����� ��� �Լ��� ȣ���Ͽ����Ƿ�
// 5 * 4 * 3 * 2 * 1(==return)�� ������� 120�� ��µǴ� ���� Ȯ���� �� �ֽ��ϴ�.