import java.util.Scanner;

public class ExecClass06_UpgradedPiggyBank {

	int account = 0;
	String name = "돼지";
	int breakcount = 0;
	public void inputMoney() {
		System.out.println(this.name +" 계좌에 입금하실 금액을 입력해주세요.");
		
		Scanner scanner = new Scanner(System.in);
		String inputData = scanner.nextLine();
		
		int inputMoney = Integer.parseInt(inputData);
		this.account = this.account + inputMoney;
		
		System.out.println("땡그랑");
		System.out.println();
		System.out.println("현재 보유하신 금액은 총 " + this.account + " 원 입니다.");
		System.out.println("처음 화면으로 돌아갑니다.");
		scanner.close();
	}
	
	public void withDraw() {
		System.out.println(this.name + "계좌에 보유하신 전액을 인출합니다.");
		System.out.println("총" + this.account + "원을 인출합니다.");
		this.account = this.account - this.account;
		this.breakcount = this.breakcount+1;
		System.out.println("처음 화면으로 돌아갑니다.");
	}
	
	public void exe() {
		ExecClass06_UpgradedPiggyBank upb = new ExecClass06_UpgradedPiggyBank();
		for(int i = 0; i < 999999; i++) {
			System.out.println();
			System.out.println(this.name + "저금통입니다.");
			System.out.println("입금은 1번, 출금은 2번, 종료는 q를 눌러주세요.");
//			System.out.println("계좌 이름 설정: 0번");
			Scanner scanner = new Scanner(System.in);
			String inputData = scanner.nextLine();
			
			if(inputData.equals("q")) {
			System.out.println("저금통 프로그램을 종료합니다.");
			break;
			}
			else if(inputData.equals("1")) {
			upb.inputMoney();
			}
			else if(inputData.equals("2")) {
				upb.withDraw();
			}
//			else if(inputData.equals("0")) {
//				System.out.println("계좌 이름을 입력해주세요.");
//				upb.accountName(name);
//			}
			else {
				System.out.println("올바른 정보를 입력해주세요.");
				continue;
			}
		}
	}
//	public void accountName(String name) {
//		Scanner scanner02 = new Scanner(System.in);
//		String accountName = scanner02.nextLine();
//		this.name = accountName;
//	}
}