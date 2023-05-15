import java.util.ArrayList;
import java.util.Scanner;

public class ScorePrint {

	public static void main(String[] args) {
		// 1. 메뉴를 만들어 작업
		// 2. 객체 데이터 반드시 사용
		// 3. 10인의 성적 데이터 입력하여 출력
		// (입력, 출력 메뉴), (이름, 성적 입력받을 것)
		// 출력은 성적 순으로
		Scanner scanner = new Scanner(System.in);
		// 스캐너 클래스 호출

		ArrayList<ScoreClass> sc = new ArrayList<ScoreClass>();
		// 최대 10 개의 데이터 입력이 가능한 ArrayList 구축

		int index = 0;
		for (int i = 0; i < 999999; i++) {
			System.out.println("성적 관리 프로그램입니다.");
			System.out.println("[1]학생 정보 입력 [2] 학생 정보 출력 [q] 종료");
			String userInput = scanner.next();
			if (userInput.equals("1")) {
				sc.add(new ScoreClass());
				sc.get(index).inputName();
				sc.get(index).inputScore();
				index++;
			} else if (userInput.equals("2")) {
				if (index == 0) {
					System.out.println("조회할 학생 데이터가 없습니다.");
				} else {
					System.out.println("성적 순으로 학생 데이터를 출력합니다.");
					for (int j = 0; j < index; j++) {
						for (int k = j; k < index; k++) {
							String userName = "";
							int temp = 0;
							if (sc.get(j).score < sc.get(k).score) {
								userName = sc.get(j).name;
								temp = sc.get(j).score;
								sc.get(j).name = sc.get(k).name;
								sc.get(j).score = sc.get(k).score;
								sc.get(k).name = userName;
								sc.get(k).score = temp;
							}
						}
						System.out.println(sc.get(j).printInfo());
					}
				}
			} else if (userInput.equals("q")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("올바른 메뉴를 선택해주세요.");
			}
		}
		scanner.close();
	}
}