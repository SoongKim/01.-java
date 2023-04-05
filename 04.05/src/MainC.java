import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainC {

	int userNum = 0;
	int regionCount = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainC manager = new MainC();
		List<String> regionId = new ArrayList<String>();

		Scanner scanner = new Scanner(System.in);
		System.out.println("[인력 관리 프로그램입니다.]");
		System.out.println("관리 인원 수를 입력해주세요.");
		int userNumber = Integer.parseInt(scanner.nextLine());
		manager.userNum = manager.userNum + userNumber;

		MainProgram[] load = new MainProgram[manager.userNum];

		for (int c = 0; c < manager.userNum; c++) {
			load[c] = new MainProgram();
		}
		System.out.println("총 " + manager.userNum + "명을 설정하셨습니다.");
		System.out.println("관리 대상 지역 수를 입력해주세요.");
		manager.regionCount = Integer.parseInt(scanner.nextLine());
		for (int j = 0; j < manager.regionCount; j++) {
			System.out.println("인덱스 " + j + "번 지역 명을 입력해주세요.");
			regionId.add(scanner.nextLine());
		}
		for (int i = 0; i < 999999; i++) {
			System.out.println("[메인 메뉴]");
			System.out.println("원하시는 기능을 선택해주세요.");
			System.out.println("[1] 정보 입력");
			System.out.println("[2] 지역별 인원 수 확인");
			System.out.println("[3] 성별 인원 수 확인");
			System.out.println("[4] 관리 지역 추가");
			String userInfo = scanner.nextLine();
			if (userInfo.equals("1")) {
				System.out.println("정보 입력을 선택하셨습니다.");
				System.out.println("몇 번 인덱스에 정보를 저장할까요?");
				System.out.println("최대 " + " 0~" + (manager.userNum - 1) + "번");
				int userIndex = Integer.parseInt(scanner.nextLine());
				if (load[userIndex].userInput == false) {
					load[userIndex].nameInput();
					System.out.println("지역 정보를 입력합니다. 인덱스 번호를 입력해주세요.");
					for (int rg = 0; rg < regionId.size(); rg++) {
						System.out.println(rg + "번:" + regionId.get(rg));
					}
					int rgIndex = Integer.parseInt(scanner.nextLine());
					System.out.println(rgIndex + "번 " + regionId.get(rgIndex) + "지역을 선택하셨습니다.");
					
					load[userIndex].genderInput();
					load[userIndex].userInput();

				} else if (load[userIndex].userInput) {
					System.out.println("이미 사용 중인 번호입니다.");
				}
			} else if (userInfo.equals("2")) {
				System.out.println("지역별 인원 수 확인을 선택하셨습니다.");
				System.out.println(regionId);
			} else if (userInfo.equals("3")) {
				System.out.println("성별 인원 수 확인을 선택하셨습니다.");
				int maleC = 0, femaleC = 0;
				for (int gen = 0; gen < manager.userNum; gen++) {
					if (load[gen].maleCount) {
						maleC = maleC + 1;
					} else if (load[gen].femaleCount) {
						femaleC = femaleC + 1;
					}
				}
				System.out.println("남성은 총 " + maleC + "명");
				System.out.println("여성은 총 " + femaleC + "명");
			} else if (userInfo.equals("4")) {
				System.out.println("관리 지역을 추가합니다.");
				System.out.println("몇 개를 추가할까요?");
				int addRegion = Integer.parseInt(scanner.nextLine());
				manager.regionCount = manager.regionCount + addRegion;
				System.out.println(addRegion + "개를 추가하여 총" + manager.regionCount + "개 지역을 관리합니다.");
				System.out.println("추가 수만큼 신규 지역명을 입력해주세요.");
				for (int e = manager.regionCount - addRegion; e < manager.regionCount; e++) {
					regionId.add(scanner.nextLine());
				}
				System.out.println("총 관리 지역은 다음과 같습니다.");
				System.out.println(regionId);
			} else {
				System.out.println("잘못된 정보를 입력하셨습니다.");
			}
			System.out.println();
		}
	}
}