import java.util.Scanner;

public class FunC {
	String userName = "";
	String residence = "";
	String gender = "";
	int maleCount = 0;
	int femaleCount = 0;
	boolean userInfo = false;
	
	public void nameInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� �η��� �̸��� �Է����ּ���.");
		String nameInput = scanner.nextLine();
		this.userName = nameInput;
		System.out.println("�Է��Ͻ� �ο��� �̸��� " + this.userName + "�Դϴ�.");
	}
	
	public void residenceInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ش��ϴ� ������ �Է����ּ���.");
		System.out.println("[1]����|[2]�λ�|[3]������");
		System.out.println("[4]��û|[5]����|[6]���");
		String residenceInput = scanner.nextLine();
		System.out.println(residenceInput+"��/�� �½��ϱ�?");
		System.out.println("y: �� | n: �ƴϿ�");
		String userSelect = scanner.nextLine();
		if(userSelect.equals("y")) {
			this.residence = residenceInput;
			System.out.println("�ش� �ο��� ���� �������� "+this.residence+"��/�� �����ϼ̽��ϴ�.");
		}
		else if(userSelect.equals("n")) {
			System.out.println("�Է� ȭ������ ���ư��ϴ�.");
		}
		else {
			System.out.println("�ùٸ� ���� �Է����ּ���.");
		}
	}
	public void genderInput() {
		System.out.println("�ο��� ������ �Է����ּ���.");
		System.out.println("[1] ���� | [2] ����");
		Scanner scanner = new Scanner(System.in);
		String userGender = scanner.nextLine();
		if(userGender.equals("1")) {
			this.maleCount = this.maleCount+1;
			this.gender = "����";
			System.out.println("������ �����ϼ̽��ϴ�.");
		}
		else if(userGender.equals("2")) {
			this.femaleCount = this.femaleCount+1;
			this.gender = "����";
			System.out.println("������ �����ϼ̽��ϴ�.");
		}
	}
	public void InfoInput() {
		if(this.userInfo == false) {
			this.userInfo = true;
		}
	}
	
	
}
