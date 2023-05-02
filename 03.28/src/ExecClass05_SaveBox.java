import java.util.Scanner;

public class ExecClass05_SaveBox {
	int coin = 0;
	//전역 변수?
	//Property
	String name = "돼지";
	
	
	public void deposit() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(this.name +"에 입금하실 금액을 입력해주세요.");
		String inputString = scanner.nextLine();
		int inputCoin = Integer.parseInt(inputString);
		
		this.coin = this.coin + inputCoin;
		// this means self.
		// 내 객체가 가지고 있는 property/method에 접근할 때 사용
		// Property 사용할 떄에는 this를 반드시 붙여주자.
		// 꼭!꼭!꼭!
	}
	// method
	
	public void withdraw() {
		System.out.println(this.name + " 저금통을 깼습니다.");
		System.out.println("최종 출금액은 " + coin + "입니다.");
	}
	
	public void setName(String name) {
		this.name = name;
		// 사용 목적을 명확하게 하기 위해
		// 서로 다른 변수지만 똑같은 네이밍을 적용한다!
		// 꼭!꼭!꼭! 같게 세팅해주자.
	}
}
