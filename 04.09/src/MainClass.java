import java.util.Scanner;

public class MainClass {
// 6�� ������ ������� �̸�, ��������, ������ Ȯ���� �� �ִ� ���α׷�.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� �ο� ���� �Է����ּ���.");
		int userNum = Integer.parseInt(scanner.nextLine());
		System.out.println(userNum+" ���� �����ϼ̽��ϴ�.");
		Func []func = new Func[userNum];
		for(int i = 0; i < userNum; i++) {
			func[i] = new Func();
		}
		
		for(int i = 0; i < 999999; i++) {
			System.out.println("�η� ���� ���α׷��Դϴ�.");
			System.out.println("���Ͻô� �޴��� �������ּ���.");
			System.out.println("[1] �ο� ���� �Է�");
			System.out.println("[2] ������ �α� �� ���");
			System.out.println("[3] ���� �α� �� ���");
			System.out.println("[4] ��ü ���");
			
			String menuSel = scanner.nextLine();
			if(menuSel.equals("1")) {
				System.out.println("�� �� �ε����� ������ �Է��ұ��?");
				System.out.println("0 ~ "+(userNum-1) +"�� ���� ����");
				int selInx = Integer.parseInt(scanner.nextLine());
				if(selInx >= userNum || selInx < 0) {
					System.out.println("�ùٸ� �ε��� ���� �������ּ���.");
				}
				else if(selInx >=0 && selInx < userNum) {
					if(func[selInx].userInfo == true) {
						System.out.println("�̹� ���� �Է��� �Ϸ�� �ε����Դϴ�.");
						System.out.println("���� ȭ������ ���ư��ϴ�.");
						System.out.println();
					}
					else {
					func[selInx].nameInput();
					func[selInx].residenceInput();
					func[selInx].genderInput();
					func[selInx].InfoInput();
					}
				}
				else {
					System.out.println("�ùٸ� ���� �Է����ּ���.");
				}
			}
			else if(menuSel.equals("2")) {
				System.out.println("������ �α� ���� ����մϴ�.");
				int seoul = 0, busan = 0, gangwon = 0, choong = 0, jeon = 0, gyeong = 0;
				for(int k = 0; k < userNum; k++) {
					if(func[k].seCount == 1) {
						seoul = seoul+1;
					}
					else if(func[k].buCount == 1) {
						busan = busan+1;
					}
					else if(func[k].gaCount == 1) {
						gangwon = gangwon+1;
					}
					else if(func[k].chCount == 1) {
						choong = choong+1;
					}
					else if(func[k].jeCount == 1) {
						jeon = jeon+1;
					}
					else if(func[k].gyCount == 1) {
						gyeong = gyeong+1;
					}
				}
				System.out.println("���� : " + seoul);
				System.out.println("�λ� : " + busan);
				System.out.println("���� : " + gangwon);
				System.out.println("��û : " + choong);
				System.out.println("���� : " + jeon);
				System.out.println("��� : " + gyeong);
			}
			else if(menuSel.equals("3")) {
				System.out.println("���� �α� ���� ����մϴ�.");
				int maleCount = 0, femaleCount = 0;
				for(int e = 0; e < userNum; e++) {
					if(func[e].maleCount == 1) {
						maleCount = maleCount+1;
					}
					else if(func[e].femaleCount == 1) {
						femaleCount = femaleCount+1;
					}
				}
				System.out.println("���� : " + maleCount + "��");
				System.out.println("���� : " + femaleCount + "��");
			}
			else if(menuSel.equals("4")) {
				for(int j = 0; j < userNum; j++) {
					System.out.println("�̸� : " + func[j].userName + " �������� : " + func[j].residence + " ���� : " + func[j].gender);
				}
			}
			else {
				System.out.println("�ùٸ� ������ �Է����ּ���.");
			}
		}	
	}
}