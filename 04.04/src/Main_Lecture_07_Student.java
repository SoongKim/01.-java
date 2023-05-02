import java.util.Scanner;

public class Main_Lecture_07_Student {

	String name = "";
	int kor = 0;
	int eng = 0;
	int math = 0;

	public void inputData() {
		this.inputName();
		this.inputKor();
		this.inputEng();
		this.inputMath();
	}

	public void inputName() {
		System.out.println("이름을 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		this.name = scanner.nextLine();
	}

	public void inputKor() {
		System.out.println("국어 점수를 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		int korValue = Integer.parseInt(inputString);
		this.kor = korValue;
	}

	public void inputEng() {
		System.out.println("영어 점수를 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		int engValue = Integer.parseInt(inputString);
		this.eng = engValue;
	}

	public void inputMath() {
		System.out.println("수학 점수를 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		int mathValue = Integer.parseInt(inputString);
		this.math = mathValue;
	}
}