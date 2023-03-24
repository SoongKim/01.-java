import java.util.Random;

public class Question07 {

	public static void main(String[] args) {
		Random random = new Random();
		int ranNum = random.nextInt(101);

		System.out.println("0부터 ~ 임의의 숫자 " + ranNum + "까지의 소수는 다음과 같습니다.");
		boolean primeNum = true;
		for (int i = 0; i < (ranNum + 1); i++) {
			if (i < 2) {
				continue;
			}
			for (int j = 2; j < i; j++) {
				if (i % j != 0) {
					primeNum = true;
				} else {
					primeNum = false;
					break;
				}
			}
			if (primeNum) {
				System.out.print(i + " ");
			}
		}
	}
}