import java.util.Scanner;

public class Test {
	String testName;
	int korScore;
	int engScore;
	int mathScore;
	int total;

	Test(String testName, int korScore, int engScore, int mathScore) {
		this.testName = testName;
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
		this.total = korScore + engScore + mathScore;
	}

	Test(String name) {
		this.testName = name;
	}

	public void inputScore() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어 점수 : ");
		String inputScore = scanner.nextLine();
		this.korScore = Integer.parseInt(inputScore);
		System.out.println("영어 점수 : ");
		inputScore = scanner.nextLine();
		this.engScore = Integer.parseInt(inputScore);
		System.out.println("수학 점수 : ");
		inputScore = scanner.nextLine();
		this.mathScore = Integer.parseInt(inputScore);
		this.total = this.korScore + this.engScore + this.mathScore;
	}
}
