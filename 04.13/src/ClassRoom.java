import java.util.Scanner;

public class ClassRoom {

	String name;// A반, B반, C반...
	Student[] student = new Student[100];

	public void main() {
		// TODO Auto-generated method stub
		ClassRoom classroom = new ClassRoom();
		for (int i = 0; i < 100; i++) {
			classroom.student[i] = new Student();
		}
		for (int j = 0; j < 999999; j++) {
			System.out.println("통합 학생 정보 포탈입니다.");
			System.out.println("원하시는 메뉴를 선택해주세요.");
			System.out.println("[1] 학생 정보 입력");
			System.out.println("[2] 학생 정보 조회");
			System.out.println("[3] 학생 통합 성적 조회");
			System.out.println("[4] 학급 통합 성적 조회");
			System.out.println("[5] 프로그램 종료");
			Scanner scanner = new Scanner(System.in);
			String menuSel = scanner.next();
			if (menuSel.equals("1")) {
				System.out.println("학생 정보 입력을 선택하셨습니다.");
				System.out.println("원하시는 메뉴를 선택해주세요.");
				System.out.println("[1] 학생 인적 정보 입력");
				System.out.println("[2] 학생 성적 정보 입력");
				String infoSel = scanner.next();
				if (infoSel.equals("1")) {
					System.out.println("몇 번 학생의 정보를 입력할까요?");
					int stuNum = Integer.parseInt(scanner.next());
					classroom.student[stuNum].infoInput();
					classroom.student[stuNum].regionInput();
					classroom.student[stuNum].genderInput();
				} else if (infoSel.equals("2")) {
					System.out.println("몇 번 학생의 성적을 입력할까요?");
					int stuNum02 = Integer.parseInt(scanner.next());
					classroom.student[stuNum02].testInput();
				}
			} else if (menuSel.equals("2")) {
				System.out.println("원하시는 메뉴를 선택하세요.");
				System.out.println("[1] 학생 인적 정보 조회");
				System.out.println("[2] 학생 성적 정보 조회");
				String menuSelNum = scanner.next();
				if (menuSelNum.equals("1")) {
					System.out.println("몇 번 학생의 인적 정보를 불러올까요?");
					int stuNum = Integer.parseInt(scanner.next());
					if (classroom.student[stuNum].infoYn == true) {
						System.out.println(classroom.student[stuNum].name);
						System.out.println(classroom.student[stuNum].address);
						System.out.println(classroom.student[stuNum].gender);
					} else {
						System.out.println("아직 입력하지 않은 학생을 조회하셨습니다.");
					}
				} else if (menuSelNum.equals("2")) {
					System.out.println("몇 번 학생의 성적 정보를 불러올까요?");
					int stuNum03 = Integer.parseInt(scanner.next());
					System.out.println("조회하실 성적의 학기와 고사를 선택해주세요.");
					System.out.println("[0] 1학기_중간 [1] 1학기_기말 [2] 2학기_중간 [3] 2학기_기말");
					String userSels = scanner.next();
					if (userSels.equals("0")) {
						if (classroom.student[stuNum03].test0 == true) {
							System.out.println(classroom.student[stuNum03].test[0].testName + " " + classroom.student[stuNum03].test[0].korTest + " : " + classroom.student[stuNum03].test[0].korScore);
							System.out.println(classroom.student[stuNum03].test[0].testName + " " + classroom.student[stuNum03].test[0].engTest + " : " + classroom.student[stuNum03].test[0].engScore);
							System.out.println(classroom.student[stuNum03].test[0].testName + " " + classroom.student[stuNum03].test[0].mathTest + " : " + classroom.student[stuNum03].test[0].mathScore);
						} else if (classroom.student[stuNum03].test0 == false) {
							System.out.println("아직 입력되지 않은 성적 정보를 조회하셨습니다.");
						}
					} else if (userSels.equals("1")) {
						if (classroom.student[stuNum03].test1 == true) {
							System.out.println(classroom.student[stuNum03].test[1].testName + " " + classroom.student[stuNum03].test[1].korTest + " : " + classroom.student[stuNum03].test[1].korScore);
							System.out.println(classroom.student[stuNum03].test[1].testName + " " + classroom.student[stuNum03].test[1].engTest + " : " + classroom.student[stuNum03].test[1].engScore);
							System.out.println(classroom.student[stuNum03].test[1].testName + " " + classroom.student[stuNum03].test[1].mathTest + " : " + classroom.student[stuNum03].test[1].mathScore);
						} else if (classroom.student[stuNum03].test1 == false) {
							System.out.println("아직 입력되지 않은 성적 정보를 조회하셨습니다.");
						}
					} else if (userSels.equals("2")) {
						if (classroom.student[stuNum03].test2 == true) {
							System.out.println(classroom.student[stuNum03].test[2].testName + " " + classroom.student[stuNum03].test[2].korTest + " : " + classroom.student[stuNum03].test[2].korScore);
							System.out.println(classroom.student[stuNum03].test[2].testName + " " + classroom.student[stuNum03].test[2].engTest + " : " + classroom.student[stuNum03].test[2].engScore);
							System.out.println(classroom.student[stuNum03].test[2].testName + " " + classroom.student[stuNum03].test[2].mathTest + " : " + classroom.student[stuNum03].test[2].mathScore);
						} else if (classroom.student[stuNum03].test2 == false) {
							System.out.println("아직 입력되지 않은 성적 정보를 조회하셨습니다.");
						}
					} else if (userSels.equals("3")) {
						if (classroom.student[stuNum03].test3 == true) {
							System.out.println(classroom.student[stuNum03].test[3].testName + " " + classroom.student[stuNum03].test[3].korTest + " : " + classroom.student[stuNum03].test[3].korScore);
							System.out.println(classroom.student[stuNum03].test[3].testName + " " + classroom.student[stuNum03].test[3].engTest + " : " + classroom.student[stuNum03].test[3].engScore);
							System.out.println(classroom.student[stuNum03].test[3].testName + " " + classroom.student[stuNum03].test[3].mathTest + " : " + classroom.student[stuNum03].test[3].mathScore);
						} else if (classroom.student[stuNum03].test3 == false) {
							System.out.println("아직 입력되지 않은 성적 정보를 조회하셨습니다.");
						}
					} else {
						System.out.println("올바른 정보를 입력해주세요.");
					}
				}

			} else if (menuSel.equals("3")) {
				System.out.println("학생 통합 성적 조회를 선택하셨습니다.");
				System.out.println("몇 번 학생의 성적을 조회할까요?");
				int userNums = Integer.parseInt(scanner.next());
				int index = 0;
				if (classroom.student[userNums].test0 == true) {
					index++;
				}
				if (classroom.student[userNums].test1 == true) {
					index++;
				}
				if (classroom.student[userNums].test2 == true) {
					index++;
				}
				if (classroom.student[userNums].test3 == true) {
					index++;
				}
				int korscore = 0, engscore = 0, mathscore = 0;
				for (int i = 0; i < 4; i++) {
					korscore = korscore + classroom.student[userNums].test[i].korScore;
					engscore = engscore + classroom.student[userNums].test[i].engScore;
					mathscore = mathscore + classroom.student[userNums].test[i].mathScore;
				}
				
				double korAvg = korscore / (double) index;
				double engAvg = engscore / (double) index;
				double mathAvg = korscore / (double) index;
				System.out.println(userNums + "번 학생이 취득한 국어 평균 점수는 " + korAvg);
				System.out.println(userNums + "번 학생이 취득한 영어 평균 점수는" + engAvg);
				System.out.println(userNums + "번 학생이 취득한 수학 평균 점수는" + mathAvg);
				
			} else if (menuSel.equals("4")) {
				System.out.println("학급 통합 성적 조회를 선택하셨습니다.");
				double index1 = 0, index2 = 0, index3 = 0, index4 = 0;
				int korFstMid = 0, korFstFin = 0, korSndMid = 0, korSndFin = 0;
				int engFstMid = 0, engFstFin = 0, engSndMid = 0, engSndFin = 0;
				int mathFstMid = 0, mathFstFin = 0, mathSndMid = 0, mathSndFin = 0;
				for (int i = 0; i < 100; i++) {
					if (classroom.student[i].test0 == true) {
						index1++;
						korFstMid = korFstMid + classroom.student[i].test[0].korScore;
						engFstMid = engFstMid + classroom.student[i].test[0].engScore;
						mathFstMid = mathFstMid + classroom.student[i].test[0].mathScore;
					} 
					if (classroom.student[i].test1 == true) {
						index2++;
						korFstFin = korFstFin + classroom.student[i].test[1].korScore;
						engFstFin = engFstFin + classroom.student[i].test[1].engScore;
						mathFstFin = mathFstFin + classroom.student[i].test[1].mathScore;
					}
					if (classroom.student[i].test2 == true) {
						index3++;
						korFstMid = korSndMid + classroom.student[i].test[2].korScore;
						engSndMid = engSndMid + classroom.student[i].test[2].engScore;
						mathSndMid = mathSndMid + classroom.student[i].test[2].mathScore;
					}
					if (classroom.student[i].test3 == true) {
						index4++;
						korSndFin = korSndFin + classroom.student[i].test[3].korScore;
						engSndFin = engSndFin + classroom.student[i].test[3].engScore;
						mathSndFin = mathSndFin + classroom.student[i].test[3].mathScore;
					}
				}
				
				System.out.println("학급 1학기 중간고사 국어 총점은 : " + korFstMid);
				System.out.println("학급 1학기 기말고사 국어 총점은 : " + korFstFin);
				System.out.println("학급 2학기 중간고사 국어 총점은 : " + korSndMid);
				System.out.println("학급 2학기 기말고사 국어 총점은 : " + korSndFin);
				System.out.println();
				System.out.println("학급 1학기 중간고사 영어 총점은 : " + engFstMid);
				System.out.println("학급 1학기 기말고사 영어 총점은 : " + engFstFin);
				System.out.println("학급 2학기 중간고사 영어 총점은 : " + engSndMid);
				System.out.println("학급 2학기 기말고사 영어 총점은 : " + engSndFin);
				System.out.println();
				System.out.println("학급 1학기 중간고사 수학 총점은 : " + mathFstMid);
				System.out.println("학급 1학기 기말고사 수학 총점은 : " + mathFstFin);
				System.out.println("학급 2학기 중간고사 수학 총점은 : " + mathSndMid);
				System.out.println("학급 2학기 기말고사 수학 총점은 : " + mathSndFin);
				System.out.println();

				double korFstMidAvg = korFstMid / index1;
				double korFstFinAvg = korFstFin / index2;
				double korSndMidAvg = korSndMid / index3;
				double korSndFinAvg = korSndFin / index4;
				double engFstMidAvg = engFstMid / index1;
				double engFstFinAvg = engFstFin / index2;
				double engSndMidAvg = engSndMid / index3;
				double engSndFinAvg = engSndFin / index4;
				double mathFstMidAvg = mathFstMid / index1;
				double mathFstFinAvg = mathFstFin / index2;
				double mathSndMidAvg = mathSndMid / index3;
				double mathSndFinAvg = mathSndFin / index4;

				System.out.println("학급 1학기 중간고사 국어 평균 점수는 " + korFstMidAvg);
				System.out.println("학급 1학기 기말고사 국어 평균 점수는 " + korFstFinAvg);
				System.out.println("학급 2학기 중간고사 국어 평균 점수는 " + korSndMidAvg);
				System.out.println("학급 2학기 기말고사 국어 평균 점수는 " + korSndFinAvg);
				System.out.println();
				System.out.println("학급 1학기 중간고사 영어 평균 점수는 " + engFstMidAvg);
				System.out.println("학급 1학기 기말고사 영어 평균 점수는 " + engFstFinAvg);
				System.out.println("학급 2학기 중간고사 영어 평균 점수는 " + engSndMidAvg);
				System.out.println("학급 2학기 기말고사 영어 평균 점수는 " + engSndFinAvg);
				System.out.println();
				System.out.println("학급 1학기 중간고사 수학 평균 점수는 " + mathFstMidAvg);
				System.out.println("학급 1학기 기말고사 수학 평균 점수는 " + mathFstFinAvg);
				System.out.println("학급 2학기 중간고사 수학 평균 점수는 " + mathSndMidAvg);
				System.out.println("학급 2학기 기말고사 수학 평균 점수는 " + mathSndFinAvg);
				System.out.println();
			} else if (menuSel.equals("5")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}

	}
}
