import java.util.Scanner;

public class ExecClass07_PfVer02 {

	public static void main(String[] args) {
		ExeeClass07_PfVer01 s1 = new ExeeClass07_PfVer01();
		ExeeClass07_PfVer01 s2 = new ExeeClass07_PfVer01();
		ExeeClass07_PfVer01 s3 = new ExeeClass07_PfVer01();
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < 999999; i++) {
			System.out.println("원하시는 메뉴를 선택해주세요.");
			System.out.println("1. 1번 저금통 입금");
			System.out.println("2. 2번 저금통 입금");
			System.out.println("3. 3번 저금통 입금");
			System.out.println("4. 1번 저금통 출금");
			System.out.println("5. 2번 저금통 출금");
			System.out.println("6. 3번 저금통 출금");
			System.out.println("7. 1번 저금통 이름 변경");
			System.out.println("8. 2번 저금통 이름 변경");
			System.out.println("9. 3번 저금통 이름 변경");
			
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
				System.out.println("새 계좌명을 입력해주세요.");
				String nameTag = nameSc.nextLine();
				s1.setName(nameTag);
			}
			else if(inputMenu.equals("8")) {
				Scanner nameSc = new Scanner(System.in);
				System.out.println("새 계좌명을 입력해주세요.");
				String nameTag = nameSc.nextLine();
				s2.setName(nameTag);
			}
			else if(inputMenu.equals("9")) {
				Scanner nameSc = new Scanner(System.in);
				System.out.println("새 계좌명을 입력해주세요.");
				String nameTag = nameSc.nextLine();
				s3.setName(nameTag);
			}
			else {
				System.out.println("입력이 잘못되었습니다.");
			}
		}
	}
}