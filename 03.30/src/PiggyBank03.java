import java.util.Scanner;

public class PiggyBank03 {

	int account = 0;
	String accountName = "돼지";
	boolean accountOpen = false;
	int accountNumber = 0;

	public void accountOpen() {
		PiggyBank01 pb1 = new PiggyBank01();
		if(this.accountOpen == true) {
			System.out.println("이미 존재하는 계좌입니다.");
		}
		this.accountOpen = true;
		System.out.println("계좌를 생성하였습니다.");
		}
	
	public void Insert() {
		Scanner scanner = new Scanner(System.in);
		if(this.accountOpen == true) {
			System.out.println(this.accountName + " 계좌에 입금합니다.");
			System.out.println("입금액을 입력해주세요.");
			int inputMoney = Integer.parseInt(scanner.nextLine());
			this.account = this.account + inputMoney;
			System.out.println("총 " + inputMoney + "원 입금하셨습니다.");
			System.out.println("현재 " + this.accountName + " 계좌 잔고는 " + this.account + "원 입니다.");
		} else if (this.accountOpen == false) {
			System.out.println("출금이 이뤄졌거나, 미생성한 계좌에는 입금하실 수 없습니다.");
			System.out.println("메인 화면으로 돌아갑니다.");
		}
	}

	public void Withdraw() {
		Scanner scanner = new Scanner(System.in);

		System.out.println(this.accountName + " 계좌의 현 잔액은 " + this.account + "원입니다.");
		System.out.println(this.accountName + " 계좌에서 전액 출금할까요?");
		System.out.println("(출금하신 계좌는 향후 이용이 제한됩니다.");
		System.out.println("y : 네 n : 아니오");
		String yOrN = scanner.nextLine();
		if (yOrN.equals("y")) {
			if (this.account == 0) {
				System.out.println("잔액이 0원인 계좌에서는 출금이 불가합니다.");
				System.out.println("입금 후 출금해주시기 바랍니다.");
				System.out.println("메인 화면으로 돌아갑니다.");
			} else {
				int withrawMoney = this.account;
				System.out.println("총" + withrawMoney + "원을 인출하였습니다.");
				this.account = 0;
				this.accountOpen = false;
			}
		} else if (yOrN.equals("n")) {
			System.out.println("메인 화면으로 돌아갑니다.");
		} else {
			System.out.println("올바른 값을 입력해주세요.");
			System.out.println("메인 화면으로 돌아갑니다.");
		}
	}

	public void nameTag() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("새로 설정할 계좌명을 입력해주세요.");
		String name = scanner.nextLine();
		this.accountName = name;
		System.out.println("새로 설정된 계좌명은 " + this.accountName + " 입니다.");
		System.out.println("메인 화면으로 돌아갑니다.");
	}

	public void checkAccount() {
		System.out.println(this.accountNumber + " 번 " + this.accountName + " 계좌의 잔액은 총 " + this.account + "원 입니다.");
		System.out.println("메인 화면으로 돌아갑니다.");
	}
	public void errorMessage() {
		System.out.println("올바른 정보를 입력해주세요.");
		System.out.println("메인 화면으로 돌아갑니다.");
	}
}