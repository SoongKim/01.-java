import java.util.Scanner;

public class ExeeClass07_PfVer01 {

	int account = 0;
	String name = "돼지";
	boolean breakcount = false;
	
	public void inputMoney() {
		if(this.breakcount) {
			System.out.println("이 저금통은 더이상 사용할 수 없습니다.");
			return;
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println(this.name +" 계좌에 입금하실 금액을 입력해주세요.");
		String inputData = scanner.nextLine();
		int inputMoney = Integer.parseInt(inputData);
		this.account = this.account + inputMoney;
		
		System.out.println("땡그랑");
		System.out.println("현재 보유하신 금액은 총 " + this.account + " 원 입니다.");
		System.out.println("처음 화면으로 돌아갑니다.");
	}
	
	public void withDraw() {
		System.out.println(this.name + "계좌에 보유하신 전액을 인출합니다.");
		System.out.println("총" + this.account + "원을 인출합니다.");
		this.account = this.account - this.account;
		this.breakcount = true;
		System.out.println("처음 화면으로 돌아갑니다.");
	}

	public void setName(String name) {
		this.name = name;
	}
}