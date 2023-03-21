import java.util.Random;
import java.util.Scanner;

public class P11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int gameCount = 0;
		int winPlay = 0;
		int drawPlay = 0;
		int losePlay = 0;
		
		for (int i = 0; i < 999999; i++) {

			System.out.println("가위(0), 바위(1), 보(2) 중");
			System.out.println("하나를 입력해주세요. 종료(q)");

			String inputString = scanner.nextLine();

			if(inputString.equals("q")) {
				System.out.println("게임이 종료되었습니다.");
				System.out.println("총 " + gameCount + ", 총 사용자는 " + winPlay + "번 이겼고, 컴퓨터는 " + losePlay + "번 이겼습니다.");
				break;
			}
			gameCount++;
			System.out.println("");
			System.out.println(gameCount + " 번째 게임");
			System.out.println("");
			int userInput = Integer.parseInt(inputString);
			int comInput = random.nextInt(3);

			if(userInput == 0) {
				System.out.println("사용자가 가위를 냈습니다.");
			} else if(userInput == 1) {
				System.out.println("사용자가 바위를 냈습니다.");
			} else if(userInput == 2) {
				System.out.println("사용자가 보를 냈습니다.");
			}
			
			System.out.println("");
			
			if (comInput == 0) {
				System.out.println("컴퓨터가 가위를 냈습니다.");
			} else if (comInput == 1) {
				System.out.println("컴퓨터가 바위를 냈습니다.");
			} else if (comInput == 2) {
				System.out.println("컴퓨터가 보를 냈습니다.");
			}

			System.out.println("");
			
			if (userInput == comInput) {
				System.out.println("비겼습니다.");
				drawPlay = drawPlay + 1;
			} else if ((userInput == 0 && comInput == 1) || (userInput == 1 && comInput == 2)
					|| (userInput == 3 && comInput == 0)) {
				System.out.println("컴퓨터가 이겼습니다.");
				winPlay = winPlay + 1;
			} else {
				System.out.println("사용자가 졌습니다.");
				losePlay = losePlay + 1;
			}
			System.out.println("");
			System.out.println("계속 진행하시려면 엔터를 눌러주세요.");
			scanner.nextLine();
			
		}
			scanner.close();
	}
}