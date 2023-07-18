import java.util.Scanner;

public class Account implements Deposit {

	String name;
	int total;
	boolean broken;

	Account() {
		this.name = "돼지저금통";
		this.total = 0;
		this.broken = true;
	}

	Scanner scanner = new Scanner(System.in);

	public void input() {
		System.out.println(this.name + "계좌에 입금합니다.");
		System.out.println("입금액을 입력해주세요.");
		int inputMoney = scanner.nextInt();
		System.out.println(inputMoney + " 원이 맞습니까?");
		System.out.println(" Y / N");
		String userInput = scanner.next();
		if (userInput.equals("Y") || userInput.equals("y")) {
			this.total = this.total + inputMoney;
			System.out.println(inputMoney + "원이 입금되었습니다.");
			System.out.println(this.name + "계좌 잔액 : " + this.total + "원");
		} else {
			System.out.println("메인 화면으로 돌아갑니다.");
		}
	}

	public void withdraw() {
		System.out.println(this.name + " 계좌에서 전액을 출금합니다.");
		System.out.println(this.name + " 계좌 잔액 : " + this.total + "원");
		System.out.println("출금하시겠습니까? 한 번 출금이 이뤄진 계좌는 더 이상 이용이 불가하십니다.");
		System.out.println("출금을 원하시면 Y를 눌러주세요.");
		String userSelect = scanner.next();
		if (userSelect.equals("Y") || userSelect.equals("y")) {
			System.out.println(this.total + "원이 인출되었습니다.");
			this.total = this.total - this.total;
			this.broken = false;
			System.out.println("이용해주셔서 감사합니다.");
		}
	}

	public void isOpen() {
		if (this.broken) {
			this.input();
		} else {
			System.out.println("만료된 계좌입니다. 사용이 불가능하십니다.");
		}
	}

	public void setName() {
		System.out.println("계좌명을 변경합니다.");
		System.out.println("사용하실 계좌명을 입력해주세요.");
		String accName = scanner.next();
		this.name = accName;
		System.out.println("해당 계좌명을 " + this.name + "으로 변경하였습니다.");
	}

	public void info() {
		System.out.println("요청하신 인덱스 번호로 계좌 정보를 조회합니다.");
		System.out.println("계좌명 : " + this.name);
		System.out.println("잔고 : " + this.total);
		if (this.broken) {
			System.out.println("사용가능여부 : YES");
		} else {
			System.out.println("사용가능여부 : NO");
		}
	}
}
