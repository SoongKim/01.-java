import java.util.Scanner;

public class SaveBox {

	int coin = 0;
	boolean isBroken = false;
	String name = "����";

	// �Ա�
	public void deposit() {
		System.out.println("�Ա��Ͻ� �ݾ��� �Է����ּ���.");
		Scanner scanner = new Scanner(System.in);
		int inputCoin = Integer.parseInt(scanner.nextLine());
		this.coin = this.coin + inputCoin;
		System.out.println("���׶�");
		System.out.println("���� �ش� ���� �ܾ��� " + this.coin + "�� �Դϴ�.");
	}

	// ���
	public void withdraw() {
		System.out.println("������ �����Ͻðڽ��ϱ�?");
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.nextLine();
		if (userInput.equals("y") || userInput.equals("Y")) {
			System.out.println("" + this.coin + "���� ��ݵǾ����ϴ�.");
			this.isBroken = true;
		} else
			return;
	}

	public void doAction() {
		if (this.isBroken) {
			System.out.println("�� �������� ���̻� ����Ͻ� �� �����ϴ�.");
			return;
		}
		System.out.println("1. �Ա�, 2. ���, 3. ���� �̸� ����, 4. ���� ��ȸ �� �������ּ���.");
		Scanner scanner = new Scanner(System.in);
		String inputAction = scanner.nextLine();
		if (inputAction.equals("1")) {
			this.deposit();
		} else if (inputAction.equals("2")) {
			this.withdraw();
		} else if (inputAction.equals("3")) {
			this.setName();
		} else if (inputAction.equals("4")) {
			this.info();
		} else {
			System.out.println("�Է��� �߸��Ǿ����ϴ�. �ٽ� �Է����ּ���.");
			this.doAction();
		}
		// �� �������� �� �������ϱ� this�� �޼ҵ� ȣ���� �����ϱ���.
		// ���� �� �����.
	}

	public void setName() {
		System.out.println("������ �̸��� �Է����ּ���.");
		Scanner scanner = new Scanner(System.in);
		String inputName = scanner.nextLine();
		this.name = inputName;
	}

	public void info() {
		if(this.isBroken) {
			System.out.println(this.name + "���´� ���� ����Ͻ� �� �����ϴ�.");
		}
		else {
			System.out.println(this.name + "������ ���� �ܾ��� " + this.coin + "�� �Դϴ�.");
		}
	}
	public String toString() {
		String infoString = this.name + "������ ���� �ܾ��� " + this.coin + "�� �Դϴ�.";
		return infoString;
	}
}