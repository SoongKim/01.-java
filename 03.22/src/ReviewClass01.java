import java.util.Scanner;

public class ReviewClass01 {

	public static void main(String[] args) {
		String a = "abc";
		String b = "abc";
		System.out.println(a == "abc");
		// true
		System.out.println(a == b);
		// true

		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();

		System.out.println(a == inputString);
		// false. why???
		// value versus value �񱳰� �ƴմϴ�.
		// ��ü �� ��ü �񱳸� �ؾ߸� �մϴ�.
		// �� �� .equals�� ����մϴ�.
		System.out.println(a.equals(inputString));
		// �䷯�� Ʈ�簡 ���ɴϴ�. ���߾�. ���߾�.

		int c = 3; // ����� �޸𸮿� c�� 3�̶�� ����
		int d = 4; // ����� �޸𸮿� d�� 4��� ����
		int temp; // ����� �� �޸�(����)�� temp ��� �ӽ� ������ ����
		//�Լ��� ����. ������ �Լ�.
		
		int e[] = {1, 2, 3, 4, 5};
		// g��� ��ǥ ȭ��ǥ. g�� �밡���� ���� �����͸� �����Ͽ���.
		// g�� �����Ͱ� �ƴ� ���۷���.
		// ���� �ٸ� �����Ϳ� ������ �� �ֵ��� ���� �����ִ� ����.
		// �� ��ü�����δ� �ǹ̰� ����. ������� ��
		// ��ü ������ �ν��� �� ���� �߿��� �� ���۷���!
		
	}

}
