import java.util.Scanner;

public class ExecClass05_SaveBox {
	int coin = 0;
	//���� ����?
	//Property
	String name = "����";
	
	
	public void deposit() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(this.name +"�� �Ա��Ͻ� �ݾ��� �Է����ּ���.");
		String inputString = scanner.nextLine();
		int inputCoin = Integer.parseInt(inputString);
		
		this.coin = this.coin + inputCoin;
		// this means self.
		// �� ��ü�� ������ �ִ� property/method�� ������ �� ���
		// Property ����� ������ this�� �ݵ�� �ٿ�����.
		// ��!��!��!
	}
	// method
	
	public void withdraw() {
		System.out.println(this.name + " �������� �����ϴ�.");
		System.out.println("���� ��ݾ��� " + coin + "�Դϴ�.");
	}
	
	public void setName(String name) {
		this.name = name;
		// ��� ������ ��Ȯ�ϰ� �ϱ� ����
		// ���� �ٸ� �������� �Ȱ��� ���̹��� �����Ѵ�!
		// ��!��!��! ���� ����������.
	}
}
