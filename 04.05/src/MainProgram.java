import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainProgram {
	String nameData = "";
	boolean maleCount = false;
	boolean femaleCount = false;
	boolean userInput = false;

	public void userInput() {
		this.userInput = true;
	}

	public void nameInput() {
		System.out.println("�̸��� �Է����ּ���.");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		this.nameData = name;
	}

	public void genderInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ο��� ������ �Է����ּ���.");
		System.out.println("1:����|2:����");
		String userGender = scanner.nextLine();
		if (userGender.equals("1")) {
			this.maleCount = true;
			System.out.println("�ش� �ο��� ������ �����Դϴ�.");
		} else if (userGender.equals("2")) {
			this.femaleCount = true;
			System.out.println("�ش� �ο��� ������ �����Դϴ�.");
		} else {
			System.out.println("�ùٸ� ���� �Է����ּ���.");
		}
	}
}