import java.util.Random;
import java.util.Scanner;

public class S05_Random_game_05 {

	public static void main(String[] args) {
		System.out.println("�������ڳ��̰���");
		System.out.println("0~100������ ���ڸ� �Է����ּ���.");
		Scanner user = new Scanner(System.in);
		int userData = user.nextInt();
		System.out.println("�Է�:");

		if (userData >= 0 && userData <= 100) {

			Random addNum1 = new Random();
			int addNum01 = addNum1.nextInt(101);
			Random addNum2 = new Random();
			int addNum02 = addNum2.nextInt(101);
			Random addNum3 = new Random();
			int addNum03 = addNum3.nextInt(101);

			int userPlay = userData + addNum01;
			int comPlay = addNum02 + addNum03;

			if (userPlay > comPlay) {
				System.out.println("����� �Է¼��ڴ� " + userData + ", " + "������Է¼���+��������" + "=" + userPlay + ", "
						+ "��ǻ�� �Է¼��� + �������ڴ� " + comPlay + ", " + "������� �¸��Դϴ�.");
			} else if (userPlay < comPlay) {
				System.out.println("����� �Է¼��ڴ� " + userData + ", " + "������Է¼���+��������" + "=" + userPlay + ", "
						+ "��ǻ�� �Է¼��� + �������ڴ� " + comPlay + ", " + "��ǻ���� �¸��Դϴ�.");
			} else if (addNum02 == addNum03) {
				System.out.println("ERROR");
			}
		} else if (userData <= 0 || userData > 100) {
			System.out.println("0~100������ ���ڰ� �ƴմϴ�.");
		}
		user.close();
	}
}