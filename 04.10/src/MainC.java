import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainC {

	public static void main(String[] args) {
		System.out.println("관리 인원 수를 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		int userNum = Integer.parseInt(scanner.nextLine());
		System.out.println(userNum + "명을 관리합니다.");
		FunC[] func = new FunC[userNum];
		ArrayList regionId = new ArrayList();
		for (int i = 0; i < userNum; i++) {
			func[i] = new FunC();
		}
		for (int j = 0; j < 999999; j++) {
			System.out.println("인력 관리 프로그램입니다.");
			System.out.println("원하시는 메뉴를 선택해주세요.");
			System.out.println("[1] 정보 입력");
			System.out.println("[2] 전체 정보 확인");
			System.out.println("[3] 거주 지역 인구 수 확인");
			System.out.println("[4] 성별 인구 수 확인");
			String userSelect = scanner.nextLine();
			if (userSelect.equals("1")) {
				System.out.println("몇 번 인덱스에 정보를 입력할까요?");
				System.out.println("0 ~ " + (userNum - 1) + "번 선택 가능");
				int selInx = Integer.parseInt(scanner.nextLine());
				if (selInx >= userNum || selInx < 0) {
					System.out.println("올바른 인덱스 값을 선택해주세요.");
				} else if (selInx >= 0 && selInx < userNum) {
					if (func[selInx].userInfo == true) {
						System.out.println("이미 정보 입력이 완료된 인덱스입니다.");
						System.out.println("메인 화면으로 돌아갑니다.");
						System.out.println();
					} else {
						func[selInx].nameInput();
						func[selInx].residenceInput();
						regionId.add(func[selInx].residence);
						func[selInx].genderInput();
						func[selInx].InfoInput();
					}
				} else {
					System.out.println("올바른 값을 입력해주세요.");
				}
			} else if (userSelect.equals("2")) {
				System.out.println("전체 정보를 출력합니다.");
				for (int m = 0; m < userNum; m++) {
					System.out.println(
							"이름 : " + func[m].userName + " 거주지역 : " + func[m].residence + " 성별 : " + func[m].gender);
				}
			} else if (userSelect.equals("3")) {

			}
//			else if(userSelect.equals("4")) {
//				System.out.println("지역별 인구수를 확인합니다.");
//				for(int e = 0; e < userNum; e++) {
//					regionId = func[e].residence;
//					for(ine z = 0; z < userNum; z++) {
//						if(regionId.get(z) == func[z].residence) {
//							regionId.frequency(func[z].residence);
//						}
//					}
//				}
//			}
			else {
				System.out.println("올바른 메뉴를 선택해주세요.");
			}

		}

	}
}
