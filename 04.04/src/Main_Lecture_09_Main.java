import java.util.Scanner;

public class Main_Lecture_09_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int countNum = 5;
		Main_Lecture_09_Func[] manager = new Main_Lecture_09_Func[countNum];
		for (int k = 0; k < countNum; k++) {
			manager[k] = new Main_Lecture_09_Func();
		}

//		for (int i = 0; i < countNum; i++) {
//			Scanner scanner = new Scanner(System.in);
//			System.out.println("인력 관리 프로그램입니다.");
//			System.out.println("1: 정보 입력 | 2: 전체 출력 | 3: 지역별 인구 수 출력 | 4. 성별 인구 수 출력");
//			String userInput = scanner.nextLine();
//			if (userInput.equals("1")) {
//				manager[i].getName();
//				manager[i].getResidence();
//				manager[i].getGender();
//			} else if (userInput.equals("2")) {
//				
//			} else if (userInput.equals("3")) {
//				manager[i].printRes();
//			} else if (userInput.equals("4")) {
//				for (int j = 0; j < countNum; j++) {
//
//				}
//			}
//			System.out.println();
//		}
	}
}