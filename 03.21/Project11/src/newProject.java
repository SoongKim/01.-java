import java.util.Random;
import java.util.Scanner;

public class newProject {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 999999; i++) {

			System.out.println("�ֻ��� ������ �����Դϴ�.");
			System.out.println("q: ����");

			String playGame = scanner.nextLine();

			if (playGame.equals("q")) {
				System.out.println("������ �����մϴ�.");
				break;
			}

			Random userData = new Random();
			int userNum = userData.nextInt(6);

			System.out.println("����ڴ� " + (userNum + 1) + " ��/�� ���Խ��ϴ�.");
			System.out.println("��ǻ�Ͱ� �ֻ����� �����ϴ�. �����ұ��?");

			scanner.nextLine();

			Random comData = new Random();

			int comInput = comData.nextInt(5);

			System.out.println("��ǻ�ʹ� " + (comInput + 1) + "�� ���Խ��ϴ�.");

			System.out.println();
			if (userNum > comInput) {
				System.out.println("You Win!");
			} else if (userNum < comInput) {
				System.out.println("You Lose!");
			} else {
				System.out.println("Draw");
			}
			System.out.println();
		}
	}
}