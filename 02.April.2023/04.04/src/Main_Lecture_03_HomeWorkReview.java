import java.util.Scanner;

public class Main_Lecture_03_HomeWorkReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Main_Lecture_03 & SaveBox_Mine & SaveBox ���ϵ��� ���� �����Ǿ��ִ�.
		// Main_Lecture_04_Manager�� �����Ǿ��ִ�.
		// ���� �� ��������.		
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