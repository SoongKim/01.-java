import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("몇 명을 대상으로 관리 프로그램을 작동할까요?");
		int countNum = Integer.parseInt(s.nextLine());
		Function[] manager = new Function[countNum];
		for (int i = 0; i < countNum; i++) {
			manager[i] = new Function();
		}

		for (int i = 0; i < 999999; i++) {
			System.out.println("인력 관리 프로그램입니다.");
			System.out.println("1:입력|2:전체출력|3:지역별 인구 수 출력| 4:성별 인구 수 출력");
			Scanner scanner = new Scanner(System.in);
			String userInput = scanner.nextLine();
			if (userInput.equals("1")) {
				Scanner scan = new Scanner(System.in);
				System.out.println("몇 번 인덱스에 입력 값을 저장할까요?");
				int userIndex = Integer.parseInt(scan.nextLine());
				if (userIndex < countNum && userIndex >= 0) {
					System.out.println("인덱스 " + userIndex + "번에 데이터를 저장합니다.");
					manager[userIndex].name();
					manager[userIndex].residence();
					manager[userIndex].gender();
					System.out.println(userIndex + "번 인덱스에 입력이 완료되었습니다.");
				} else {
					System.out.println("잘못된 값을 입력하셨습니다.");
					continue;
				}
			} else if (userInput.equals("2")) {
				int seoulCount = 0;
				int busanCount = 0;
				int gangwonCount = 0;
				int choongchungCount = 0;
				int jeonraCount = 0;
				int gyeongsangCount = 0;
				for (int l = 0; l < countNum; l++) {
					if (manager[l].seoul) {
						for (int sl = 0; sl < countNum; sl++) {
							seoulCount = seoulCount + manager[sl].residenceSeoul;
						}
					} else if (manager[l].busan) {
						for (int bl = 0; bl < countNum; bl++) {
							busanCount = busanCount + manager[bl].residenceBusan;
							;
						}
					} else if (manager[l].gangwon) {
						for (int gl = 0; gl < countNum; gl++) {
							gangwonCount = gangwonCount + +manager[gl].residenceGangwon;
						}
					} else if (manager[l].choongchung) {
						for (int cl = 0; cl < countNum; cl++) {
							choongchungCount = choongchungCount + manager[cl].residenceChoongchung;
						}
					} else if (manager[l].jeonra) {
						for (int jl = 0; jl < countNum; jl++) {
							jeonraCount = jeonraCount + manager[jl].residenceJeonra;
						}
					} else if (manager[l].gyeongsang) {
						for (int kl = 0; kl < countNum; kl++) {
							gyeongsangCount = gyeongsangCount + manager[kl].residenceGyeongsang;
						}
					}
				}
				int maleCount = 0, femaleCount = 0;
				for (int m = 0; m < countNum; m++) {
					if (manager[m].male) {
						for (int mc = 0; mc < countNum; mc++) {
							maleCount = maleCount + manager[mc].maleCount;
						}
					} else if (manager[m].female) {
						for (int wc = 0; wc < countNum; wc++) {
							femaleCount = femaleCount + manager[wc].femaleCount;
						}
					}
				}
				System.out.println("남성은 총 " + maleCount + "명");
				System.out.println("여성은 총 " + femaleCount + "명");
				System.out.println("서울의 총 거주 인원은" + seoulCount + "명");
				System.out.println("부산의 총 거주 인원은" + busanCount + "명");
				System.out.println("강원도의 총 거주 인원은" + gangwonCount + "명");
				System.out.println("충청도의 총 거주 인원은" + choongchungCount + "명");
				System.out.println("전라도의 총 거주 인원은" + jeonraCount + "명");
				System.out.println("경상도의 총 거주 인원은" + gyeongsangCount + "명");

			} else if (userInput.equals("3")) {
				int seoulCount = 0;
				int busanCount = 0;
				int gangwonCount = 0;
				int choongchungCount = 0;
				int jeonraCount = 0;
				int gyeongsangCount = 0;
				for (int l = 0; l < countNum; l++) {
					if (manager[l].seoul) {
						for (int sl = 0; sl < countNum; sl++) {
							seoulCount = seoulCount + manager[sl].residenceSeoul;
						}
					} else if (manager[l].busan) {
						for (int bl = 0; bl < countNum; bl++) {
							busanCount = busanCount + manager[bl].residenceBusan;
							;
						}
					} else if (manager[l].gangwon) {
						for (int gl = 0; gl < countNum; gl++) {
							gangwonCount = gangwonCount + +manager[gl].residenceGangwon;
						}
					} else if (manager[l].choongchung) {
						for (int cl = 0; cl < countNum; cl++) {
							choongchungCount = choongchungCount + manager[cl].residenceChoongchung;
						}
					} else if (manager[l].jeonra) {
						for (int jl = 0; jl < countNum; jl++) {
							jeonraCount = jeonraCount + manager[jl].residenceJeonra;
						}
					} else if (manager[l].gyeongsang) {
						for (int kl = 0; kl < countNum; kl++) {
							gyeongsangCount = gyeongsangCount + manager[kl].residenceGyeongsang;
						}
					}
				}
				System.out.println("서울의 총 거주 인원은" + seoulCount + "명");
				System.out.println("부산의 총 거주 인원은" + busanCount + "명");
				System.out.println("강원도의 총 거주 인원은" + gangwonCount + "명");
				System.out.println("충청도의 총 거주 인원은" + choongchungCount + "명");
				System.out.println("전라도의 총 거주 인원은" + jeonraCount + "명");
				System.out.println("경상도의 총 거주 인원은" + gyeongsangCount + "명");
			} else if (userInput.equals("4")) {
//				성별합
				int maleCount = 0, femaleCount = 0;
				for (int m = 0; m < countNum; m++) {
					if (manager[m].male) {
						for (int mc = 0; mc < countNum; mc++) {
							maleCount = maleCount + manager[mc].maleCount;
						}
					} else if (manager[m].female) {
						for (int wc = 0; wc < countNum; wc++) {
							femaleCount = femaleCount + manager[wc].femaleCount;
						}
					}
				}
				System.out.println("남성은 총 " + maleCount + "명");
				System.out.println("여성은 총 " + femaleCount + "명");
			} else {
				System.out.println("잘못된 값을 입력하셨습니다.");
			}
			System.out.println();
		}
	}

}