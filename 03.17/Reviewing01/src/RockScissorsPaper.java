import java.util.Random;
import java.util.Scanner;

public class RockScissorsPaper {

	public static void main(String[] args) {
		System.out.println("���������� �����Դϴ�.");
		System.out.println("p: ���� �÷����ϱ�");
		System.out.println("s: ��� Ȯ���ϱ�");
		System.out.println("q: �ý��� ����");
		
		Scanner gamePlay = new Scanner(System.in);
		
		String playGame = gamePlay.nextLine();
		
		
		int winPlay = 0;
		int drawPlay = 0;
		int losePlay = 0;

		for (int i = 0; i < 999999; i++) {
			

			int scissorsData = 0;
			int rockData = 1;
			int paperData = 2;
			
			if (playGame.equals("p")) {
				System.out.println("������ �����մϴ�.");
				System.out.println("������ 0, ������ 1, ���� 2�� �����ּ���.");
				int userData = Integer.parseInt(playGame);
			
				if (userData == scissorsData) {
					System.out.println("����ڲ��� ������ �����ϼ̽��ϴ�.");
				}
					else if (userData == rockData) {
					System.out.println("����ڲ��� ������ �����ϼ̽��ϴ�.");
				}
					else if (userData == paperData) {
					System.out.println("����ڲ��� ���� �����ϼ̽��ϴ�.");
				}
				
				Random apponent = new Random();
				int apponentData = apponent.nextInt(3);
				int wOl = userData = apponentData;
				
				if(apponentData == scissorsData) {
					System.out.println("��ǻ�ʹ� ������ �����Ͽ����ϴ�.");
				}
					else if(apponentData == rockData) {
					System.out.println("��ǻ�ʹ� ������ �����Ͽ����ϴ�.");
				}
					else if(apponentData == paperData) {
					System.out.println("��ǻ�ʹ� ���� �����Ͽ����ϴ�.");
				}
				
				int winningNumber01 = 1;
				int winningNumber02 = -2;
				int drawNumber = 0;
				int loseNumber01 = -1;
				int loseNumber02 = 2;
				
					if(wOl == winningNumber01 || wOl == winningNumber02) {
						System.out.println("����� ���� �¸��Դϴ�!");
					}
					else if(wOl == drawNumber) {
						System.out.println("���º��Դϴ�.");
					}
					else if(wOl == loseNumber01 || wOl == loseNumber02) {
						System.out.println("������� �й��Դϴ�...");
					}
					
			}
				else if (playGame.equals("s")) {
				System.out.println("��� Ȯ�� â�Դϴ�.");
				System.out.println("���ݱ���.");
				System.out.println("�� �¸�" + winPlay + " ȸ");
				System.out.println("�� �¸�" + drawPlay + " ȸ");
				System.out.println("�� �¸�" + losePlay + " ȸ");
				System.out.println("");
				System.out.println("ù ȭ������ ���ư��ϴ�.");
				System.out.println("");
				}
				else if (playGame.equals("q")) {
				System.out.println("������ �����մϴ�.");
				break;
				}
				else {
				System.out.println("�Է��Ͻ� �����͸� �ٽ� Ȯ�����ּ���.");
				System.out.println("");
				System.out.println("���� ȭ������ ���ư��ϴ�.");
				System.out.println("");
				}

		

	}
	}
}
