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
		System.out.println("�л��� �̸��� �Է����ּ���.");
		String nameInfo = scanner.nextLine();
		this.nameClose = true;
		return this.name;
	}
	public int studentKor() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�л��� ���� ������ �Է����ּ���.");
		int korInfo = Integer.parseInt(scanner.nextLine());
		this.kor = korInfo;
		this.korCount++;
		this.korClose = true;
		return this.kor;
	}
	public int studentEng() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�л��� ���� ������ �Է����ּ���.");
		int engInfo = Integer.parseInt(scanner.nextLine());
		this.eng = engInfo;
		this.engCount++;
		this.engClose = true;
		return this.eng;
	}
	public int studentMath() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�л��� ���� ������ �Է����ּ���.");
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
		System.out.println("� ���� ������ �����Ͻðڽ��ϱ�?");
		System.out.println("1: ���� | 2: ����| 3: ����");
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
		System.out.println("�ش� �ε��� ��ȣ�� �л� ������ ��ȸ�մϴ�.");
		System.out.println("���� ����: "+this.kor+"��, "+"���� ����: "+this.eng+"��, "+"���� ����: "+this.math+"��");
	}
}