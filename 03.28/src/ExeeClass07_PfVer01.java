import java.util.Scanner;

public class ExeeClass07_PfVer01 {

	int account = 0;
	String name = "����";
	boolean breakcount = false;
	
	public void inputMoney() {
		if(this.breakcount) {
			System.out.println("�� �������� ���̻� ����� �� �����ϴ�.");
			return;
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println(this.name +" ���¿� �Ա��Ͻ� �ݾ��� �Է����ּ���.");
		String inputData = scanner.nextLine();
		int inputMoney = Integer.parseInt(inputData);
		this.account = this.account + inputMoney;
		
		System.out.println("���׶�");
		System.out.println("���� �����Ͻ� �ݾ��� �� " + this.account + " �� �Դϴ�.");
		System.out.println("ó�� ȭ������ ���ư��ϴ�.");
	}
	
	public void withDraw() {
		System.out.println(this.name + "���¿� �����Ͻ� ������ �����մϴ�.");
		System.out.println("��" + this.account + "���� �����մϴ�.");
		this.account = this.account - this.account;
		this.breakcount = true;
		System.out.println("ó�� ȭ������ ���ư��ϴ�.");
	}

	public void setName(String name) {
		this.name = name;
	}
}