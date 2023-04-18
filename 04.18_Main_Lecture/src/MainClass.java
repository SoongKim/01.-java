import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		ClassRoom[] classRoom = { new ClassRoom("A반"), new ClassRoom("B반"), new ClassRoom("C반"), new ClassRoom("D반"),
				new ClassRoom("E반") };
//		Student[] sTemp = {new Student("홍길동", "남자", "서울"), new Student("둘리", "남자", "부산"), new Student("또치", "남자", "부산")};
//		classRoom[0].student = sTemp;

//		for(int i = 0; i < 999999; i++) {
//			Scanner scanner = new Scanner(System.in);
//			System.out.println("학급 관리 프로그램입니다.");
//			System.out.println("원하시는 메뉴를 선택해주세요.");
//			System.out.println("[1] 학생 정보 입력 [2] 학급 인원 명부 출력 [3] 종료");
//			String userInput = scanner.next();
//			if(userInput.equals("1")) {
//				System.out.println("원하시는 학급 인덱스를 입력해주세요.");
//				for(int e = 0; e < classRoom.length; e++) {
//					System.out.println(e + " : " + classRoom[e].name);
//				}
////				System.out.println("A반:0 | B반:1 | C반:2 | D반:3 | E반:4");
//				int classNum = Integer.parseInt(scanner.next());
//				classRoom[classNum].addStudent();
//			}
//			else if(userInput.equals("2")) {
//				System.out.println("조회를 원하시는 학급 인덱스를 입력해주세요.");
//				System.out.println("A반:0 | B반:1 | C반:2 | D반:3 | E반:4");
//				int infoNum = Integer.parseInt(scanner.next());
//				System.out.println(classRoom[infoNum].name + " 명부를 출력합니다.");
//				for(int j = 0; j < classRoom[infoNum].index; j++) {
//					System.out.println(classRoom[infoNum].student[j].name);
//				}
//			}
//			else if(userInput.equals("3")) {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			}
//		}

		for (int i = 0; i < 999999; i++) {
			System.out.println("----------전체 반 목록----------");
			for (int k = 0; k < classRoom.length; k++) {
				System.out.println(k + " : " + classRoom[k]);
			}
			System.out.println("원하시는 학급을 선택해주세요.");
			Scanner scanner = new Scanner(System.in);
			int menuSel = Integer.parseInt(scanner.nextLine());
			classRoom[menuSel].showMenu();
			System.out.println();
			System.out.println();
		}
	}
}
