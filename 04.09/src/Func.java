import java.util.Scanner;

public class Func {

	String userName = "";
	String residence = "";
	String gender = "";
	int seCount = 0;
	int buCount = 0;
	int gaCount = 0;
	int chCount = 0;
	int jeCount = 0;
	int gyCount = 0;
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
		System.out.println("�ο��� ���� ������ �Է����ּ���.");
		System.out.println("[1] ���� | [2] ��� | [3] ����");
		System.out.println("[4] ��û | [5] ���� | [6] ���");
		String userInfo = scanner.nextLine();
		if (userInfo.equals("1")) {
			this.seCount = this.seCount+1;
			this.residence = "����";
			System.out.println("������ �����ϼ̽��ϴ�.");
		} else if (userInfo.equals("2")) {
			this.buCount = this.buCount+1;
			this.residence = "�λ�";
			System.out.println("�λ��� �����ϼ̽��ϴ�.");
		} else if (userInfo.equals("3")) {
			this.gaCount = this.gaCount+1;
			this.residence = "����";
			System.out.println("�������� �����ϼ̽��ϴ�.");
		} else if (userInfo.equals("4")) {
			this.chCount = this.chCount+1;
			this.residence = "��û��";
			System.out.println("��û���� �����ϼ̽��ϴ�.");
		} else if (userInfo.equals("5")) {
			this.jeCount = this.jeCount+1;
			this.residence = "����";
			System.out.println("���󵵸� �����ϼ̽��ϴ�.");
		} else if (userInfo.equals("6")) {
			this.gyCount = this.gyCount+1;
			this.residence = "���";
			System.out.println("��󵵸� �����ϼ̽��ϴ�.");
		} else {
			System.out.println("�ùٸ� ���� ��ȣ�� �Է����ּ���.");
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