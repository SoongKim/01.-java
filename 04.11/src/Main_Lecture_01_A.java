import java.util.Scanner;

public class Main_Lecture_01_A {

	public static void main(String[] args) {

		Main_Lecture_01_B[] people = new Main_Lecture_01_B[9999];
		int index = 0;

		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 999999; i++) {
			System.out.println("원하시는 메뉴를 입력해주세요.");
			System.out.println("[1] 새 데이터 입력");
			System.out.println("[2] 전체 데이터 출력");
			System.out.println("[3] 지역별 통계");
			System.out.println("[q] 종료");

			String menuNum = scanner.nextLine();
			if (menuNum.equals("1")) {
				// 입력 실행
				people[index] = new Main_Lecture_01_B();
//				people[index].name = "홍길동";
//				people[index].address = "율도국";
//				people[index].gender = "남성";
//				위와 같은 처리 방법보다는, 메소드 호출 식이 더 효과적이다.
				people[index].inputData();
				index++;
			} else if (menuNum.equals("2")) {
				// 전체 출력
				for (int j = 0; j < index; j++) {
					people[j].printinfo();
				}
			} else if (menuNum.equals("3")) {
				Main_Lecture_01_C[] region = { new Main_Lecture_01_C("서울"), new Main_Lecture_01_C("부산"),
						new Main_Lecture_01_C("충청"), new Main_Lecture_01_C("강원"), new Main_Lecture_01_C("전라"),
						new Main_Lecture_01_C("경상") };

//				region[0] = new Main_Lecture_01_C();
//				region[0].name = "서울";
//				region[1] = new Main_Lecture_01_C();
//				region[1].name = "부산";
//				region[2] = new Main_Lecture_01_C();
//				region[2].name = "강원";
//				region[3] = new Main_Lecture_01_C();
//				region[3].name = "충청";
//				region[4] = new Main_Lecture_01_C();
//				region[4].name = "전라";
//				region[5] = new Main_Lecture_01_C();
//				region[5].name = "경상";

				for (int j = 0; j < region.length; j++) {
					region[i].calcCount(people);

				}

				// 2번 방법
//				String[] region = { "서울", "경기", "부산", "강원", "전라", "경상" };
//				int[] regionCount = new int[region.length];
//				for (int j = 0; j < index; j++) {
//					for (int k = 0; k < region.length; k++) {
//						if (region[k].equals(people[i].address)) {
//							regionCount[k]++;
//						}
//					}
//				}
//				for (int k = 0; k < region.length; k++) {
//					System.out.println(region[k] + " 인구 수 : " + regionCount[k]);
//				}

				// 1번 방법
//				int seoul = 0, gyeong = 0, busan = 0, gang = 0, jeon = 0, kyeong = 0;
//				for (int j = 0; j < index; j++) {
//					if (people[j].address.equals("서울")) {
//						seoul++;
//					} else if (people[j].address.equals("경기")) {
//						gyeong++;
//					} else if (people[j].address.equals("부산")) {
//						busan++;
//					} else if (people[j].address.equals("강원")) {
//						gang++;
//					} else if (people[j].address.equals("전라")) {
//						jeon++;
//					} else if (people[j].address.equals("경상")) {
//						kyeong++;
//					}
//				}
//				System.out.println("서울 인구 수 : " + seoul);
//				System.out.println("경기 인구 수 : " + gyeong);
//				System.out.println("부산 인구 수 : " + busan);
//				System.out.println("강원 인구 수 : " + gang);
//				System.out.println("전라 인구 수 : " + jeon);
//				System.out.println("경상 인구 수 : " + kyeong);

			} else if (menuNum.equals("q")) {
				System.out.println("프로그램을 종료합니다.");
				scanner.close();
				break;
			} else {
				System.out.println("입력이 잘못되었습니다.");
				System.out.println("확인 후 다시 입력해주세요.");
			}
			System.out.println();
		}

	}

}