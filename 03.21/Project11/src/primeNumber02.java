import java.util.Scanner;

public class primeNumber02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요.");
		
		String userInput = scanner.nextLine();
		
		int userNum = Integer.parseInt(userInput);
		
		boolean primeNum = true;
		
		for(int i = 0; i < userNum; i++) {
			if(i < 2) {
				continue;
			}
			
			if(userNum % i == 0) {
			primeNum = false;
			break;
		}
		}
		if(primeNum == true) {
			System.out.println("소수입니다.");
		} else {
			System.out.println("소수가 아닙니다.");
		}
		scanner.close();
	}
}