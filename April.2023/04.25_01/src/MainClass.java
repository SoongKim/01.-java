import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Base[] base = new Base[10];

		for (int i = 0; i < base.length; i++) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("0:삼각형 | 1:사각형 | 2: 원");
			System.out.println((i + 1) + "번째 도형은 무엇으로 선택할까요?");
			String userInput = scanner.nextLine();
			int userNum = Integer.parseInt(userInput);
			if (userNum == 0) {
				base[i] = new Triangle();
			} else if (userNum == 1) {
				base[i] = new Square();
			} else if (userNum == 2) {
				base[i] = new Circle();
			} else {
				System.out.println("올바른 정보를 입력해주세요.");
			}
		}
		for (int i = 0; i < base.length; i++) {
			if (base[i] == null) {
				System.out.println((i + 1) + "번 도형은 선택하지 않으셨습니다.");
			} else {
				System.out.println((i + 1) + "번 도형");
				base[i].doAction();
			}
		}
	}
}