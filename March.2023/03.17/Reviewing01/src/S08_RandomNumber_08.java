import java.util.Random;
import java.util.Scanner;

public class S08_RandomNumber_08 {

	public static void main(String[] args) {
		System.out.println("���ڸ� �Է��ϼ���.(0~100)");

		Scanner user = new Scanner(System.in);
		int userNum = user.nextInt();

		if (userNum <= 100 && userNum > 0) {

			Random oddEven = new Random();
			int evenOdd = oddEven.nextInt(9) + 1;
			int lastNum = userNum / evenOdd;

			if ((userNum / evenOdd) % 2 == 0) {
				System.out.println("����� ���� " + userNum + "���� ������ �� " + evenOdd + "�� ���� ���� " + lastNum + ", ¦���Դϴ�.");
			} else {
				System.out.println("����� ���� " + userNum + "���� ������ �� " + evenOdd + "�� ���� ���� " + lastNum + ", Ȧ���Դϴ�.");
			}
		} else if (userNum > 100 || userNum < 0) {
			System.out.println("���ڰ� Ů�ϴ�.");
		}
		user.close();
	}
}