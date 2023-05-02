import java.util.Scanner;

public class Test {
	String category = "";// 중간, 기말(혹은 1학기 중간, 1학기 기말, 2학기 중간, 2학기 기말)

	int korScore = 0;
	int engScore = 0;
	int mathScore = 0;
	
	public void testInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어 점수를 입력해주세요.");
		String korInfo = scanner.next();
		if (Integer.parseInt(korInfo) <= 100 && Integer.parseInt(korInfo) >= 0) {
			int korscore = Integer.parseInt(korInfo);
			this.korScore = korscore;
		} else {
			System.out.println("올바른 값을 입력해주세요.");
			testInput();
		}
		System.out.println("영어 점수를 입력해주세요.");
		String engInfo = scanner.next();
		if (Integer.parseInt(engInfo) <= 100 && Integer.parseInt(engInfo) >= 0) {
			int engscore = Integer.parseInt(engInfo);
			this.engScore = engscore;
		} else {
			System.out.println("올바른 값을 입력해주세요.");
			testInput();
		}
		System.out.println("수학 점수를 입력해주세요.");
		String mathInfo = scanner.next();
		if (Integer.parseInt(mathInfo) <= 100 && Integer.parseInt(mathInfo) >= 0) {
			int mathscore = Integer.parseInt(mathInfo);
			this.mathScore = mathscore;
		} else {
			System.out.println("올바른 값을 입력해주세요.");
			testInput();
		}
	}

}
