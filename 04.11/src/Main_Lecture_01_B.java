import java.util.Scanner;

public class Main_Lecture_01_B {
	String name;
	String address;
	String gender;

	public void inputData() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("인원의 이름을 입력해주세요.");
		this.name = scanner.nextLine();
		System.out.println("인원의 이름은 " + this.name + "입니다.");
		System.out.println("주소를 입력해주세요.");
		this.address = scanner.nextLine();
		System.out.println("성별을 입력해주세요.");
		this.gender = scanner.nextLine();
	}

	public void printinfo() {
		System.out.println("이름 : " + this.name + " 주소 : " + this.address + " 성별 : " + this.gender);
	}

}