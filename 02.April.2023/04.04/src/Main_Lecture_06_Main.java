import java.util.Scanner;

public class Main_Lecture_06_Main {

	public static void main(String[] args) {
		Main_Lecture_06_Student[] student = new Main_Lecture_06_Student[30];

		for (int i = 0; i < 30; i++) {
			student[i] = new Main_Lecture_06_Student();
		}

		for (int j = 0; j < 999999; j++) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("성적 입력 프로그램입니다.");
			System.out.println("1: 데이터 입력 입력");
			System.out.println("2: 총점, 평균 확인");
			System.out.println("3: 입력 정보 수정");
			System.out.println("4: 입력 정보 확인");
			System.out.println("q: 종료");
			String userInput = scanner.nextLine();
			if (userInput.equals("1")) {
				System.out.println("몇 번째 학생인지 입력해주세요.");
				System.out.println("[학생 인덱스 범위: 0 - 30]");
				int studentNum = Integer.parseInt(scanner.nextLine());

				student[studentNum].studentName();
				student[studentNum].studentKor();
				student[studentNum].studentEng();
				student[studentNum].studentMath();
				System.out.println(studentNum + "번 인덱스에" + student[studentNum].name + "학생의 데이터가 입력되었습니다.");
			}
			else if (userInput.equals("2")) {
				System.out.println("몇 번째 학생을 조회하시겠습니까?");
				Scanner scanner02 = new Scanner(System.in);
				int studentNums = Integer.parseInt(scanner02.nextLine());
				student[studentNums].studentSum();
				student[studentNums].studentAvg();
				System.out.println(studentNums + "번 학생의 총점은 " + student[studentNums].sum + "점이며, 평균은 "
						+ student[studentNums].avg + "점 입니다.");
			} 
			else if(userInput.equals("3")) {
				System.out.println("정보를 수정합니다.");
				System.out.println("몇 번 학생의 정보를 수정할까요?");
				int whoNum = Integer.parseInt(scanner.nextLine());
				student[whoNum].changeValue();
			}
			else if(userInput.equals("4")) {
				System.out.println("입력된 정보를 확인합니다.");
				System.out.println("몇 번 인덱스 학생의 정보를 확인할까요?");
				int whichNum = Integer.parseInt(scanner.nextLine());
				student[whichNum].info();
			}
			else if (userInput.equals("q")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못된 값을 입력하셨습니다.");
				System.out.println("메인 화면으로 돌아갑니다.");
			}
			System.out.println();
		}
	}
}