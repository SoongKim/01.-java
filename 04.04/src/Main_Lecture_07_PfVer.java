import java.util.Scanner;

public class Main_Lecture_07_PfVer {

	public static void main(String[] args) {
		Main_Lecture_07_Student[] student = new Main_Lecture_07_Student[30];
		
		for (int i = 0; i < student.length; i++) {
			student[i] = new Main_Lecture_07_Student();

			Scanner scanner = new Scanner(System.in);
			String inputText = "";
			System.out.println("이름을 입력해주세요.");
			inputText = scanner.nextLine();
			student[i].name = inputText;
			
			
			System.out.println("국어 점수를 입력해주세요.");
			inputText = scanner.nextLine();
			student[i].kor = Integer.parseInt(inputText);

			System.out.println("수학 점수를 입력해주세요.");
			inputText = scanner.nextLine();
			student[i].math = Integer.parseInt(inputText);

			System.out.println("영어 점수를 입력해주세요.");
			inputText = scanner.nextLine();
			student[i].eng = Integer.parseInt(inputText);

		}

		int korTotal = 0, engTotal = 0, mathTotal = 0;
		for(int i = 0; i < student.length; i++) {
			korTotal = korTotal + student[i].kor;
			engTotal = korTotal + student[i].eng;
			mathTotal = korTotal + student[i].math;
		}
		
		System.out.println("국어 점수 총점 : " + korTotal + "평균 : "+ korTotal / (double)student.length);
		System.out.println("영어 점수 총점 : " + korTotal + "평균 : "+ engTotal / (double)student.length);
		System.out.println("수학 점수 총점 : " + korTotal + "평균 : "+ mathTotal / (double)student.length);
		
		
		
	}
}