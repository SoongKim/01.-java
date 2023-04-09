import java.util.Scanner;

public class MainClass {
// 6개 지역을 대상으로 이름, 거주지역, 성별을 확인할 수 있는 프로그램.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("관리 인원 수를 입력해주세요.");
		int userNum = Integer.parseInt(scanner.nextLine());
		System.out.println(userNum+" 명을 선택하셨습니다.");
		Func []func = new Func[userNum];
		for(int i = 0; i < userNum; i++) {
			func[i] = new Func();
		}
		
		for(int i = 0; i < 999999; i++) {
			System.out.println("인력 관리 프로그램입니다.");
			System.out.println("원하시는 메뉴를 선택해주세요.");
			System.out.println("[1] 인원 정보 입력");
			System.out.println("[2] 지역별 인구 수 출력");
			System.out.println("[3] 성별 인구 수 출력");
			System.out.println("[4] 전체 출력");
			
			String menuSel = scanner.nextLine();
			if(menuSel.equals("1")) {
				System.out.println("몇 번 인덱스에 정보를 입력할까요?");
				System.out.println("0 ~ "+(userNum-1) +"번 선택 가능");
				int selInx = Integer.parseInt(scanner.nextLine());
				if(selInx >= userNum || selInx < 0) {
					System.out.println("올바른 인덱스 값을 선택해주세요.");
				}
				else if(selInx >=0 && selInx < userNum) {
					if(func[selInx].userInfo == true) {
						System.out.println("이미 정보 입력이 완료된 인덱스입니다.");
						System.out.println("메인 화면으로 돌아갑니다.");
						System.out.println();
					}
					else {
					func[selInx].nameInput();
					func[selInx].residenceInput();
					func[selInx].genderInput();
					func[selInx].InfoInput();
					}
				}
				else {
					System.out.println("올바른 값을 입력해주세요.");
				}
			}
			else if(menuSel.equals("2")) {
				System.out.println("지역별 인구 수를 출력합니다.");
				int seoul = 0, busan = 0, gangwon = 0, choong = 0, jeon = 0, gyeong = 0;
				for(int k = 0; k < userNum; k++) {
					if(func[k].seCount == 1) {
						seoul = seoul+1;
					}
					else if(func[k].buCount == 1) {
						busan = busan+1;
					}
					else if(func[k].gaCount == 1) {
						gangwon = gangwon+1;
					}
					else if(func[k].chCount == 1) {
						choong = choong+1;
					}
					else if(func[k].jeCount == 1) {
						jeon = jeon+1;
					}
					else if(func[k].gyCount == 1) {
						gyeong = gyeong+1;
					}
				}
				System.out.println("서울 : " + seoul);
				System.out.println("부산 : " + busan);
				System.out.println("강원 : " + gangwon);
				System.out.println("충청 : " + choong);
				System.out.println("전라 : " + jeon);
				System.out.println("경상 : " + gyeong);
			}
			else if(menuSel.equals("3")) {
				System.out.println("성별 인구 수를 출력합니다.");
				int maleCount = 0, femaleCount = 0;
				for(int e = 0; e < userNum; e++) {
					if(func[e].maleCount == 1) {
						maleCount = maleCount+1;
					}
					else if(func[e].femaleCount == 1) {
						femaleCount = femaleCount+1;
					}
				}
				System.out.println("남성 : " + maleCount + "명");
				System.out.println("여성 : " + femaleCount + "명");
			}
			else if(menuSel.equals("4")) {
				for(int j = 0; j < userNum; j++) {
					System.out.println("이름 : " + func[j].userName + " 거주지역 : " + func[j].residence + " 성별 : " + func[j].gender);
				}
			}
			else {
				System.out.println("올바른 정보를 입력해주세요.");
			}
		}	
	}
}