import java.util.Random;
import java.util.Scanner;

public class LectureDice01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int playTime = 0;
		for(int i = 0; i < 999999; i++) {
		
			System.out.println("ȭ�鿡 �ֻ����� �������?");
			System.out.println("q: ����");
			System.out.println("s: ��� Ȯ��");
			String userInput = scanner.nextLine();
			if(userInput.equals("q")) {
				System.out.println("������ �����մϴ�.");
				break;
			}
			if(userInput.equals("s")) {
				System.out.println("��踦 Ȯ���մϴ�.");
				System.out.println();
				System.out.println("�� " + playTime + " ȸ �÷����ϼ̽��ϴ�.");
				System.out.println();
				continue;
			}
			
			int userDice = random.nextInt(6) + 1;
			System.out.println("����� �ֻ����� " + userDice + " �� ���Խ��ϴ�.");
			System.out.println("��ǻ�Ͱ� �ֻ����� �������?");
			
			scanner.nextLine();
	
			int comDice = random.nextInt(6) + 1; 
			System.out.println("��ǻ�� �ֻ����� " + comDice + " �� ���Խ��ϴ�.");
	
				if(userDice > comDice) {
					System.out.println("You Win!");
				}
				else if(userDice < comDice) {
					System.out.println("You Lose!");
				}
				else {
					System.out.println("Draw");
				}
				System.out.println();
				playTime = playTime + 1;
		}
	}
}