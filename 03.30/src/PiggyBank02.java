import java.util.Scanner;

public class PiggyBank02 {

	public void main() {
		// TODO Auto-generated method stub
		PiggyBank01 pb1 = new PiggyBank01();
		PiggyBank03 pb3 = new PiggyBank03();
		
		System.out.println("�۾��� �����մϴ�.");
		for (int i = 0; i < 999999; i++) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println();
			System.out.println("[1] �Ա� : [2] ��� : [3] �ܾ�Ȯ��");
			System.out.println("[0] ���¸��� : [9] ���� ����");
			System.out.println("[q] ����");
			System.out.println("");
			String userInput = scanner.nextLine();
			if (userInput.equals("1")) {
				pb3.Insert();
			} else if (userInput.equals("2")) {
				pb3.Withdraw();
			} else if (userInput.equals("3")) {
				pb3.checkAccount();
			} else if (userInput.equals("0")) {
				pb3.nameTag();
			} else if(userInput.equals("9")) {
				pb1.main(null);
			}
			else if (userInput.equals("q")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else {
				System.out.println("�ùٸ� ���� �Է����ּ���.");
			}
			System.out.println();
		}
	}
}