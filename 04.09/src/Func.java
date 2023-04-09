import java.util.Scanner;

public class Func {

	String userName = "";
	String residence = "";
	String gender = "";
	int seCount = 0;
	int buCount = 0;
	int gaCount = 0;
	int chCount = 0;
	int jeCount = 0;
	int gyCount = 0;
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
		System.out.println("인원의 거주 지역을 입력해주세요.");
		System.out.println("[1] 서울 | [2] 경기 | [3] 강원");
		System.out.println("[4] 충청 | [5] 전라 | [6] 경상");
		String userInfo = scanner.nextLine();
		if (userInfo.equals("1")) {
			this.seCount = this.seCount+1;
			this.residence = "서울";
			System.out.println("서울을 선택하셨습니다.");
		} else if (userInfo.equals("2")) {
			this.buCount = this.buCount+1;
			this.residence = "부산";
			System.out.println("부산을 선택하셨습니다.");
		} else if (userInfo.equals("3")) {
			this.gaCount = this.gaCount+1;
			this.residence = "강원";
			System.out.println("강원도를 선택하셨습니다.");
		} else if (userInfo.equals("4")) {
			this.chCount = this.chCount+1;
			this.residence = "충청도";
			System.out.println("충청도를 선택하셨습니다.");
		} else if (userInfo.equals("5")) {
			this.jeCount = this.jeCount+1;
			this.residence = "전라도";
			System.out.println("전라도를 선택하셨습니다.");
		} else if (userInfo.equals("6")) {
			this.gyCount = this.gyCount+1;
			this.residence = "경상도";
			System.out.println("경상도를 선택하셨습니다.");
		} else {
			System.out.println("올바른 지역 번호를 입력해주세요.");
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