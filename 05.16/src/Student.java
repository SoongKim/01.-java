import java.util.Scanner;

public class Student {
	// 학생 이름
	String name;
	// 학생 점수
	int score;
	// 반 배정을 판별하는 boolean 변수. false : 미편성, true : 편성완료 를 의미한다.
	boolean selected = false;
	// 생성자 변수로 String name, int score를 받아와 this.name과 this.score에 저장.
	Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	Scanner scanner = new Scanner(System.in);
	// 학생 이름과 점수를 입력 받는 메소드
	// 점수 입력 간 정수값이 아닌 데이터가 입력되면 오류 문구를 출력하고,
	// 오류가 발생하지 않는다면 입력 받은 데이터를 this.score에 저장.
	public void inputInfo() {
		System.out.println("name :");
		String studentName = scanner.next();
		this.name = studentName;
		System.out.println("score :");
		try {
			String score = scanner.next();
			this.score = Integer.parseInt(score);
		}
		catch(Exception e) {
			System.out.println("Error Occured!");
			this.inputInfo();
		}
	}
	
	// 학생 정보를 출력하는 메소드.
	// String type으로 이름과 점수 데이터를 묶어 return한다.
	public String printInfo() {
		return "name : " + this.name + " | score : " + this.score;
	}
}
