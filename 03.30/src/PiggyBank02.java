import java.util.Scanner;

public class PiggyBank02 {

	public void main() {
		// TODO Auto-generated method stub
		PiggyBank01 pb1 = new PiggyBank01();
		PiggyBank03 pb3 = new PiggyBank03();
		
		System.out.println("작업을 시작합니다.");
		for (int i = 0; i < 999999; i++) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println();
			System.out.println("[1] 입금 : [2] 출금 : [3] 잔액확인");
			System.out.println("[0] 계좌명변경 : [9] 계좌 변경");
			System.out.println("[q] 종료");
			System.out.println("");
			String userInput = scanner.nextLine();
			if (userInput.equals("1")) {
				pb3.Insert();
			} else if (userInput.equals("2")) {
				pb3.Withdraw();
			} else if (userInput.equals("3")) {
				pb3.checkAccount();
			} else if (userInput.equals("0")) {
				pb3.nameTag();
			} else if(userInput.equals("9")) {
				pb1.main(null);
			}
			else if (userInput.equals("q")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("올바른 값을 입력해주세요.");
			}
			System.out.println();
		}
	}
}