import java.util.Scanner;

public class Main_Lecture_06_Main {

	public static void main(String[] args) {
		Main_Lecture_06_Student[] student = new Main_Lecture_06_Student[30];

		for (int i = 0; i < 30; i++) {
			student[i] = new Main_Lecture_06_Student();
		}

		for (int j = 0; j < 999999; j++) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("���� �Է� ���α׷��Դϴ�.");
			System.out.println("1: ������ �Է� �Է�");
			System.out.println("2: ����, ��� Ȯ��");
			System.out.println("3: �Է� ���� ����");
			System.out.println("4: �Է� ���� Ȯ��");
			System.out.println("q: ����");
			String userInput = scanner.nextLine();
			if (userInput.equals("1")) {
				System.out.println("�� ��° �л����� �Է����ּ���.");
				System.out.println("[�л� �ε��� ����: 0 - 30]");
				int studentNum = Integer.parseInt(scanner.nextLine());

				student[studentNum].studentName();
				student[studentNum].studentKor();
				student[studentNum].studentEng();
				student[studentNum].studentMath();
				System.out.println(studentNum + "�� �ε�����" + student[studentNum].name + "�л��� �����Ͱ� �ԷµǾ����ϴ�.");
			}
			else if (userInput.equals("2")) {
				System.out.println("�� ��° �л��� ��ȸ�Ͻðڽ��ϱ�?");
				Scanner scanner02 = new Scanner(System.in);
				int studentNums = Integer.parseInt(scanner02.nextLine());
				student[studentNums].studentSum();
				student[studentNums].studentAvg();
				System.out.println(studentNums + "�� �л��� ������ " + student[studentNums].sum + "���̸�, ����� "
						+ student[studentNums].avg + "�� �Դϴ�.");
			} 
			else if(userInput.equals("3")) {
				System.out.println("������ �����մϴ�.");
				System.out.println("�� �� �л��� ������ �����ұ��?");
				int whoNum = Integer.parseInt(scanner.nextLine());
				student[whoNum].changeValue();
			}
			else if(userInput.equals("4")) {
				System.out.println("�Էµ� ������ Ȯ���մϴ�.");
				System.out.println("�� �� �ε��� �л��� ������ Ȯ���ұ��?");
				int whichNum = Integer.parseInt(scanner.nextLine());
				student[whichNum].info();
			}
			else if (userInput.equals("q")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else {
				System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�.");
				System.out.println("���� ȭ������ ���ư��ϴ�.");
			}
			System.out.println();
		}
	}
}