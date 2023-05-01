import java.util.Scanner;

public class Main_Lecture_03_HomeWorkReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Main_Lecture_03 & SaveBox_Mine & SaveBox 파일들은 서로 연관되어있다.
		// Main_Lecture_04_Manager도 연관되어있다.
		// 복습 간 참조하자.		
		Main_Lecture_04_Manager manager = new Main_Lecture_04_Manager();

		manager.showMenu();
		for (int i = 0; i < 99999; i++) {
			boolean result = manager.showMenu();
			if (!result) {
				break;
			}
		}
	}
}