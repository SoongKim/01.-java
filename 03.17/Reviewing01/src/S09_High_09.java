import java.util.Scanner;

public class S09_High_09 {

	public static void main(String[] args) {
		System.out.println("x: '���ڸ� �Է����ּ��� : '");
		Scanner s = new Scanner(System.in);
		int usernum = s.nextInt();

		for (int i = 0; 3 * i <= usernum; i++) {
			System.out.println("�Է��Ͻ� ���� " + usernum + "�� 3���� ���� ���� " + (usernum - 3 * i) + "�Դϴ�.");
		}
		s.close();
	}

}