import java.util.Scanner;

public class FunC {
	String userName = "";
	String residence = "";
	String gender = "";
	int maleCount = 0;
	int femaleCount = 0;
	boolean userInfo = false;
	
	public void nameInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("지원 인력의 이름을 입력해주세요.");
		String nameInput = scanner.nextLine();
		this.userName = nameInput;
		System.out.println("입력하신 인원의 이름은 " + this.userName + "입니다.");
	}
	
	public void residenceInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("해당하는 지역을 입력해주세요.");
		System.out.println("[1]서울|[2]부산|[3]강원도");
		System.out.println("[4]충청|[5]전라도|[6]경상도");
		String residenceInput = scanner.nextLine();
		System.out.println(residenceInput+"이/가 맞습니까?");
		System.out.println("y: 네 | n: 아니오");
		String userSelect = scanner.nextLine();
		if(userSelect.equals("y")) {
			this.residence = residenceInput;
			System.out.println("해당 인원의 거주 지역으로 "+this.residence+"을/를 선택하셨습니다.");
		}
		else if(userSelect.equals("n")) {
			System.out.println("입력 화면으로 돌아갑니다.");
		}
		else {
			System.out.println("올바른 값을 입력해주세요.");
		}
	}
	public void genderInput() {
		System.out.println("인원의 성별을 입력해주세요.");
		System.out.println("[1] 남성 | [2] 여성");
		Scanner scanner = new Scanner(System.in);
		String userGender = scanner.nextLine();
		if(userGender.equals("1")) {
			this.maleCount = this.maleCount+1;
			this.gender = "남성";
			System.out.println("남성을 선택하셨습니다.");
		}
		else if(userGender.equals("2")) {
			this.femaleCount = this.femaleCount+1;
			this.gender = "여성";
			System.out.println("여성을 선택하셨습니다.");
		}
	}
	public void InfoInput() {
		if(this.userInfo == false) {
			this.userInfo = true;
		}
	}
	
	
}
