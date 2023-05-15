import java.util.Scanner;

public class ScoreClass {

	String name;
	int score;

	ScoreClass() {
		this.name = "DEFAULT";
		this.score = 0;
	}

	Scanner scanner = new Scanner(System.in);

	public void inputName() {
		System.out.println("학생의 이름을 입력해주세요.");
		this.name = scanner.next();
	}

	public void inputScore() {
		System.out.println("학생의 성적을 입력해주세요.");
		try {
			this.score = Integer.parseInt(scanner.next());

		} catch (NumberFormatException e) {
			System.out.println("정수 형태로 값을 입력해주세요.");
			this.inputScore();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String printInfo() {
		return "학생 이름은 : " + this.name + " | 학생 성적 : " + this.score + "점";
	}

}
