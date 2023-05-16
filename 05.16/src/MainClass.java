import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// Class(학급정보)를 담는 ArrayList를 선언
		ArrayList<Class> cls = new ArrayList<Class>();
		// Student(학생정보)를 담는 ArrayList를 선언
		ArrayList<Student> stu = new ArrayList<Student>();
		// 난수 생성기 - 학생 성적 입력 간 사용 - 와 스캐너 클래스를 호출
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		// student 초기값을 설정. index : 0~9는 앞에 0을 붙이고, 10~19는 그대로 "학생" 뒤에 붙여 이름을 설정
		// score(성적) 값은 0~100 사이 난수를 받아 설정
		for (int c1 = 0; c1 < 20; c1++) {
			if (c1 < 10) {
				stu.add(new Student("학생 " + "0" + c1, random.nextInt(101)));
			} else {
				stu.add(new Student("학생 " + c1, random.nextInt(101)));
			}
		}
		for (int i = 0; i < 999999; i++) {
			System.out.println("학생정보포털입니다.");
			System.out.println("원하시는 메뉴를 선택해주세요.");
			System.out.println(
					"[1] 전체 학생 명부 출력 | [2] 반 생성 | [3] 반 편성 | [4] 반별 학생 목록 출력 | [5] 반별 총점 출력 | [6] 반별 평균 출력 | [9] 프로그램 종료");
			// userSelNum 변수에 유저가 선택한 메뉴 데이터를 담는다.
			String userSelNum = scanner.next();
			if (userSelNum.equals("1")) {
				// 만약 userSelNum이 1이라면, Student 클래스의 printInfo를 student ArrayList 크기만큼 반복
				// printInfo는 String 타입으로 학생 이름과 점수 데이터를 return하는 메소드.
				for (int j = 0; j < stu.size(); j++) {
					System.out.println(stu.get(j).printInfo());
				}
			} else if (userSelNum.equals("2")) {
				// 만약 userSelNum이 2라면, scanner로 입력받은 값을 Class의 이름으로 하여 새로운 Class 클래스를 생성(학급 생성)
				// ArrayList<Class>에 저장된다.
				System.out.println("생성하실 반 이름을 입력해주세요.");
				cls.add(new Class(scanner.next()));
			} else if (userSelNum.equals("3")) {
				// 만약 userSelNum이 3과 같다면 아래를 실행
				// 만약 Class를 담은 ArrayList의 크기가 0이라면, 아직 아무런 학급도 만들어지지 않았으므로
				// 학생을 학급에 편성하지 않고, 상황을 종료한다.
				if (cls.size() == 0) {
					System.out.println("아직 반 생성이 이뤄지지 않았습니다.");
					System.out.println("메인 화면으로 돌아갑니다.");
				} else {
					// cls.size() != 0이라면
					System.out.println("몇 번 학생을 대상으로 할까요?");
					// student ArrayList로부터 각 객체의 이름 데이터만을 출력한다.
					// 만약 해당 Student 클래스의 selected 변수가 false라면 아직 편성이 이뤄지지 않은 학생이므로 출력하고,
					// 해당 변수가 true인 경우는 이미 편성이 완료되었으므로 출력하지 아니한다.
					for (int c = 0; c < stu.size(); c++) {
						if (stu.get(c).selected == false) {
							System.out.println(c + "번 : " + stu.get(c).name);
						}
					}
					// scanner를 사용하여 유저로부터 대상 학생의 인덱스 번호 데이터를 받아서 대상 학생을 설정
					// 만약 편성이 완료되어 출력하지 않은 학생의 번호를 선택하면, 안내 메시지를 출력
					try {
						String studentSel = scanner.next();
						if (stu.get(Integer.parseInt(studentSel)).selected == true) {
							System.out.println("이미 편성이 완료된 학생입니다.");
						} else {
							int studentIndex = Integer.parseInt(studentSel);
							// 위와 동일한 로직으로 cls.size() 만큼 반 번호와 이름을 출력하고
							System.out.println("몇 반에 학생을 편성할까요?");
							for (int x = 0; x < cls.size(); x++) {
								System.out.println(x + " 반 " + cls.get(x).name);
							}
							// scanner를 사용하여 사용자로부터 대상 반 번호 데이터를 받아와
							// 해당 인덱스 번호를 지니는 학급의 student ArrayList에 위에서 타겟으로 설정한 학생 객체 데이터를 이관.
							// 오류 발생 시 에러 문구를 출력
							try {
								String selectedClass = scanner.next();
								cls.get(Integer.parseInt(selectedClass)).student
										.add(stu.get(Integer.parseInt(studentSel)));
								stu.get(studentIndex).selected = true;
							} catch (Exception e) {
								System.out.println("Error Occured!");
							}
						}
					} catch (Exception e) {
						System.out.println("Error Occured!");
					}
				}
				// 이하 로직 상동. 호출 method만 달라집니다.
			} else if (userSelNum.equals("4")) {
				if (cls.size() == 0) {
					System.out.println("아직 반 생성이 이뤄지지 않았습니다.");
					System.out.println("메인 화면으로 돌아갑니다.");
				} else {
					System.out.println("몇 반을 조회할까요?");
					for (int x = 0; x < cls.size(); x++) {
						System.out.println(x + " 반 " + cls.get(x).name);
					}
					try {
						String selectClass = scanner.next();
						int selIndex = Integer.parseInt(selectClass);
						if (cls.get(selIndex).student.size() == 0) {
							System.out.println(cls.get(selIndex).name + "반에 아직 학생이 편성되지 않았습니다.");
						} else {
							cls.get(selIndex).printInfo();
						}
					} catch (Exception e) {
						System.out.println("Error Occured!");
					}
				}
			} else if (userSelNum.equals("5")) {
				if (cls.size() == 0) {
					System.out.println("아직 반 생성이 이뤄지지 않았습니다.");
					System.out.println("메인 화면으로 돌아갑니다.");
				} else {
					System.out.println("몇 반의 총점을 조회할까요?");
					for (int x = 0; x < cls.size(); x++) {
						System.out.println(x + " 반 " + cls.get(x).name);
					}
					try {
						String selectClass = scanner.next();
						int classIndex = Integer.parseInt(selectClass);
						if (cls.get(classIndex).student.size() == 0) {
							System.out.println(cls.get(classIndex).name + " 반에 아직 학생이 편성되지 않았습니다.");
						} else {
							System.out.println(classIndex + " 반의 총점은 : " + cls.get(classIndex).printTotalScore());
						}
					} catch (Exception e) {
						System.out.println("Error Occured!");
					}
				}
			} else if (userSelNum.equals("6")) {
				if (cls.size() == 0) {
					System.out.println("아직 반 생성이 이뤄지지 않았습니다.");
					System.out.println("메인 화면으로 돌아갑니다.");
				} else {
					for (int z = 0; z < cls.size(); z++) {
						System.out.println(z + " 번 " + cls.get(z).name);
					}
					System.out.println("몇 반의 평균 점수를 조회할까요?");
					try {
						String classSelect = scanner.next();
						int selNum = Integer.parseInt(classSelect);
						if (cls.get(selNum).student.size() == 0) {
							System.out.println("반에 편성된 학생이 존재하지 않습니다.");
						} else {
							cls.get(selNum).printAvgScore();
							System.out.println(selNum + " 번 " + cls.get(selNum).name + "반의 평균 점수는 "
									+ cls.get(selNum).avgScore + "점");
						}
					} catch (Exception e) {
						System.out.println("Error Occured!");
					}
				}
			} else if (userSelNum.equals("9")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("Error Occured!");
			}
			System.out.println();
		}

	}
}