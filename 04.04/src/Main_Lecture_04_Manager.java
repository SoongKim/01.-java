import java.util.Scanner;

public class Main_Lecture_04_Manager {
	SaveBox saveBox[] = new SaveBox[100];
	int saveBoxCount = 0;

	public boolean showMenu() {
	// boolean 타입으로 프로그래밍을 하면 메인 클래스가 더 깔끔해진다.
	// 할 수 있다면 능숙해지도록 노력해보자.
	// 반복문에서 빠져나와 독립 클래스를 구성하였기에
	// 엮여 있는 변수들을 전부 this.를 붙여 정의해주자.
	// 이번 케이스는 겹치는 변수명을 사용하지 않아 괜찮았으나,
	// 추후에도 붙이지 않으면 문제가 발생할 수 있다.

		// 교수로부터의 전언
		// 1. nextInt를 쓸 시기는 지났다. nextLine을 중점으로 사용하자.
		// nextInt와 nextLine 등을 섞어서 사용하면 오동작이 발생하곤 한다.
		// 차라리 nextLine 후 Integer.parseInt를 사용하면 손쉽게 정수 변환이 가능하다.

		for (int i = 0; i < 999999; i++) {
			// 저금통 현재 목록 조회(출력)
			System.out.println();
			System.out.println();
			System.out.println("------------------------현재 저금통 목록------------------------");
			for (int j = 0; j < saveBoxCount; j++) {
//				saveBox[j].info();
				System.out.println(saveBox[j].toString());
				// 객체 변수와 toString.
				// return 시키고 싶은 내용(문자열)을 적으면 이를 뱉어주는 메소드.
				// 참고로 toString은 Object에서 제공하는 기본 Method.
			}
			System.out.println();
			System.out.println("-------------------원하시는 메뉴를 선택해주세요.-------------------");
			System.out.println("1 : 저금통 생성");
			System.out.println("2 : 저금통 액션(입금/출금)");
			System.out.println("q : 저금통 생성");

			Scanner scanner = new Scanner(System.in);
			String menuSelect = scanner.nextLine();
			if (menuSelect.equals("q")) {
				System.out.println("종료합니다.");
				return false;
				// 반복문의 break = 메서드에서의 return
			} else if (menuSelect.equals("1")) {
				// 저금통 생성
				if (this.saveBoxCount < saveBox.length) {
					this.saveBox[saveBoxCount] = new SaveBox();
					this.saveBoxCount++;
					// 위 명령 수행 시 saveBoxCount에 1을 더해준다.
				} else {
					System.out.println("저금통 생성 개수를 초과하였습니다. 최대 생성 가능 갯수는 " + saveBox.length + "개 입니다.");
				}
			} else if (menuSelect.equals("2")) {
				// 저금통 액션 ( 입금, 출금)
				System.out.println("현재" + saveBoxCount + "개의 저금통이 있습니다. 0부터 " + (saveBoxCount - 1) + "사이의 숫자를 입력");
				System.out.println("액션을 원하는 저금통의 숫자(INDEX)를 입력해주세요.");
				String saveBoxSelect = scanner.nextLine();
				int selectNumber = Integer.parseInt(saveBoxSelect);
				if (selectNumber < 0 || selectNumber >= this.saveBoxCount) {
					System.out.println("입력된 값이 잘못되었습니다.");
					continue;
				}
				this.saveBox[selectNumber].doAction();
			} else {
				System.out.println("올바른 정보를 입력해주세요.");
			}
		}
		return true;
		// 교수님 버전에서 배운 점.
		// 1. info를 메인 메뉴에 연동하여 사용 가능한 계좌를 명시해주면 더욱 사용이 편리해진다.
		// 2. return의 사용법
		// 3. 동일한 class 내에서는 서로 다른 method를 this. 를 통해 불러오는 것이 가능하다.
		// 4. continue, break, return을 더욱 능숙히 사용할 수 있도록 연습하자.
	}
}