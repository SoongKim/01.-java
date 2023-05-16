import java.util.Scanner;

public class D_Student_PfVer {
	String name;
	int score;
	
	D_Student_PfVer(){
		this.inputData();
	}
	
	public void inputData() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("name : ");
		String tmp = scanner.next();
		this.name = tmp;
		System.out.println("score :");
		tmp = scanner.next();
		try {
			this.score = Integer.parseInt(tmp);			
		}
		catch(NumberFormatException e) {
			System.out.println("정수 형태로 점수를 입력해주세요.");
			this.inputData();
		}
		catch(Exception e) {
			System.out.println("score is NaN");
			// NaN = Not a Number
			this.inputData();
		}
	}
	
	public String printInfo() {
		return "이름 : " + this.name + " | 점수 : " + this.score;
	}
	
}
