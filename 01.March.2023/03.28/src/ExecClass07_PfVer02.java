import java.util.Scanner;

public class ExecClass07_PfVer02 {

	public static void main(String[] args) {
		ExeeClass07_PfVer01 s1 = new ExeeClass07_PfVer01();
		ExeeClass07_PfVer01 s2 = new ExeeClass07_PfVer01();
		ExeeClass07_PfVer01 s3 = new ExeeClass07_PfVer01();
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < 999999; i++) {
			System.out.println("���Ͻô� �޴��� �������ּ���.");
			System.out.println("1. 1�� ������ �Ա�");
			System.out.println("2. 2�� ������ �Ա�");
			System.out.println("3. 3�� ������ �Ա�");
			System.out.println("4. 1�� ������ ���");
			System.out.println("5. 2�� ������ ���");
			System.out.println("6. 3�� ������ ���");
			System.out.println("7. 1�� ������ �̸� ����");
			System.out.println("8. 2�� ������ �̸� ����");
			System.out.println("9. 3�� ������ �̸� ����");
			
		String inputMenu = scanner.nextLine();	
			if(inputMenu.equals("q")) {
				break;
			}
			else if(inputMenu.equals("1")) {
				s1.inputMoney();
			}
			else if(inputMenu.equals("2")) {
				s2.inputMoney();
			}
			else if(inputMenu.equals("3")) {
				s3.inputMoney();
			}
			else if(inputMenu.equals("4")) {
				s1.withDraw();
			}
			else if(inputMenu.equals("5")) {
				s2.withDraw();
			}
			else if(inputMenu.equals("6")) {
				s3.withDraw();
			}
			else if(inputMenu.equals("7")) {
				Scanner nameSc = new Scanner(System.in);
				System.out.println("�� ���¸��� �Է����ּ���.");
				String nameTag = nameSc.nextLine();
				s1.setName(nameTag);
			}
			else if(inputMenu.equals("8")) {
				Scanner nameSc = new Scanner(System.in);
				System.out.println("�� ���¸��� �Է����ּ���.");
				String nameTag = nameSc.nextLine();
				s2.setName(nameTag);
			}
			else if(inputMenu.equals("9")) {
				Scanner nameSc = new Scanner(System.in);
				System.out.println("�� ���¸��� �Է����ּ���.");
				String nameTag = nameSc.nextLine();
				s3.setName(nameTag);
			}
			else {
				System.out.println("�Է��� �߸��Ǿ����ϴ�.");
			}
		}
	}
}