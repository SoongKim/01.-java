import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainC {

	public static void main(String[] args) {
		System.out.println("���� �ο� ���� �Է����ּ���.");
		Scanner scanner = new Scanner(System.in);
		int userNum = Integer.parseInt(scanner.nextLine());
		System.out.println(userNum + "���� �����մϴ�.");
		FunC[] func = new FunC[userNum];
		ArrayList regionId = new ArrayList();
		for (int i = 0; i < userNum; i++) {
			func[i] = new FunC();
		}
		for (int j = 0; j < 999999; j++) {
			System.out.println("�η� ���� ���α׷��Դϴ�.");
			System.out.println("���Ͻô� �޴��� �������ּ���.");
			System.out.println("[1] ���� �Է�");
			System.out.println("[2] ��ü ���� Ȯ��");
			System.out.println("[3] ���� ���� �α� �� Ȯ��");
			System.out.println("[4] ���� �α� �� Ȯ��");
			String userSelect = scanner.nextLine();
			if (userSelect.equals("1")) {
				System.out.println("�� �� �ε����� ������ �Է��ұ��?");
				System.out.println("0 ~ " + (userNum - 1) + "�� ���� ����");
				int selInx = Integer.parseInt(scanner.nextLine());
				if (selInx >= userNum || selInx < 0) {
					System.out.println("�ùٸ� �ε��� ���� �������ּ���.");
				} else if (selInx >= 0 && selInx < userNum) {
					if (func[selInx].userInfo == true) {
						System.out.println("�̹� ���� �Է��� �Ϸ�� �ε����Դϴ�.");
						System.out.println("���� ȭ������ ���ư��ϴ�.");
						System.out.println();
					} else {
						func[selInx].nameInput();
						func[selInx].residenceInput();
						regionId.add(func[selInx].residence);
						func[selInx].genderInput();
						func[selInx].InfoInput();
					}
				} else {
					System.out.println("�ùٸ� ���� �Է����ּ���.");
				}
			} else if (userSelect.equals("2")) {
				System.out.println("��ü ������ ����մϴ�.");
				for (int m = 0; m < userNum; m++) {
					System.out.println(
							"�̸� : " + func[m].userName + " �������� : " + func[m].residence + " ���� : " + func[m].gender);
				}
			} else if (userSelect.equals("3")) {

			}
//			else if(userSelect.equals("4")) {
//				System.out.println("������ �α����� Ȯ���մϴ�.");
//				for(int e = 0; e < userNum; e++) {
//					regionId = func[e].residence;
//					for(ine z = 0; z < userNum; z++) {
//						if(regionId.get(z) == func[z].residence) {
//							regionId.frequency(func[z].residence);
//						}
//					}
//				}
//			}
			else {
				System.out.println("�ùٸ� �޴��� �������ּ���.");
			}

		}

	}
}
