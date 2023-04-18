import java.util.Scanner;

public class Student {
	String name;
	String sex;
	String address;
	Test[] test = {new Test("중간고사"), new Test("기말고사")};

	Student(String name) {
		this.name = name;
	}

	Student(String name, String sex, String address) {
		this.name = name;
		this.sex = sex;
		this.address = address;
	}

	@Override
	public String toString() {
		return this.name + "( " + this.sex + " " + this.address + " )";
	}

	public void showMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. 중간고사 성적 입력 | 2. 기말고사 성적 입력");
		String testInfo = scanner.nextLine();
		if (testInfo.equals("1")) {
			test[0].inputScore();
		} else if (testInfo.equals("2")) {
			test[1].inputScore();
		} else {
			System.out.println("올바른 값을 입력해주세요.");
			this.showMenu();
		}
	}

}