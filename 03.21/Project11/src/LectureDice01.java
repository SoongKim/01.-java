import java.util.Random;
import java.util.Scanner;

public class LectureDice01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int playTime = 0;
		for(int i = 0; i < 999999; i++) {
		
			System.out.println("화면에 주사위를 굴릴까요?");
			System.out.println("q: 종료");
			System.out.println("s: 통계 확인");
			String userInput = scanner.nextLine();
			if(userInput.equals("q")) {
				System.out.println("게임을 종료합니다.");
				break;
			}
			if(userInput.equals("s")) {
				System.out.println("통계를 확인합니다.");
				System.out.println();
				System.out.println("총 " + playTime + " 회 플레이하셨습니다.");
				System.out.println();
				continue;
			}
			
			int userDice = random.nextInt(6) + 1;
			System.out.println("사용자 주사위는 " + userDice + " 가 나왔습니다.");
			System.out.println("컴퓨터가 주사위를 굴릴까요?");
			
			scanner.nextLine();
	
			int comDice = random.nextInt(6) + 1; 
			System.out.println("컴퓨터 주사위는 " + comDice + " 가 나왔습니다.");
	
				if(userDice > comDice) {
					System.out.println("You Win!");
				}
				else if(userDice < comDice) {
					System.out.println("You Lose!");
				}
				else {
					System.out.println("Draw");
				}
				System.out.println();
				playTime = playTime + 1;
		}
	}
}