import java.util.Scanner;

public class ExecClass06_UpgradedPiggyBank {

	int account = 0;
	String name = "����";
	int breakcount = 0;
	public void inputMoney() {
		System.out.println(this.name +" ���¿� �Ա��Ͻ� �ݾ��� �Է����ּ���.");
		
		Scanner scanner = new Scanner(System.in);
		String inputData = scanner.nextLine();
		
		int inputMoney = Integer.parseInt(inputData);
		this.account = this.account + inputMoney;
		
		System.out.println("���׶�");
		System.out.println();
		System.out.println("���� �����Ͻ� �ݾ��� �� " + this.account + " �� �Դϴ�.");
		System.out.println("ó�� ȭ������ ���ư��ϴ�.");
		scanner.close();
	}
	
	public void withDraw() {
		System.out.println(this.name + "���¿� �����Ͻ� ������ �����մϴ�.");
		System.out.println("��" + this.account + "���� �����մϴ�.");
		this.account = this.account - this.account;
		this.breakcount = this.breakcount+1;
		System.out.println("ó�� ȭ������ ���ư��ϴ�.");
	}
	
	public void exe() {
		ExecClass06_UpgradedPiggyBank upb = new ExecClass06_UpgradedPiggyBank();
		for(int i = 0; i < 999999; i++) {
			System.out.println();
			System.out.println(this.name + "�������Դϴ�.");
			System.out.println("�Ա��� 1��, ����� 2��, ����� q�� �����ּ���.");
//			System.out.println("���� �̸� ����: 0��");
			Scanner scanner = new Scanner(System.in);
			String inputData = scanner.nextLine();
			
			if(inputData.equals("q")) {
			System.out.println("������ ���α׷��� �����մϴ�.");
			break;
			}
			else if(inputData.equals("1")) {
			upb.inputMoney();
			}
			else if(inputData.equals("2")) {
				upb.withDraw();
			}
//			else if(inputData.equals("0")) {
//				System.out.println("���� �̸��� �Է����ּ���.");
//				upb.accountName(name);
//			}
			else {
				System.out.println("�ùٸ� ������ �Է����ּ���.");
				continue;
			}
		}
	}
//	public void accountName(String name) {
//		Scanner scanner02 = new Scanner(System.in);
//		String accountName = scanner02.nextLine();
//		this.name = accountName;
//	}
}