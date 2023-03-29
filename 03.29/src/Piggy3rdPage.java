import java.util.Scanner;

public class Piggy3rdPage {

	public static void main(int n) {
		// TODO Auto-generated method stub
		Piggy4thPage pb = new Piggy4thPage();
		// Piggy4thPage 클래스를 pb 라는 이름으로 호출.
		
		System.out.println(n + " 번 계좌에서 작업을 시작합니다.");
		
		for(int i = 0; i < 999999; i++) {
			Scanner scanner = new Scanner(System.in);
			// 스캐너 클래스 호출
			System.out.println("저금통 프로그램입니다.");
			System.out.println();
			System.out.println("[1] 입금 : [2] 출금 : [3] 잔액확인");
			System.out.println("[0] 계좌명변경 : [9] 사용 계좌 변경 :"); 
			System.out.println("[q] 종료");
			System.out.println("");
			String userInput = scanner.nextLine();
			if(userInput.equals("1")) {
				pb.Insert();
			}
			else if(userInput.equals("2")) {
				pb.Withdraw();
			}
			else if(userInput.equals("3")) {
				pb.checkAccount();
			}
			else if(userInput.equals("0")) {
				pb.nameTag();
			}
			else if(userInput.equals("q")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else if(userInput.equals("9")) {
				Piggy2ndPage main = new Piggy2ndPage();
				main.firstPage(null);
			}
			// 스캐너로 입력받은 문자를 비교하여 해당 문자와 일치하는 경우 각각의 메소드를 호출
			
			else {
				System.out.println("올바른 값을 입력해주세요.");
			// 비교 간 입력받은 문자가 비교군 문자와 일치하지 않는 경우 해당 문구를 출력하고 처음으로 돌아간다.
			}
			System.out.println();
		}
	}
}