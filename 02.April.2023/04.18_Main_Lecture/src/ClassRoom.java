import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ClassRoom {
	String name;
	Student[] student = new Student[100];
	int index = 0;
	int middleScoreTotal = 0;
	int lastScoreTotal = 0;
	double avgMidTest = 0;
	double avgLastTest = 0;

	ClassRoom() {
//		student = new Student[100];
	}

	ClassRoom(String name) {
		this.name = name;
	}

	public String calcTotal() {
		this.middleScoreTotal = 0;
		this.lastScoreTotal = 0;
		this.avgMidTest = 0;
		this.avgLastTest = 0;
		for (int i = 0; i < this.index; i++) {
			this.middleScoreTotal = this.middleScoreTotal + this.student[i].test[0].total;
			this.lastScoreTotal = this.lastScoreTotal + this.student[i].test[1].total;
		}
		return "중간고사 총점 : " + this.middleScoreTotal + " 기말고사 총점 : " + this.lastScoreTotal;
	}

	public String avgCalc() {
		this.avgMidTest = 0;
		this.avgLastTest = 0;
		if (this.index == 0) {
			this.avgMidTest = 0;
			this.avgLastTest = 0;
		} else {
			this.avgMidTest = this.middleScoreTotal / ((double) this.index * 3);
			this.avgLastTest = this.lastScoreTotal / ((double) this.index * 3);
		}
		return "중간고사 평균 : " + ((int)(this.avgMidTest*100)/100.0) + " 기말고사 평균 : " + (((int)this.avgLastTest*100)/100.0);
	}
	public void addStudent() {
		System.out.println("추가할 학생 정보를 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름 : ");
		String name = scanner.nextLine();
		System.out.println("성별 (남자 or 여자) : ");
		String sex = scanner.nextLine();
		System.out.println("주소 (서울, 부산 ...) : ");
		String address = scanner.nextLine();
		this.student[this.index] = new Student(name, sex, address);
		this.index++;
	}

	public void showMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("[1] 학생 추가 | [2] 학생 목록 조회 | [3] 시험 성적 입력 | [4] 시험 통계 조회" + " [5] 성적순 정보 조회");
		String selectMenu = scanner.nextLine();
		if (selectMenu.equals("1")) {
			this.addStudent();
		} else if (selectMenu.equals("2")) {
			this.printStudents();
		} else if (selectMenu.equals("3")) {
			this.inputScore();
		} else if (selectMenu.equals("4")) {
			System.out.println(this.calcTotal());
			System.out.print(this.avgCalc());
		} else if(selectMenu.equals("5")) {
			this.testInfo();
		}
		else {
			System.out.println("입력이 잘못되었습니다.");
		}
	}

	public void printStudents() {
		for (int i = 0; i < this.index; i++) {
			System.out.println(i + " : " + student[i].toString());
			// 객체 뒤에 생략돼있으면 toString이 자동 적용된다.
		}

	}

	public String toString() {
		return this.name + "(" + this.index + "명)";
	}

	public void inputScore() {
		this.printStudents();
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력을 원하는 학생의 번호를 입력해주세요.");
		String selectStudent = scanner.nextLine();
		int selectStudentNumber = Integer.parseInt(selectStudent);
		if (this.student[selectStudentNumber] != null) {
			this.student[selectStudentNumber].showMenu();
		}
			else {
			System.out.println("해당하는 번호의 학생 정보가 존재하지 않습니다.");
		}
		
	}
	public void testInfo() {
		int[] arr01 = new int[index];
		int[] arr02 = new int[index];
		for(int i = 0; i < index; i++) {
			arr01[i] = this.student[i].test[0].total + this.student[i].test[1].total;
			arr02[i] = i;
		}
		
		for(int i = 0; i < index; i++) {
			for (int j = 0; j < index; j++){
				if(i != j && arr01[i] > arr01[j]) {
					int temp = 0;
					int temp2 = 0;
					temp = arr01[i];
					temp2 = arr02[i];
					arr01[i] = arr01[j];
					arr02[i] = arr02[j];
					arr01[j] = temp;
					arr02[j] = temp2;
				}
			}
		}
		System.out.println("시험 총점이 높은 학생 순으로 학생 인덱스 번호를 출력합니다.");
		System.out.println(Arrays.toString(arr02));
		System.out.println("시험 총점이 높은 순으로 총점 정보를 출력합니다.");
		System.out.println(Arrays.toString(arr01));
		for(int i = 0; i < this.index; i++) {
			System.out.println(student[arr02[i]].name + " " + arr01[i] + "점 " + " " + (i+1) + "등");
		}
	}

}