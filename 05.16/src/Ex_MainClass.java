import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex_MainClass {

	public static void main(String[] args) {
		ArrayList<Ex_Student> info = new ArrayList<Ex_Student>();
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 999999; i++) {
			System.out.println("학생정보포탈입니다.");
			System.out.println("원하시는 메뉴를 선택해주세요.");
			System.out.println("[1]학생정보입력 | [2] 최고점학생조회 | [3] 종료");
			String userSelectMenu = scanner.next();
			int index = 0;
			if (userSelectMenu.equals("1")) {
				info.add(new Ex_Student());
				info.get(index).inputInfoes();
				index++;
			} 
			else if (userSelectMenu.equals("2")) {
				ArrayList<Integer> maxScore = new ArrayList<Integer>();
				ArrayList<String> maxScoreName = new ArrayList<String>();
				int maxScoreCount = 0;
				String maxScoreStudentCount = "";
				int indexx = 0;
				int maxXes = 0;
				for (int j = 0; j < info.size(); j++) {
					for (int k = 0; k < info.size(); k++) {
						if (info.size() == 0) {
							System.out.println("입력된 학생 정보가 존재하지 않습니다.");
							break;
						} else if (info.size() == 1) {
							maxScore.add(info.get(0).score);
							maxScoreName.add(info.get(0).name);
							indexx++;
						} else {
							if (info.get(j).score <= info.get(k).score) {
								maxScore.add(info.get(k).score);
								maxScoreName.add(info.get(k).name);
								maxXes = info.get(k).score;
								indexx++;
							}
						}
					}
				}
				System.out.println("이름 : " + maxScoreName.get(0) + " | 점수 : " + maxScore.get(0));
			}
			else if (userSelectMenu.equals("3")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.println();
		}
	}

}
