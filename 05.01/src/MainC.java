import java.util.Scanner;

public class MainC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("몇 개의 계좌를 생성할까요?");
		String accountNum = scanner.next();
		int accNum = Integer.parseInt(accountNum);
		Account[] acc = new Account[accNum];
		for(int i = 0; i < acc.length; i++) {
			acc[i] = new Account();
		}
		
		for(int i = 0; i < 999999; i++) {
			System.out.println("계좌 관리 프로그램입니다.");
			System.out.println("원하시는 메뉴를 선택해주세요.");
			System.out.println("[1] 입금 [2] 출금 [3] 계좌명 변경 [4] 계좌 조회 [5] 종료");
			String userSelect = scanner.next();
			if(userSelect.equals("1")) {
				System.out.println("몇 번 인덱스에서 계좌를 불러올까요?(0 ~ " + (acc.length-1) +")");
				String accNums = scanner.next();
				if(Integer.parseInt(accNums) > acc.length) {
					System.out.println("올바른 계좌 인덱스가 아닙니다.");
				}
				else {
					acc[Integer.parseInt(accNums)].isOpen();
				}
			}
			else if(userSelect.equals("2")) {
				System.out.println("몇 번 인덱스에서 계좌를 불러올까요? (0 ~ " + (acc.length-1) +")");
				String accNums = scanner.next();
				if(Integer.parseInt(accNums) > acc.length) {
					System.out.println("올바른 계좌 인덱스가 아닙니다.");
				}
				else {
					acc[Integer.parseInt(accNums)].withdraw();
				}
			}
			else if(userSelect.equals("3")) {
				System.out.println("몇 번 계좌명을 변경할까요?");
				String accNumber = scanner.next();
				acc[Integer.parseInt(accNumber)].setName();
			}
			else if(userSelect.equals("4")) {
				System.out.println("몇 번 계좌를 조회할까요?");
				String accnums = scanner.next();
				if(Integer.parseInt(accnums) > (acc.length-1)) {
					System.out.println("올바른 계좌 인덱스가 아닙니다.");
				}
				else {
					acc[Integer.parseInt(accnums)].info();
				}
			}
			else if(userSelect.equals("5")){
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else {
				System.out.println("올바른 메뉴를 선택해주세요.");
			}
		System.out.println();
		}

	}

}
