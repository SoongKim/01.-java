import java.util.Scanner;

public class Ex_Student {
	String name;
	int score;
	
	Scanner scanner = new Scanner(System.in);
	public void inputInfoes() {
		System.out.println("학생정보를 입력합니다.");
		System.out.println("학생 이름을 입력해주세요.");
		this.name = scanner.next();
		System.out.println("학생 성적을 입력해주세요.");
		try {
			int studentScore = Integer.parseInt(scanner.next());
			this.score = studentScore;
		}
		catch(NumberFormatException e){
			System.out.println("정수 형태로 성적을 입력해주세요.");
			this.inputInfoes();
		}
		catch(Exception e) {
			System.out.println("오류가 발생하였습니다.");
			this.inputInfoes();
		}
		System.out.println("입력이 완료되었습니다.");
	}
}
