import java.util.Arrays;
import java.util.Scanner;

public class Piggy2ndPage {

	public void firstPage(String[] args) {
		// TODO Auto-generated method stub
		Piggy3rdPage[]pb = new Piggy3rdPage[100];
		Piggy4thPage p4p = new Piggy4thPage();
		// Piggy3rdPage 클래스를 pb 라는 이름으로 호출.
		// Piggy4thPage 클래스를 p4p 라는 이름으로 호출.
		System.out.println("몇 번 계좌를 이용하시겠습니까?");
		System.out.println("0~99까지 총 100개 계좌의 이용이 가능하십니다.");
		Scanner scanner = new Scanner(System.in);
		// 스캐너 클래스 호출
		String accountNum = scanner.nextLine();
		int userNum = Integer.parseInt(accountNum);
		// 스캐너로 입력 받은 문자열 값을 정수 값으로 변환
		if(userNum >= 0 && userNum < 100) {
			p4p.accountOpen(userNum);
		}
		else{
			System.out.println("입력하신 번호의 계좌가 존재하지 않습니다.");
			System.out.println("번호를 확인하시고, 프로그램을 다시 실행해주세요.");
		}
	}
}