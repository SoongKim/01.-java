import java.util.Scanner;

public class SaveBox_Mine {

	int account = 0;
	
	
	public void Insert() {
		System.out.println("입금하실 금액을 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		int insertMoney = Integer.parseInt(scanner.nextLine());
		this.account = this.account + insertMoney;
		System.out.println("현재 잔고는 " + this.account + "원 입니다.");
	}
	
	public void Withdraw() {
		System.out.println("전액 출금하시겠습니까?");
		Scanner scanner = new Scanner(System.in);
		String withDrawYn = scanner.nextLine();
		if(withDrawYn.equals("y")) {
			System.out.println("총 " + this.account + "원이 출금되었습니다.");
			this.account = this.account - this.account;
		}
	}
}