import java.util.Arrays;
import java.util.Scanner;

import javax.management.openmbean.OpenMBeanAttributeInfoSupport;

public class MainClass {
	String localNames = "";
	int localNum = 0;

	public static void main(String[] args) {
		MainClass mains = new MainClass();

		System.out.println("���� �ο� ���� �Է����ּ���.");
		Scanner scanner = new Scanner(System.in);
		int userNum = Integer.parseInt(scanner.nextLine());
		MainProgram[] manager = new MainProgram[userNum];
		for (int i = 0; i < userNum; i++) {
			manager[i] = new MainProgram();
		}
		System.out.println("���� ���� ���� �Է����ּ���.");
		int localNum = Integer.parseInt(scanner.nextLine());
		int[] locals = new int[localNum];
		String[] localNames = new String[localNum];
		System.out.println("���� ������ �̸��� �Է����ּ���.");
		for (int m = 0; m < localNum; m++) {
			localNames[m] = scanner.nextLine();
		}

		for (int n = 0; n < 999999; n++) {
			System.out.println(mains.localNum);
			System.out.println("[�η� ���� ���α׷��Դϴ�.]");
			System.out.println("���Ͻô� �޴��� �Է����ּ���.");
			System.out.println("[1:�Է�]");
			System.out.println("[2:��ü ���]");
			System.out.println("[3:������ �α� �� ���]");
			System.out.println("[4:���� �α� �� ���]");
			System.out.println("[5:���� �ο� �� ����]");
			System.out.println("[6:���� ���� �� ����]");
			Scanner scanners = new Scanner(System.in);
			String userInput = scanners.nextLine();
			if (userInput.equals("1")) {
				System.out.println("�� �� �ε����� ������ �����Ͻðڽ��ϱ�?");
				int inputNum = Integer.parseInt(scanner.nextLine());
				manager[inputNum].nameInput();
				manager[inputNum].genderInput();
				System.out.println("�Է��� �Ϸ�Ǿ����ϴ�.");
				System.out.println("���� ȭ������ ���ư��ϴ�.");
			} else if (userInput.equals("2")) {

			} else if (userInput.equals("3")) {

			} else if (userInput.equals("4")) {

			} else if (userInput.equals("5")) {

			} else if (userInput.equals("6")) {
				
					
					System.out.println("���� ���� ������ " + localNum + "��");
					System.out.println("�� ���� ������ �߰��ұ��?");
					
					int regionChange = Integer.parseInt(scanner.nextLine());
					mains.localNum = mains.localNum + regionChange;
					System.out.println("�� ���� ���� ���� " + mains.localNum);

				
			} else {
				System.out.println("�ùٸ� ������ �Է����ּ���.");
			}
		}

	}

}