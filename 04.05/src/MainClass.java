import java.util.Arrays;
import java.util.Scanner;

import javax.management.openmbean.OpenMBeanAttributeInfoSupport;

public class MainClass {
	String localNames = "";
	int localNum = 0;

	public static void main(String[] args) {
		MainClass mains = new MainClass();

		System.out.println("관리 인원 수를 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		int userNum = Integer.parseInt(scanner.nextLine());
		MainProgram[] manager = new MainProgram[userNum];
		for (int i = 0; i < userNum; i++) {
			manager[i] = new MainProgram();
		}
		System.out.println("관리 지역 수를 입력해주세요.");
		int localNum = Integer.parseInt(scanner.nextLine());
		int[] locals = new int[localNum];
		String[] localNames = new String[localNum];
		System.out.println("관리 지역의 이름을 입력해주세요.");
		for (int m = 0; m < localNum; m++) {
			localNames[m] = scanner.nextLine();
		}

		for (int n = 0; n < 999999; n++) {
			System.out.println(mains.localNum);
			System.out.println("[인력 관리 프로그램입니다.]");
			System.out.println("원하시는 메뉴를 입력해주세요.");
			System.out.println("[1:입력]");
			System.out.println("[2:전체 출력]");
			System.out.println("[3:지역별 인구 수 출력]");
			System.out.println("[4:성별 인구 수 출력]");
			System.out.println("[5:관리 인원 수 변경]");
			System.out.println("[6:관리 지역 수 변경]");
			Scanner scanners = new Scanner(System.in);
			String userInput = scanners.nextLine();
			if (userInput.equals("1")) {
				System.out.println("몇 번 인덱스에 정보를 저장하시겠습니까?");
				int inputNum = Integer.parseInt(scanner.nextLine());
				manager[inputNum].nameInput();
				manager[inputNum].genderInput();
				System.out.println("입력이 완료되었습니다.");
				System.out.println("메인 화면으로 돌아갑니다.");
			} else if (userInput.equals("2")) {

			} else if (userInput.equals("3")) {

			} else if (userInput.equals("4")) {

			} else if (userInput.equals("5")) {

			} else if (userInput.equals("6")) {
				
					
					System.out.println("현재 관리 지역은 " + localNum + "개");
					System.out.println("몇 개의 지역을 추가할까요?");
					
					int regionChange = Integer.parseInt(scanner.nextLine());
					mains.localNum = mains.localNum + regionChange;
					System.out.println("총 관리 지역 수는 " + mains.localNum);

				
			} else {
				System.out.println("올바른 정보를 입력해주세요.");
			}
		}

	}

}