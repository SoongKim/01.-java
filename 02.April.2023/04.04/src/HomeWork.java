import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("�� ���� ������� ���� ���α׷��� �۵��ұ��?");
		int countNum = Integer.parseInt(s.nextLine());
		Function[] manager = new Function[countNum];
		for (int i = 0; i < countNum; i++) {
			manager[i] = new Function();
		}

		for (int i = 0; i < 999999; i++) {
			System.out.println("�η� ���� ���α׷��Դϴ�.");
			System.out.println("1:�Է�|2:��ü���|3:������ �α� �� ���| 4:���� �α� �� ���");
			Scanner scanner = new Scanner(System.in);
			String userInput = scanner.nextLine();
			if (userInput.equals("1")) {
				Scanner scan = new Scanner(System.in);
				System.out.println("�� �� �ε����� �Է� ���� �����ұ��?");
				int userIndex = Integer.parseInt(scan.nextLine());
				if (userIndex < countNum && userIndex >= 0) {
					System.out.println("�ε��� " + userIndex + "���� �����͸� �����մϴ�.");
					manager[userIndex].name();
					manager[userIndex].residence();
					manager[userIndex].gender();
					System.out.println(userIndex + "�� �ε����� �Է��� �Ϸ�Ǿ����ϴ�.");
				} else {
					System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�.");
					continue;
				}
			} else if (userInput.equals("2")) {
				int seoulCount = 0;
				int busanCount = 0;
				int gangwonCount = 0;
				int choongchungCount = 0;
				int jeonraCount = 0;
				int gyeongsangCount = 0;
				for (int l = 0; l < countNum; l++) {
					if (manager[l].seoul) {
						for (int sl = 0; sl < countNum; sl++) {
							seoulCount = seoulCount + manager[sl].residenceSeoul;
						}
					} else if (manager[l].busan) {
						for (int bl = 0; bl < countNum; bl++) {
							busanCount = busanCount + manager[bl].residenceBusan;
							;
						}
					} else if (manager[l].gangwon) {
						for (int gl = 0; gl < countNum; gl++) {
							gangwonCount = gangwonCount + +manager[gl].residenceGangwon;
						}
					} else if (manager[l].choongchung) {
						for (int cl = 0; cl < countNum; cl++) {
							choongchungCount = choongchungCount + manager[cl].residenceChoongchung;
						}
					} else if (manager[l].jeonra) {
						for (int jl = 0; jl < countNum; jl++) {
							jeonraCount = jeonraCount + manager[jl].residenceJeonra;
						}
					} else if (manager[l].gyeongsang) {
						for (int kl = 0; kl < countNum; kl++) {
							gyeongsangCount = gyeongsangCount + manager[kl].residenceGyeongsang;
						}
					}
				}
				int maleCount = 0, femaleCount = 0;
				for (int m = 0; m < countNum; m++) {
					if (manager[m].male) {
						for (int mc = 0; mc < countNum; mc++) {
							maleCount = maleCount + manager[mc].maleCount;
						}
					} else if (manager[m].female) {
						for (int wc = 0; wc < countNum; wc++) {
							femaleCount = femaleCount + manager[wc].femaleCount;
						}
					}
				}
				System.out.println("������ �� " + maleCount + "��");
				System.out.println("������ �� " + femaleCount + "��");
				System.out.println("������ �� ���� �ο���" + seoulCount + "��");
				System.out.println("�λ��� �� ���� �ο���" + busanCount + "��");
				System.out.println("�������� �� ���� �ο���" + gangwonCount + "��");
				System.out.println("��û���� �� ���� �ο���" + choongchungCount + "��");
				System.out.println("������ �� ���� �ο���" + jeonraCount + "��");
				System.out.println("����� �� ���� �ο���" + gyeongsangCount + "��");

			} else if (userInput.equals("3")) {
				int seoulCount = 0;
				int busanCount = 0;
				int gangwonCount = 0;
				int choongchungCount = 0;
				int jeonraCount = 0;
				int gyeongsangCount = 0;
				for (int l = 0; l < countNum; l++) {
					if (manager[l].seoul) {
						for (int sl = 0; sl < countNum; sl++) {
							seoulCount = seoulCount + manager[sl].residenceSeoul;
						}
					} else if (manager[l].busan) {
						for (int bl = 0; bl < countNum; bl++) {
							busanCount = busanCount + manager[bl].residenceBusan;
							;
						}
					} else if (manager[l].gangwon) {
						for (int gl = 0; gl < countNum; gl++) {
							gangwonCount = gangwonCount + +manager[gl].residenceGangwon;
						}
					} else if (manager[l].choongchung) {
						for (int cl = 0; cl < countNum; cl++) {
							choongchungCount = choongchungCount + manager[cl].residenceChoongchung;
						}
					} else if (manager[l].jeonra) {
						for (int jl = 0; jl < countNum; jl++) {
							jeonraCount = jeonraCount + manager[jl].residenceJeonra;
						}
					} else if (manager[l].gyeongsang) {
						for (int kl = 0; kl < countNum; kl++) {
							gyeongsangCount = gyeongsangCount + manager[kl].residenceGyeongsang;
						}
					}
				}
				System.out.println("������ �� ���� �ο���" + seoulCount + "��");
				System.out.println("�λ��� �� ���� �ο���" + busanCount + "��");
				System.out.println("�������� �� ���� �ο���" + gangwonCount + "��");
				System.out.println("��û���� �� ���� �ο���" + choongchungCount + "��");
				System.out.println("������ �� ���� �ο���" + jeonraCount + "��");
				System.out.println("����� �� ���� �ο���" + gyeongsangCount + "��");
			} else if (userInput.equals("4")) {
//				������
				int maleCount = 0, femaleCount = 0;
				for (int m = 0; m < countNum; m++) {
					if (manager[m].male) {
						for (int mc = 0; mc < countNum; mc++) {
							maleCount = maleCount + manager[mc].maleCount;
						}
					} else if (manager[m].female) {
						for (int wc = 0; wc < countNum; wc++) {
							femaleCount = femaleCount + manager[wc].femaleCount;
						}
					}
				}
				System.out.println("������ �� " + maleCount + "��");
				System.out.println("������ �� " + femaleCount + "��");
			} else {
				System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�.");
			}
			System.out.println();
		}
	}

}