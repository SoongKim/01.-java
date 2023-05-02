import java.util.Scanner;

public class primeNumber01 {

	public static void main(String[] args) {
		//소수 판별 문제. 정답.
		Scanner scanner = new Scanner(System.in);

		int primeNumber = 0;

		System.out.println("숫자를 하나 입력해주세요.");
		String userInput = scanner.nextLine();
		int number = Integer.parseInt(userInput);

		boolean isPrime = true;
		//boolean isPrime의 기본 값은 "참"
		for (int i = 0; i < number; i++) { // for(int i = 0; i<10; i++)를 기억
			// number - 1까지 반복
			if (i < 2) {
				continue;
			}

			if (number % i == 0) {
				// 나머지가 0인 나누기. 나눠졌다면 소수가 아니다.
				// 소수가 아님
				isPrime = false;
				break;
				// 해당 케이스에 속한다면 isPrime = false로 갱신
				// 해당 숫자가 소수가 아니라면 나누기를 중지함.			
			}

		}

		if (isPrime) {
			System.out.println("소수입니다.");
			//boolean = true 인 경우, 해당 문자열을 출력
		} else {
			System.out.println("소수가 아닙니다.");
			//boolean = false로 갱신된 경우, 위 문자열을 출력
		}

//		에라토네스의 체. 원하는 방식이 아니다.
//		해당 방식을 사용한다면, 모든 소수를 나열하여야만 판별이 가능하다.
		
//		if(userInput % 2 == 0 && userInput != 2) {
//			System.out.println("해당 숫자는 소수가 아닙니다.");
//		} else if(userInput % 3 == 0 && userInput != 3) {
//			System.out.println("해당 숫자는 소수가 아닙니다.");
//		} else if(userInput % 5 == 0 && userInput != 5) {
//			System.out.println("해당 숫자는 소수가 아닙니다.");
//		} else if(userInput % 7 == 0 && userInput != 7) {
//			System.out.println("해당 숫자는 소수가 아닙니다.");
//		} else {
//			System.out.println("해당 숫자는 소수입니다.");

	}
}