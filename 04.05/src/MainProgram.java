import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainProgram {
	String nameData = "";
	boolean maleCount = false;
	boolean femaleCount = false;
	boolean userInput = false;

	public void userInput() {
		this.userInput = true;
	}

	public void nameInput() {
		System.out.println("이름을 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		this.nameData = name;
	}

	public void genderInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("인원의 성별을 입력해주세요.");
		System.out.println("1:남성|2:여성");
		String userGender = scanner.nextLine();
		if (userGender.equals("1")) {
			this.maleCount = true;
			System.out.println("해당 인원의 성별은 남성입니다.");
		} else if (userGender.equals("2")) {
			this.femaleCount = true;
			System.out.println("해당 인원의 성별은 여성입니다.");
		} else {
			System.out.println("올바른 값을 입력해주세요.");
		}
	}
}