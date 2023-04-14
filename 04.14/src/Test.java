import java.util.Scanner;

public class Test {
	int korScore = 0;
	int engScore = 0;
	int mathScore = 0;
	String testName = "";
	public void testInfo() {
	
		System.out.println("성적 정보를 입력합니다.");
		System.out.println("국어 성적을 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		this.korScore = Integer.parseInt(scanner.next());
		
		System.out.println("영어 성적을 입력해주세요.");
		this.engScore = Integer.parseInt(scanner.next());
		
		System.out.println("수학 성적을 입력해주세요.");
		this.mathScore = Integer.parseInt(scanner.next());

	}
}
