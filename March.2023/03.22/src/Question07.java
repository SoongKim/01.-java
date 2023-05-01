import java.util.Random;

public class Question07 {

	public static void main(String[] args) {
		Random random = new Random();
		int ranNum = random.nextInt(101);
		// 난수 생성 기능 호출.
		// 난수 생성기로부터 0~100 사이 값을 지니는 난수를 정수 값으로 받는다.
		
		System.out.println("0부터 ~ 임의의 숫자 " + ranNum + "까지의 소수는 다음과 같습니다.");
		boolean primeNum = true;
		// boolean 타입의 기초값을 참으로 설정
		for (int i = 0; i < (ranNum + 1); i++) {
			if (i < 2) {
				continue;
			}
			//만약 i가 2보다 작다면 다음 for문으로 넘어갈 것.
			for (int j = 2; j < i; j++) {
				if (i % j != 0) {
					primeNum = true;
				} else {
					primeNum = false;
					break;
				}
			}
			// i가 2보다 클 때, i가 어떠한 값으로라도 나눠지지 않는다면(i%j != 0)
			// boolean 값은 유지, 그렇지 않은 경우 boolean 값을 false로 설정, 추후 회전을 중지한다.
			if (primeNum) {
				System.out.print(i + " ");
			}
			// 만약 boolean 값이 true라면 해당 i값을 출력한다.
		}
	}
}