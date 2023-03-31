import java.util.Scanner;

public class PiggyBank01 {
	int num = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PiggyBank03[] pb3 = new PiggyBank03[100];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 100; i++) {
			pb3[i] = new PiggyBank03();
		}
		for (int i = 0; i < 999999; i++) {
			System.out.println("저금통 프로그램을 기동합니다.");
			System.out.println("[1] 신규 계좌 생성");
			System.out.println("[2] 기존 계좌 접속");
			int oOt = Integer.parseInt(scanner.nextLine());
			if (oOt == 1) {
				System.out.println("몇 번 계좌를 개설하시겠습니까?");
				int accountNum = Integer.parseInt(scanner.nextLine());
				pb3[accountNum].accountNumber = accountNum;
				pb3[accountNum].accountOpen();
			} else if (oOt == 2) {
				System.out.println("몇 번 계좌로 접속하시겠습니까?");
				int loginAccount = Integer.parseInt(scanner.nextLine());
				if (pb3[loginAccount].accountOpen == false) {
					System.out.println("입력하신 번호에 해당하는 계좌가 존재하지 않습니다.");
				} else {
					for (int j = 0; j < 999999; j++) {
						System.out.println("[1] 입금 : [2] 출금 : [3] 잔액확인");
						System.out.println("[0] 계좌명변경 : [5] 계좌 생성 : [q] 종료");
						String userInput = scanner.nextLine();
						if (userInput.equals("1")) {
							System.out.println("몇 번 계좌에 입금하시겠습니까?");
							int insertAccount = Integer.parseInt(scanner.nextLine());
							pb3[insertAccount].Insert();
						} else if (userInput.equals("2")) {
							System.out.println("몇 번 계좌에서 출금하시겠습니까?");
							int withdrawAccount = Integer.parseInt(scanner.nextLine());
							pb3[withdrawAccount].Withdraw();
						} else if (userInput.equals("3")) {
							System.out.println("몇 번 계좌를 조회하시겠습니까?");
							int account = Integer.parseInt(scanner.nextLine());
							pb3[account].checkAccount();
						} else if (userInput.equals("0")) {
							System.out.println("몇 번 계좌의 이름을 변경하시겠습니까?");
							int changeName = Integer.parseInt(scanner.nextLine());
							pb3[changeName].nameTag();
						} else if (userInput.equals("5")) {
							System.out.println("몇 번 계좌를 생성하시겠습니까?");
							int createAccount = Integer.parseInt(scanner.nextLine());
							if (pb3[createAccount].accountOpen == true) {
								System.out.println("이미 사용 중인 계좌입니다.");
							} else {
								pb3[createAccount].accountOpen();
							}
						} else if (userInput.equals("q")) {
							System.out.println("프로그램을 종료합니다.");
							break;
						} else {
							System.out.println("올바른 값을 입력해주세요.");
						}
					}
				}
			} else{
				System.out.println("올바른 값을 입력해주세요.");
			}
		}

	}
}