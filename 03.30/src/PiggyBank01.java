import java.util.Scanner;

public class PiggyBank01 {
	int num = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PiggyBank03[] pb3 = new PiggyBank03[100];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 100; i++) {
			pb3[i] = new PiggyBank03();
		}
		for (int i = 0; i < 999999; i++) {
			System.out.println("������ ���α׷��� �⵿�մϴ�.");
			System.out.println("[1] �ű� ���� ����");
			System.out.println("[2] ���� ���� ����");
			int oOt = Integer.parseInt(scanner.nextLine());
			if (oOt == 1) {
				System.out.println("�� �� ���¸� �����Ͻðڽ��ϱ�?");
				int accountNum = Integer.parseInt(scanner.nextLine());
				pb3[accountNum].accountNumber = accountNum;
				pb3[accountNum].accountOpen();
			} else if (oOt == 2) {
				System.out.println("�� �� ���·� �����Ͻðڽ��ϱ�?");
				int loginAccount = Integer.parseInt(scanner.nextLine());
				if (pb3[loginAccount].accountOpen == false) {
					System.out.println("�Է��Ͻ� ��ȣ�� �ش��ϴ� ���°� �������� �ʽ��ϴ�.");
				} else {
					for (int j = 0; j < 999999; j++) {
						System.out.println("[1] �Ա� : [2] ��� : [3] �ܾ�Ȯ��");
						System.out.println("[0] ���¸��� : [5] ���� ���� : [q] ����");
						String userInput = scanner.nextLine();
						if (userInput.equals("1")) {
							System.out.println("�� �� ���¿� �Ա��Ͻðڽ��ϱ�?");
							int insertAccount = Integer.parseInt(scanner.nextLine());
							pb3[insertAccount].Insert();
						} else if (userInput.equals("2")) {
							System.out.println("�� �� ���¿��� ����Ͻðڽ��ϱ�?");
							int withdrawAccount = Integer.parseInt(scanner.nextLine());
							pb3[withdrawAccount].Withdraw();
						} else if (userInput.equals("3")) {
							System.out.println("�� �� ���¸� ��ȸ�Ͻðڽ��ϱ�?");
							int account = Integer.parseInt(scanner.nextLine());
							pb3[account].checkAccount();
						} else if (userInput.equals("0")) {
							System.out.println("�� �� ������ �̸��� �����Ͻðڽ��ϱ�?");
							int changeName = Integer.parseInt(scanner.nextLine());
							pb3[changeName].nameTag();
						} else if (userInput.equals("5")) {
							System.out.println("�� �� ���¸� �����Ͻðڽ��ϱ�?");
							int createAccount = Integer.parseInt(scanner.nextLine());
							if (pb3[createAccount].accountOpen == true) {
								System.out.println("�̹� ��� ���� �����Դϴ�.");
							} else {
								pb3[createAccount].accountOpen();
							}
						} else if (userInput.equals("q")) {
							System.out.println("���α׷��� �����մϴ�.");
							break;
						} else {
							System.out.println("�ùٸ� ���� �Է����ּ���.");
						}
					}
				}
			} else{
				System.out.println("�ùٸ� ���� �Է����ּ���.");
			}
		}

	}
}