import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainC {

	int userNum = 0;
	int regionCount = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainC manager = new MainC();
		List<String> regionId = new ArrayList<String>();

		Scanner scanner = new Scanner(System.in);
		System.out.println("[�η� ���� ���α׷��Դϴ�.]");
		System.out.println("���� �ο� ���� �Է����ּ���.");
		int userNumber = Integer.parseInt(scanner.nextLine());
		manager.userNum = manager.userNum + userNumber;

		MainProgram[] load = new MainProgram[manager.userNum];

		for (int c = 0; c < manager.userNum; c++) {
			load[c] = new MainProgram();
		}
		System.out.println("�� " + manager.userNum + "���� �����ϼ̽��ϴ�.");
		System.out.println("���� ��� ���� ���� �Է����ּ���.");
		manager.regionCount = Integer.parseInt(scanner.nextLine());
		for (int j = 0; j < manager.regionCount; j++) {
			System.out.println("�ε��� " + j + "�� ���� ���� �Է����ּ���.");
			regionId.add(scanner.nextLine());
		}
		for (int i = 0; i < 999999; i++) {
			System.out.println("[���� �޴�]");
			System.out.println("���Ͻô� ����� �������ּ���.");
			System.out.println("[1] ���� �Է�");
			System.out.println("[2] ������ �ο� �� Ȯ��");
			System.out.println("[3] ���� �ο� �� Ȯ��");
			System.out.println("[4] ���� ���� �߰�");
			String userInfo = scanner.nextLine();
			if (userInfo.equals("1")) {
				System.out.println("���� �Է��� �����ϼ̽��ϴ�.");
				System.out.println("�� �� �ε����� ������ �����ұ��?");
				System.out.println("�ִ� " + " 0~" + (manager.userNum - 1) + "��");
				int userIndex = Integer.parseInt(scanner.nextLine());
				if (load[userIndex].userInput == false) {
					load[userIndex].nameInput();
					System.out.println("���� ������ �Է��մϴ�. �ε��� ��ȣ�� �Է����ּ���.");
					for (int rg = 0; rg < regionId.size(); rg++) {
						System.out.println(rg + "��:" + regionId.get(rg));
					}
					int rgIndex = Integer.parseInt(scanner.nextLine());
					System.out.println(rgIndex + "�� " + regionId.get(rgIndex) + "������ �����ϼ̽��ϴ�.");
					
					load[userIndex].genderInput();
					load[userIndex].userInput();

				} else if (load[userIndex].userInput) {
					System.out.println("�̹� ��� ���� ��ȣ�Դϴ�.");
				}
			} else if (userInfo.equals("2")) {
				System.out.println("������ �ο� �� Ȯ���� �����ϼ̽��ϴ�.");
				System.out.println(regionId);
			} else if (userInfo.equals("3")) {
				System.out.println("���� �ο� �� Ȯ���� �����ϼ̽��ϴ�.");
				int maleC = 0, femaleC = 0;
				for (int gen = 0; gen < manager.userNum; gen++) {
					if (load[gen].maleCount) {
						maleC = maleC + 1;
					} else if (load[gen].femaleCount) {
						femaleC = femaleC + 1;
					}
				}
				System.out.println("������ �� " + maleC + "��");
				System.out.println("������ �� " + femaleC + "��");
			} else if (userInfo.equals("4")) {
				System.out.println("���� ������ �߰��մϴ�.");
				System.out.println("�� ���� �߰��ұ��?");
				int addRegion = Integer.parseInt(scanner.nextLine());
				manager.regionCount = manager.regionCount + addRegion;
				System.out.println(addRegion + "���� �߰��Ͽ� ��" + manager.regionCount + "�� ������ �����մϴ�.");
				System.out.println("�߰� ����ŭ �ű� �������� �Է����ּ���.");
				for (int e = manager.regionCount - addRegion; e < manager.regionCount; e++) {
					regionId.add(scanner.nextLine());
				}
				System.out.println("�� ���� ������ ������ �����ϴ�.");
				System.out.println(regionId);
			} else {
				System.out.println("�߸��� ������ �Է��ϼ̽��ϴ�.");
			}
			System.out.println();
		}
	}
}