import java.util.Scanner;

public class ClassRoom {
	String name;
	Student[] student = new Student[100];
	int index = 0;
	// index : 현재 해당 학급에 몇 명이 존재하는지 기록하는 변수
	
	ClassRoom(String name) {
		this.name = name;
	}
	
	public void addStudent() {
		System.out.println("추가할 학생 정보를 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름");
		String name = scanner.nextLine();
		System.out.println("성별 ( 남자 or 여자)");
		String sex = scanner.nextLine();
		System.out.println("주소(서울, 부산, 강원...)");
		String address = scanner.nextLine();
		this.student[this.index] = new Student(name, sex, address);
		this.index++;
	}
}