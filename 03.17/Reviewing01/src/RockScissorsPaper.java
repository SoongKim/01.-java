import java.util.Random;
import java.util.Scanner;

public class RockScissorsPaper {

	public static void main(String[] args) {
		System.out.println("가위바위보 게임입니다.");
		System.out.println("p: 게임 플레이하기");
		System.out.println("s: 통계 확인하기");
		System.out.println("q: 시스템 종료");
		
		Scanner gamePlay = new Scanner(System.in);
		
		String playGame = gamePlay.nextLine();
		
		
		int winPlay = 0;
		int drawPlay = 0;
		int losePlay = 0;

		for (int i = 0; i < 999999; i++) {
			

			int scissorsData = 0;
			int rockData = 1;
			int paperData = 2;
			
			if (playGame.equals("p")) {
				System.out.println("게임을 시작합니다.");
				System.out.println("가위는 0, 바위는 1, 보는 2를 눌러주세요.");
				int userData = Integer.parseInt(playGame);
			
				if (userData == scissorsData) {
					System.out.println("사용자께서 가위를 선택하셨습니다.");
				}
					else if (userData == rockData) {
					System.out.println("사용자께서 바위를 선택하셨습니다.");
				}
					else if (userData == paperData) {
					System.out.println("사용자께서 보를 선택하셨습니다.");
				}
				
				Random apponent = new Random();
				int apponentData = apponent.nextInt(3);
				int wOl = userData = apponentData;
				
				if(apponentData == scissorsData) {
					System.out.println("컴퓨터는 가위를 선택하였습니다.");
				}
					else if(apponentData == rockData) {
					System.out.println("컴퓨터는 바위를 선택하였습니다.");
				}
					else if(apponentData == paperData) {
					System.out.println("컴퓨터는 보를 선택하였습니다.");
				}
				
				int winningNumber01 = 1;
				int winningNumber02 = -2;
				int drawNumber = 0;
				int loseNumber01 = -1;
				int loseNumber02 = 2;
				
					if(wOl == winningNumber01 || wOl == winningNumber02) {
						System.out.println("사용자 분의 승리입니다!");
					}
					else if(wOl == drawNumber) {
						System.out.println("무승부입니다.");
					}
					else if(wOl == loseNumber01 || wOl == loseNumber02) {
						System.out.println("사용자의 패배입니다...");
					}
					
			}
				else if (playGame.equals("s")) {
				System.out.println("통계 확인 창입니다.");
				System.out.println("지금까지.");
				System.out.println("총 승리" + winPlay + " 회");
				System.out.println("총 승리" + drawPlay + " 회");
				System.out.println("총 승리" + losePlay + " 회");
				System.out.println("");
				System.out.println("첫 화면으로 돌아갑니다.");
				System.out.println("");
				}
				else if (playGame.equals("q")) {
				System.out.println("게임을 종료합니다.");
				break;
				}
				else {
				System.out.println("입력하신 데이터를 다시 확인해주세요.");
				System.out.println("");
				System.out.println("메인 화면으로 돌아갑니다.");
				System.out.println("");
				}

		

	}
	}
}
