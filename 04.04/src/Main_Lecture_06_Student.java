import java.util.Scanner;

public class Main_Lecture_06_Student {
	String name;
	int kor;
	int korCount = 0;
	int eng;
	int engCount = 0;
	int math;
	int mathCount = 0;
	int sum = 0;
	int avg = 0;
	boolean nameClose = false;
	boolean korClose = false;
	boolean engClose = false;
	boolean mathClose = false;
	
	public String studentName() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("학생의 이름을 입력해주세요.");
		String nameInfo = scanner.nextLine();
		this.nameClose = true;
		return this.name;
	}
	public int studentKor() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("학생의 국어 성적을 입력해주세요.");
		int korInfo = Integer.parseInt(scanner.nextLine());
		this.kor = korInfo;
		this.korCount++;
		this.korClose = true;
		return this.kor;
	}
	public int studentEng() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("학생의 영어 성적을 입력해주세요.");
		int engInfo = Integer.parseInt(scanner.nextLine());
		this.eng = engInfo;
		this.engCount++;
		this.engClose = true;
		return this.eng;
	}
	public int studentMath() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("학생의 수학 성적을 입력해주세요.");
		int mathInfo = Integer.parseInt(scanner.nextLine());
		this.math = mathInfo;
		this.mathCount++;
		this.mathClose = true;
		return this.math;
	}
	public void studentSum() {
		this.sum = this.kor + this.eng + this.math;
	}
	public void studentAvg() {
		this.avg = (this.sum / (this.korCount + this.engCount + this.mathCount));
	}
	public void changeValue() {
		System.out.println("어떤 과목 점수를 수정하시겠습니까?");
		System.out.println("1: 국어 | 2: 영어| 3: 수학");
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		if(inputValue.equals("1")) {
			this.korClose = false;
			this.korCount = this.korCount -this.korCount;
			this.studentKor();
		}
		else if(inputValue.equals("2")) {
			this.engClose = false;
			this.engCount = this.engCount -this.engCount;
			this.studentEng();
		}
		else if(inputValue.equals("3")) {
			this.mathClose = false;
			this.mathCount = this.mathCount -this.mathCount;
			this.studentMath();
		}
	}
	public void info() {
		System.out.println("해당 인덱스 번호의 학생 성적을 조회합니다.");
		System.out.println("국어 점수: "+this.kor+"점, "+"영어 점수: "+this.eng+"점, "+"수학 점수: "+this.math+"점");
	}
}