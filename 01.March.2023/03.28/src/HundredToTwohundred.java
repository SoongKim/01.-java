public class HundredToTwohundred {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userNum = 100;
		System.out.println(func(userNum));
	}

	public static int func(int a) {
		if(a > 199)
			return a;
		else
			return a + func(a+1);
	}
}
// a ���� 199�� �ʰ��ϴ� ���� ������ �ջ갪�� ��� a�� return�޾� �����ݴϴ�.
// �̸� ���� 100���� 200���� ���� �� 15,150�� ��µ��� Ȯ���� �� �־����ϴ�.