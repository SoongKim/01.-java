import java.util.ArrayList;
import java.util.Scanner;

public class MainClasss {

	public static void main(String[] args) {
		Student[] student = { new Student("A", 80), 
				new Student("B", 80), 
				new Student("C", 80),
				new Student("D", 80), 
				new Student("E", 80), 
				new Student("F", 80), 
				new Student("G", 80),
				new Student("H", 80), 
				new Student("I", 80), 
				new Student("J", 80), 
				new Student("K", 80),
				new Student("L", 80), 
				new Student("M", 80), 
				new Student("N", 80), 
				new Student("O", 80),
				new Student("P", 80), 
				new Student("Q", 80), 
				new Student("R", 80), 
				new Student("S", 80),
				new Student("T", 80) };

		ArrayList<ClassRoom> classRoom = new ArrayList<ClassRoom>();
		classRoom.add(new ClassRoom("A반"));
		classRoom.add(new ClassRoom("B반"));
		classRoom.add(new ClassRoom("C반"));

		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 999999; i++) {
			System.out.println("1 : 학생 선택");
			System.out.println("q : 종료");
			String menuSel = scanner.next();
			if (menuSel.equals("1")) {
				for (int j = 0; j < student.length; j++) {
					System.out.println(j + " 번 : " + student[j].name);
				}
				System.out.println("학생 번호 : ");
				String selectStudent = scanner.next();
				int selectStudentNumber = Integer.parseInt(selectStudent);
				
				for(int j = 0; j < classRoom.size(); j++) {
					System.out.println("" + j + " : " + classRoom.get(j).name);
				}
				System.out.println("반 번호 : ");
				String selectClassRoom = scanner.next();
				int selectClassRoomNumber = Integer.parseInt(selectClassRoom);
				ClassRoom sClassRoom = classRoom.get(selectClassRoomNumber);
				Student sStudent = student[selectStudentNumber];
				sClassRoom.student.add(sStudent);
			} else if (menuSel.equals("q")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}

	}

}
