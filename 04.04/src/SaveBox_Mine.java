import java.util.Scanner;

public class SaveBox_Mine {

	int account = 0;
	
	
	public void Insert() {
		System.out.println("�Ա��Ͻ� �ݾ��� �Է����ּ���.");
		Scanner scanner = new Scanner(System.in);
		int insertMoney = Integer.parseInt(scanner.nextLine());
		this.account = this.account + insertMoney;
		System.out.println("���� �ܰ�� " + this.account + "�� �Դϴ�.");
	}
	
	public void Withdraw() {
		System.out.println("���� ����Ͻðڽ��ϱ�?");
		Scanner scanner = new Scanner(System.in);
		String withDrawYn = scanner.nextLine();
		if(withDrawYn.equals("y")) {
			System.out.println("�� " + this.account + "���� ��ݵǾ����ϴ�.");
			this.account = this.account - this.account;
		}
	}
}