import java.util.Scanner;

public class Student {

	String name;// 이름
	String address;// 주소
	String gender;// 성별
	Test[] test = new Test[4];
	int scoreIndex1 = 0, scoreIndex2 = 0, scoreIndex3 = 0, scoreIndex4 = 0;
	public void studentInput() {
		System.out.println("학생 인적 정보를 입력합니다.");
		Scanner scanner = new Scanner(System.in);
		System.out.println("학생의 이름을 입력해주세요.");
		String name = scanner.next();
		this.name = name;
		System.out.println("학생의 거주 지역을 입력해주세요.");
		System.out.println("서울 | 부산 | 강원 | 충청 | 전라 | 경상");
		String address = scanner.next();
		if (address.equals("서울")) {
			this.address = address;
		} else if (address.equals("부산")) {
			this.address = address;
		} else if (address.equals("강원")) {
			this.address = address;
		} else if (address.equals("충청")) {
			this.address = address;
		} else if (address.equals("전라")) {
			this.address = address;
		} else if (address.equals("경상")) {
			this.address = address;
		} else {
			System.out.println("올바른 값을 입력해주세요.");
			studentInput();
		}

		this.address = address;
		System.out.println("학생의 성별을 입력해주세요.");
		System.out.println("남 | 여");
		String gender = scanner.next();
		if (gender.equals("남")) {
			this.gender = "남";
		} else if (gender.equals("여")) {
			this.gender = "여";
		} else {
			System.out.println("올바른 값을 입력해주세요.");
			studentInput();
		}
		System.out.println("입력이 완료되었습니다.");
	}

	public void testInfo() {
		for (int i = 0; i < 4; i++) {
			test[i] = new Test();
		}
		System.out.println("시험 정보를 확인합니다.");
		System.out.println("[1] 1학기 중간고사 | [2] 1학기 기말고사 | [3] 2학기 중간고사 | [4] 2학기 기말고사");
		Scanner scanner = new Scanner(System.in);
		String tests = scanner.next();
		if (tests.equals("1")) {
			test[0].category = "first_mid";
			this.scoreIndex1++;
			test[0].testInput();
		} else if (tests.equals("2")) {
			test[1].category = "first_last";
			this.scoreIndex2++;
			test[1].testInput();
		} else if (tests.equals("3")) {
			test[2].category = "second_mid";
			this.scoreIndex3++;
			test[2].testInput();
		} else if (tests.equals("4")) {
			test[3].category = "second_last";
			this.scoreIndex4++;
			test[3].testInput();
		} else {
			System.out.println("올바른 값을 입력해주세요.");
			testInfo();
		}
	}
}