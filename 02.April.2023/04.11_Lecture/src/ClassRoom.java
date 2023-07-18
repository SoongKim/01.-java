import java.util.Arrays;
import java.util.Scanner;

//1학년 내 클래스
public class ClassRoom {

	String name;// A반, B반, C반...
	Student[] student = new Student[100];

	public static void main(String[] args) {

		ClassRoom classroom = new ClassRoom();
		for (int j = 0; j < classroom.student.length; j++) {
			classroom.student[j] = new Student();
		}
		Scanner scanner = new Scanner(System.in);
//		System.out.println("학급을 선택해주세요.");
//		String classNum = scanner.next();
//		System.out.println(classNum + "번 학급으로 연결합니다.");
		int scoreIndex = 0;
		int infoIndex = 0;

		System.out.println(classroom.student[5].address);

		for (int i = 0; i < 99999; i++) {
			System.out.println("---------------------통합학생정보포탈입니다.---------------------");
			System.out.println("원하시는 메뉴를 선택해주세요.");
			System.out.println("[1] 학생정보 조회/입력");
			System.out.println("[2] 전체 성적 정보 조회");
			System.out.println("[3] 통계 정보 조회");
//			System.out.println("[4] 조회 학급 변경");
			System.out.println("[0] 종료");
			String menuSelect = scanner.next();
			if (menuSelect.equals("1")) {
				System.out.println("[1] 학생 인적 정보 입력 | [2] 학생 인적 정보 조회 | [3] 학생 성적 정보 입력 | [4] 학생 성적 정보 조회");
				String menuSelect2 = scanner.next();
				if (menuSelect2.equals("2")) {
					System.out.println("학생 정보를 조회합니다.");
					System.out.println("몇 번 학생을 확인할까요?");
					String studentNum = scanner.next();
					if (classroom.student[Integer.parseInt(studentNum)].name == null) {
						System.out.println("아직 입력되지 않은 학생을 조회하셨습니다.");
					} else {
						int stuNum = Integer.parseInt(studentNum);
						System.out.println("해당 학생의 이름 : " + classroom.student[stuNum].name + " | 해당 학생의 거주지역 : "
								+ classroom.student[stuNum].address + " | 해당 학생의 성별 : "
								+ classroom.student[stuNum].gender + "성");
						System.out.println();
					}
				} else if (menuSelect2.equals("1")) {
					classroom.student[infoIndex].studentInput();
					infoIndex++;
				} else if (menuSelect2.equals("3")) {
					System.out.println("점수 정보를 입력할 학생의 번호를 입력해주세요.");
					String studentNumber = scanner.next();
					if (Integer.parseInt(studentNumber) < 100 && Integer.parseInt(studentNumber) >= 0) {
						classroom.student[Integer.parseInt(studentNumber)].testInfo();
					}
				} else if (menuSelect2.equals("4")) {
					System.out.println("몇 번 학생의 점수를 확인할까요?");
					String selUser = scanner.next();
					if (Integer.parseInt(selUser) < 100 && Integer.parseInt(selUser) >= 0) {
						int selUser2 = Integer.parseInt(selUser);
						System.out.println("학기와 시험 구분을 입력해주세요.");
						System.out.println("[1]: 1학기 중간고사 | [2] 1학기 기말고사 | [3] 2학기 중간고사 | [4] 2학기 기말고사");
						String selUser3 = scanner.next();

						if (selUser3.equals("1")) {
							if (classroom.student[selUser2].test[0] == null) {
								System.out.println("아직 입력하지 않은 성적 정보를 조회하셨습니다.");
							} else {
								System.out.println("선택하신 학생의");
								System.out.println(
										"1학기 중간고사 국어 성적은 : " + classroom.student[selUser2].test[0].korScore + "점");
								System.out.println(
										"1학기 중간고사 영어 성적은 : " + classroom.student[selUser2].test[0].engScore + "점");
								System.out.println(
										"1학기 중간고사 수학 성적은 : " + classroom.student[selUser2].test[0].mathScore + "점");
							}
						} else if (selUser3.equals("2")) {
							if (classroom.student[selUser2].test[1] == null) {
								System.out.println("아직 입력하지 않은 성적 정보를 조회하셨습니다.");
							} else {
								System.out.println(
										"1학기 기말고사 국어 성적은 : " + classroom.student[selUser2].test[1].korScore + "점");
								System.out.println(
										"1학기 기말고사 영어 성적은 : " + classroom.student[selUser2].test[1].engScore + "점");
								System.out.println(
										"1학기 기말고사 수학 성적은 : " + classroom.student[selUser2].test[1].mathScore + "점");
							}
						} else if (selUser3.equals("3")) {
							if (classroom.student[selUser2].test[0].korScore == 0) {
								System.out.println("아직 입력되지 않은 성적 정보를 조회하셨습니다.");
							} else {
								System.out.println(
										"2학기 중간고사 국어 성적은 : " + classroom.student[selUser2].test[2].korScore + "점");

								System.out.println(
										"2학기 중간고사 영어 성적은 : " + classroom.student[selUser2].test[2].engScore + "점");
								System.out.println(
										"2학기 중간고사 수학 성적은 : " + classroom.student[selUser2].test[2].mathScore + "점");
							}
						} else if (selUser3.equals("4")) {
							if (classroom.student[selUser2].test[0].korScore == 0) {
								System.out.println("아직 입력되지 않은 성적 정보를 조회하셨습니다.");
							} else {
								System.out.println(
										"2학기 기말고사 국어 성적은 : " + classroom.student[selUser2].test[3].korScore + "점");
								System.out.println(
										"2학기 기말고사 영어 성적은 : " + classroom.student[selUser2].test[3].engScore + "점");
								System.out.println(
										"1학기 기말고사 수학 성적은 : " + classroom.student[selUser2].test[3].mathScore + "점");
							}
						} else {
							System.out.println("올바른 값을 입력해주세요.");
						}
					}
				}
			} else if (menuSelect.equals("2")) {
				int kor1 = 0, kor2 = 0, kor3 = 0, kor4 = 0;
				int eng1 = 0, eng2 = 0, eng3 = 0, eng4 = 0;
				int math1 = 0, math2 = 0, math3 = 0, math4 = 0;
				int index1 = 0, index2 = 0, index3 = 0, index4 = 0;

				System.out.println("학급 전체 성적 정보를 출력합니다.");
				System.out.println("[1] 1학기 중간고사 [2] 1학기 기말고사 [3] 2학기 중간고사 [4] 2학기 기말고사");
				String userSelect = scanner.next();
				if (userSelect.equals("1")) {
					for (int j = 0; j < scoreIndex; j++) {
						kor1 = kor1 + classroom.student[j].test[0].korScore;
						eng1 = eng1 + classroom.student[j].test[0].engScore;
						math1 = math1 + classroom.student[j].test[0].mathScore;
						index1 = index1 + classroom.student[j].scoreIndex1;
					}
					System.out
							.println("국어 점수 총합 : " + kor1 + "점 | 영어 점수 총합 : " + eng1 + "점 | 수학 점수 총합 : " + math1 + "점");
					System.out.println("국어 점수 평균 : " + (double) kor1 / (double) index1 + "점 | 영어 점수 평균 : "
							+ (double) eng1 / (double) index1 + "점 | 수학 점수 평균 : " + (double) math1 / (double) index1);
				} else if (userSelect.equals("2")) {
					for (int j = 0; j < scoreIndex; j++) {
						kor2 = kor2 + classroom.student[j].test[1].korScore;
						eng2 = eng2 + classroom.student[j].test[1].engScore;
						math2 = math2 + classroom.student[j].test[1].mathScore;
						index2 = index2 + classroom.student[j].scoreIndex2;
					}
					System.out
							.println("국어 점수 총합 : " + kor2 + "점 | 영어 점수 총합 : " + eng2 + "점 | 수학 점수 총합 : " + math2 + "점");
					System.out.println("국어 점수 평균 : " + (double) kor2 / (double) index2 + "점 | 영어 점수 평균 : "
							+ (double) eng2 / (double) index2 + "점 | 수학 점수 평균 : " + (double) math2 / (double) index2);
				} else if (userSelect.equals("3")) {
					for (int j = 0; j < scoreIndex; j++) {
						kor3 = kor3 + classroom.student[j].test[2].korScore;
						eng3 = eng3 + classroom.student[j].test[2].engScore;
						math3 = math3 + classroom.student[j].test[2].mathScore;
						index3 = index3 + classroom.student[j].scoreIndex3;
					}
					System.out
							.println("국어 점수 총합 : " + kor3 + "점 | 영어 점수 총합 : " + eng3 + "점 | 수학 점수 총합 : " + math3 + "점");
					System.out.println("국어 점수 평균 : " + (double) kor3 / (double) index3 + "점 | 영어 점수 평균 : "
							+ (double) eng3 / (double) index3 + "점 | 수학 점수 평균 : " + (double) math3 / (double) index3);
				} else if (userSelect.equals("4")) {
					for (int j = 0; j < scoreIndex; j++) {
						kor4 = kor4 + classroom.student[j].test[3].korScore;
						eng4 = eng4 + classroom.student[j].test[3].engScore;
						math4 = math4 + classroom.student[j].test[3].mathScore;
						index4 = index4 + classroom.student[j].scoreIndex4;
					}
					System.out
							.println("국어 점수 총합 : " + kor4 + "점 | 영어 점수 총합 : " + eng4 + "점 | 수학 점수 총합 : " + math4 + "점");
					System.out.println("국어 점수 평균 : " + (double) kor4 / (double) index4 + "점 | 영어 점수 평균 : "
							+ (double) eng4 / (double) index4 + "점 | 수학 점수 평균 : " + (double) math4 / (double) index4);
				} else {
					System.out.println("올바른 값을 입력해주세요.");
				}

			} else if (menuSelect.equals("3")) {

//			} else if (menuSelect.equals("4")) {
//				ClassRoom.main(args);
			} else if (menuSelect.equals("0")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}

}
