import java.util.Random;
import java.util.Scanner;

public class newProject {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 999999; i++) {

			System.out.println("주사위 굴리기 게임입니다.");
			System.out.println("q: 종료");

			String playGame = scanner.nextLine();

			if (playGame.equals("q")) {
				System.out.println("게임을 종료합니다.");
				break;
			}

			Random userData = new Random();
			int userNum = userData.nextInt(6);

			System.out.println("사용자는 " + (userNum + 1) + " 이/가 나왔습니다.");
			System.out.println("컴퓨터가 주사위를 굴립니다. 실행할까요?");

			scanner.nextLine();

			Random comData = new Random();

			int comInput = comData.nextInt(5);

			System.out.println("컴퓨터는 " + (comInput + 1) + "이 나왔습니다.");

			System.out.println();
			if (userNum > comInput) {
				System.out.println("You Win!");
			} else if (userNum < comInput) {
				System.out.println("You Lose!");
			} else {
				System.out.println("Draw");
			}
			System.out.println();
		}
	}
}