import java.util.Random;
import java.util.Scanner;

public class P11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int gameCount = 0;
		int winPlay = 0;
		int drawPlay = 0;
		int losePlay = 0;
		
		for (int i = 0; i < 999999; i++) {

			System.out.println("����(0), ����(1), ��(2) ��");
			System.out.println("�ϳ��� �Է����ּ���. ����(q)");

			String inputString = scanner.nextLine();

			if(inputString.equals("q")) {
				System.out.println("������ ����Ǿ����ϴ�.");
				System.out.println("�� " + gameCount + ", �� ����ڴ� " + winPlay + "�� �̰��, ��ǻ�ʹ� " + losePlay + "�� �̰���ϴ�.");
				break;
			}
			gameCount++;
			System.out.println("");
			System.out.println(gameCount + " ��° ����");
			System.out.println("");
			int userInput = Integer.parseInt(inputString);
			int comInput = random.nextInt(3);

			if(userInput == 0) {
				System.out.println("����ڰ� ������ �½��ϴ�.");
			} else if(userInput == 1) {
				System.out.println("����ڰ� ������ �½��ϴ�.");
			} else if(userInput == 2) {
				System.out.println("����ڰ� ���� �½��ϴ�.");
			}
			
			System.out.println("");
			
			if (comInput == 0) {
				System.out.println("��ǻ�Ͱ� ������ �½��ϴ�.");
			} else if (comInput == 1) {
				System.out.println("��ǻ�Ͱ� ������ �½��ϴ�.");
			} else if (comInput == 2) {
				System.out.println("��ǻ�Ͱ� ���� �½��ϴ�.");
			}

			System.out.println("");
			
			if (userInput == comInput) {
				System.out.println("�����ϴ�.");
				drawPlay = drawPlay + 1;
			} else if ((userInput == 0 && comInput == 1) || (userInput == 1 && comInput == 2)
					|| (userInput == 3 && comInput == 0)) {
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				winPlay = winPlay + 1;
			} else {
				System.out.println("����ڰ� �����ϴ�.");
				losePlay = losePlay + 1;
			}
			System.out.println("");
			System.out.println("��� �����Ͻ÷��� ���͸� �����ּ���.");
			scanner.nextLine();
			
		}
			scanner.close();
	}
}