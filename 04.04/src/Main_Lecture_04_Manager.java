import java.util.Scanner;

public class Main_Lecture_04_Manager {
	SaveBox saveBox[] = new SaveBox[100];
	int saveBoxCount = 0;

	public boolean showMenu() {
	// boolean Ÿ������ ���α׷����� �ϸ� ���� Ŭ������ �� ���������.
	// �� �� �ִٸ� �ɼ��������� ����غ���.
	// �ݺ������� �������� ���� Ŭ������ �����Ͽ��⿡
	// ���� �ִ� �������� ���� this.�� �ٿ� ����������.
	// �̹� ���̽��� ��ġ�� �������� ������� �ʾ� ����������,
	// ���Ŀ��� ������ ������ ������ �߻��� �� �ִ�.

		// �����κ����� ����
		// 1. nextInt�� �� �ñ�� ������. nextLine�� �������� �������.
		// nextInt�� nextLine ���� ��� ����ϸ� �������� �߻��ϰ� �Ѵ�.
		// ���� nextLine �� Integer.parseInt�� ����ϸ� �ս��� ���� ��ȯ�� �����ϴ�.

		for (int i = 0; i < 999999; i++) {
			// ������ ���� ��� ��ȸ(���)
			System.out.println();
			System.out.println();
			System.out.println("------------------------���� ������ ���------------------------");
			for (int j = 0; j < saveBoxCount; j++) {
//				saveBox[j].info();
				System.out.println(saveBox[j].toString());
				// ��ü ������ toString.
				// return ��Ű�� ���� ����(���ڿ�)�� ������ �̸� ����ִ� �޼ҵ�.
				// ����� toString�� Object���� �����ϴ� �⺻ Method.
			}
			System.out.println();
			System.out.println("-------------------���Ͻô� �޴��� �������ּ���.-------------------");
			System.out.println("1 : ������ ����");
			System.out.println("2 : ������ �׼�(�Ա�/���)");
			System.out.println("q : ������ ����");

			Scanner scanner = new Scanner(System.in);
			String menuSelect = scanner.nextLine();
			if (menuSelect.equals("q")) {
				System.out.println("�����մϴ�.");
				return false;
				// �ݺ����� break = �޼��忡���� return
			} else if (menuSelect.equals("1")) {
				// ������ ����
				if (this.saveBoxCount < saveBox.length) {
					this.saveBox[saveBoxCount] = new SaveBox();
					this.saveBoxCount++;
					// �� ��� ���� �� saveBoxCount�� 1�� �����ش�.
				} else {
					System.out.println("������ ���� ������ �ʰ��Ͽ����ϴ�. �ִ� ���� ���� ������ " + saveBox.length + "�� �Դϴ�.");
				}
			} else if (menuSelect.equals("2")) {
				// ������ �׼� ( �Ա�, ���)
				System.out.println("����" + saveBoxCount + "���� �������� �ֽ��ϴ�. 0���� " + (saveBoxCount - 1) + "������ ���ڸ� �Է�");
				System.out.println("�׼��� ���ϴ� �������� ����(INDEX)�� �Է����ּ���.");
				String saveBoxSelect = scanner.nextLine();
				int selectNumber = Integer.parseInt(saveBoxSelect);
				if (selectNumber < 0 || selectNumber >= this.saveBoxCount) {
					System.out.println("�Էµ� ���� �߸��Ǿ����ϴ�.");
					continue;
				}
				this.saveBox[selectNumber].doAction();
			} else {
				System.out.println("�ùٸ� ������ �Է����ּ���.");
			}
		}
		return true;
		// ������ �������� ��� ��.
		// 1. info�� ���� �޴��� �����Ͽ� ��� ������ ���¸� ������ָ� ���� ����� ��������.
		// 2. return�� ����
		// 3. ������ class �������� ���� �ٸ� method�� this. �� ���� �ҷ����� ���� �����ϴ�.
		// 4. continue, break, return�� ���� �ɼ��� ����� �� �ֵ��� ��������.
	}
}