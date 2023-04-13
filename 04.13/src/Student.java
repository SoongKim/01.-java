import java.util.Scanner;

public class Student {
	String name;// 이름
	String address;// 주소
	String gender;// 성별
	Test[] test = new Test[4];
	boolean infoYn = false;
	boolean test0 = false, test1 = false, test2 = false, test3 = false;
	public void infoInput() {
		System.out.println("인적 정보를 입력합니다.");
		System.out.println("먼저, 학생의 이름을 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		this.name = scanner.next();
	}

	public void regionInput() {
		System.out.println("학생의 거주 지역을 입력해주세요.");
		System.out.println("서울 | 부산 | 강원 | 충청 | 전라 | 경상");
		Scanner scanner = new Scanner(System.in);
		String regionId = scanner.next();
		if (regionId.equals("서울")) {
			this.address = regionId;
			System.out.println(this.name + " 인원의 거주 지역은 " + this.address + "입니다.");
		} else if (regionId.equals("부산")) {
			this.address = regionId;
			System.out.println(this.name + " 인원의 거주 지역은 " + this.address + "입니다.");
		} else if (regionId.equals("부산")) {
			this.address = regionId;
			System.out.println(this.name + " 인원의 거주 지역은 " + this.address + "입니다.");
		} else if (regionId.equals("강원")) {
			this.address = regionId;
			System.out.println(this.name + " 인원의 거주 지역은 " + this.address + "입니다.");
		} else if (regionId.equals("충청")) {
			this.address = regionId;
			System.out.println(this.name + " 인원의 거주 지역은 " + this.address + "입니다.");
		} else if (regionId.equals("전라")) {
			this.address = regionId;
			System.out.println(this.name + " 인원의 거주 지역은 " + this.address + "입니다.");
		} else if (regionId.equals("경상")) {
			this.address = regionId;
			System.out.println(this.name + " 인원의 거주 지역은 " + this.address + "입니다.");
		} else {
			System.out.println("올바른 값을 입력해주세요.");
			regionInput();
		}
	}

	public void genderInput() {
		System.out.println("학생의 성별을 입력해주세요.");
		System.out.println("남 | 여");
		Scanner scanner = new Scanner(System.in);
		String stuGen = scanner.next();
		if (stuGen.equals("남")) {
			this.gender = stuGen;
			System.out.println(this.name + " 학생의 성별은 " + this.gender + "입니다.");
			this.infoYn = true;
		} else if (stuGen.equals("여")) {
			this.gender = stuGen;
			System.out.println(this.name + " 학생의 성별은 " + this.gender + "입니다.");
			this.infoYn = true;
		} else {
			System.out.println("올바른 값을 입력해주세요.");
			genderInput();
		}
	}

	public void testInput() {
		for (int i = 0; i < 4; i++) {
			test[i] = new Test();
		}
		System.out.println("인원의 성적 정보를 입력합니다.");
		System.out.println("0: 1학기 중간고사 1: 1학기 기말고사 | 2: 2학기 중간고사 | 3: 2학기 기말고사");
		Scanner scanner = new Scanner(System.in);
		String userSel = scanner.next();
		if (userSel.equals("0")) {
			this.test0 = true;
			test[0].testInfo();
		} else if (userSel.equals("1")) {
			this.test1 = true;
			test[1].testInfo();
		} else if (userSel.equals("2")) {
			this.test2 = true;
			test[2].testInfo();
		} else if (userSel.equals("3")) {
			this.test3 = true;
			test[3].testInfo();
		} else {
			System.out.println("올바른 값을 입력해주세요.");
			testInput();
		}
	}
}