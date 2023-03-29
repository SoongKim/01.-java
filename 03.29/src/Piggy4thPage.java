import java.util.Scanner;

public class Piggy4thPage {

	int account = 0;
	String accountName = "돼지";
	boolean breakcount = true;
	// 전역 변수 설정
	
	public void Insert() {
	// Piggy4thPage 클래스의 Insert 메소드 호출 시 적용.
	// 대상 계좌에 입력받은 입금액 만큼을 삽입. 출력이 이뤄진 계좌에는 입금을 제한하는 기능을 수행.
		Scanner scanner = new Scanner(System.in);
		if (this.breakcount == false) {
			System.out.println("한 번 출금하신 저금통은 재생성 시까지 입금이 불가합니다.");
			System.out.println("다른 저금통을 이용하시거나 현 저금통을 재생성해주세요.");
		} else {
			System.out.println(this.accountName + " 계좌에 입금합니다.");
			System.out.println("입금액을 입력해주세요.");
			int inputMoney = Integer.parseInt(scanner.nextLine());
			this.account = this.account + inputMoney;
			System.out.println("총 " + inputMoney + "원 입금하셨습니다.");
			System.out.println("현재 잔고: " + this.account + "원");
		}
	}

	public void Withdraw() {
	// Piggy4thPage 클래스에서 Withdraw 메소드 호출 시 적용.
	// 출금 계좌를 확인과 경고 문구 출력. 계좌에 존재하는 잔고 전액을 출금하는 기능을 수행.
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
			} else {
				int withrawMoney = this.account;
				System.out.println("총" + withrawMoney + "원을 인출하였습니다.");
				this.account = 0;
				this.breakcount = false;
			}
		} else if (yOrN.equals("n")) {
			System.out.println("메인 화면으로 돌아갑니다.");
		} else {
			System.out.println("올바른 값을 입력해주세요.");
			System.out.println("메인 화면으로 돌아갑니다.");
		}
	}

	public void nameTag() {
	// Piggy4thPage 클래스에서 nameTag 메소드 호출 시 적용.
	// 계좌 이름을 변경하는 기능을 수행한다.
		Scanner scanner = new Scanner(System.in);
		System.out.println("새로 설정할 계좌명을 입력해주세요.");
		String name = scanner.nextLine();
		this.accountName = name;
		System.out.println("새로 설정된 계좌명은 " + this.accountName + " 입니다.");
	}

	public void checkAccount() {
	// Piggy4thPage 클래스에서 checkAccount 메소드 호출 시 적용.
	// 현 계좌의 잔고 총액을 표시하는 기능을 수행한다.
		System.out.println(this.accountName + " 계좌 잔액은 총 " + this.account + "원 입니다.");
		System.out.println("메인 화면으로 돌아갑니다.");
	}
}