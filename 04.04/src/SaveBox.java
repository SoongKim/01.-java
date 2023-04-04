import java.util.Scanner;

public class SaveBox {

	int coin = 0;
	boolean isBroken = false;
	String name = "돼지";

	// 입금
	public void deposit() {
		System.out.println("입금하실 금액을 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		int inputCoin = Integer.parseInt(scanner.nextLine());
		this.coin = this.coin + inputCoin;
		System.out.println("땡그랑");
		System.out.println("현재 해당 계좌 잔액은 " + this.coin + "원 입니다.");
	}

	// 출금
	public void withdraw() {
		System.out.println("전액을 인출하시겠습니까?");
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.nextLine();
		if (userInput.equals("y") || userInput.equals("Y")) {
			System.out.println("" + this.coin + "원이 출금되었습니다.");
			this.isBroken = true;
		} else
			return;
	}

	public void doAction() {
		if (this.isBroken) {
			System.out.println("이 저금통은 더이상 사용하실 수 없습니다.");
			return;
		}
		System.out.println("1. 입금, 2. 출금, 3. 계좌 이름 변경, 4. 계좌 조회 중 선택해주세요.");
		Scanner scanner = new Scanner(System.in);
		String inputAction = scanner.nextLine();
		if (inputAction.equals("1")) {
			this.deposit();
		} else if (inputAction.equals("2")) {
			this.withdraw();
		} else if (inputAction.equals("3")) {
			this.setName();
		} else if (inputAction.equals("4")) {
			this.info();
		} else {
			System.out.println("입력이 잘못되었습니다. 다시 입력해주세요.");
			this.doAction();
		}
		// 한 페이지에 다 모여있으니까 this로 메소드 호출이 가능하구나.
		// 좋은 걸 배웠다.
	}

	public void setName() {
		System.out.println("변경할 이름을 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		String inputName = scanner.nextLine();
		this.name = inputName;
	}

	public void info() {
		if(this.isBroken) {
			System.out.println(this.name + "계좌는 현재 사용하실 수 없습니다.");
		}
		else {
			System.out.println(this.name + "계좌의 현재 잔액은 " + this.coin + "원 입니다.");
		}
	}
	public String toString() {
		String infoString = this.name + "계좌의 현재 잔액은 " + this.coin + "원 입니다.";
		return infoString;
	}
}