import java.util.Scanner;

public class PiggyBank03 {

	int account = 0;
	String accountName = "����";
	boolean accountOpen = false;
	int accountNumber = 0;

	public void accountOpen() {
		PiggyBank01 pb1 = new PiggyBank01();
		if(this.accountOpen == true) {
			System.out.println("�̹� �����ϴ� �����Դϴ�.");
		}
		this.accountOpen = true;
		System.out.println("���¸� �����Ͽ����ϴ�.");
		}
	
	public void Insert() {
		Scanner scanner = new Scanner(System.in);
		if(this.accountOpen == true) {
			System.out.println(this.accountName + " ���¿� �Ա��մϴ�.");
			System.out.println("�Աݾ��� �Է����ּ���.");
			int inputMoney = Integer.parseInt(scanner.nextLine());
			this.account = this.account + inputMoney;
			System.out.println("�� " + inputMoney + "�� �Ա��ϼ̽��ϴ�.");
			System.out.println("���� " + this.accountName + " ���� �ܰ�� " + this.account + "�� �Դϴ�.");
		} else if (this.accountOpen == false) {
			System.out.println("����� �̷����ų�, �̻����� ���¿��� �Ա��Ͻ� �� �����ϴ�.");
			System.out.println("���� ȭ������ ���ư��ϴ�.");
		}
	}

	public void Withdraw() {
		Scanner scanner = new Scanner(System.in);

		System.out.println(this.accountName + " ������ �� �ܾ��� " + this.account + "���Դϴ�.");
		System.out.println(this.accountName + " ���¿��� ���� ����ұ��?");
		System.out.println("(����Ͻ� ���´� ���� �̿��� ���ѵ˴ϴ�.");
		System.out.println("y : �� n : �ƴϿ�");
		String yOrN = scanner.nextLine();
		if (yOrN.equals("y")) {
			if (this.account == 0) {
				System.out.println("�ܾ��� 0���� ���¿����� ����� �Ұ��մϴ�.");
				System.out.println("�Ա� �� ������ֽñ� �ٶ��ϴ�.");
				System.out.println("���� ȭ������ ���ư��ϴ�.");
			} else {
				int withrawMoney = this.account;
				System.out.println("��" + withrawMoney + "���� �����Ͽ����ϴ�.");
				this.account = 0;
				this.accountOpen = false;
			}
		} else if (yOrN.equals("n")) {
			System.out.println("���� ȭ������ ���ư��ϴ�.");
		} else {
			System.out.println("�ùٸ� ���� �Է����ּ���.");
			System.out.println("���� ȭ������ ���ư��ϴ�.");
		}
	}

	public void nameTag() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� ������ ���¸��� �Է����ּ���.");
		String name = scanner.nextLine();
		this.accountName = name;
		System.out.println("���� ������ ���¸��� " + this.accountName + " �Դϴ�.");
		System.out.println("���� ȭ������ ���ư��ϴ�.");
	}

	public void checkAccount() {
		System.out.println(this.accountNumber + " �� " + this.accountName + " ������ �ܾ��� �� " + this.account + "�� �Դϴ�.");
		System.out.println("���� ȭ������ ���ư��ϴ�.");
	}
	public void errorMessage() {
		System.out.println("�ùٸ� ������ �Է����ּ���.");
		System.out.println("���� ȭ������ ���ư��ϴ�.");
	}
}