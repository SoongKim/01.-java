import java.util.Scanner;

public class primeNumber02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է����ּ���.");
		
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
			System.out.println("�Ҽ��Դϴ�.");
		} else {
			System.out.println("�Ҽ��� �ƴմϴ�.");
		}
		scanner.close();
	}
}