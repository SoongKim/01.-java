import java.util.Scanner;
import java.util.Random;
public class PlayLounge {

	int userCount = 5;
	
	public void round() {
		DiceModule dm = new DiceModule();
		for (int i = 1; i < 30; i++) {
			System.out.println(i + "round");
			System.out.println("순서를 정합니다.");
			for (int j = 0; j < userCount; j++) {
				if (player[i].hp < 1) {
					continue;
				}
				player[i].dm.diceFive();
				System.out.println("user " + (i+1) + " 은/는 "+ this.diceFive() + "가 나왔습니다.");
			}
		}
	}

	public void attackMenu() {
		System.out.println("1: 공격");
		System.out.println("2: 방어");
		Scanner scanner = new Scanner(System.in);
		String userSel = scanner.next();
		if (userSel.equals("1")) {
			this.attack();
		}

		else if (userSel.equals("2")) {
			this.defence();
		} else {
			System.out.println("올바른 데이터를 입력해주세요.");
		}
	}

	public void attack() {
		System.out.println("공격");
		DiceModule dm = new DiceModule();
		double damage = dm.diceTen() * 0.8;
		System.out.println("대미지 : " + damage);

	}
	public void defence() {
		
	}
	
	public int diceFive() {
		Random random = new Random();
		int ranNum = random.nextInt(5);
		int resultFive = ranNum + 1;
		return resultFive;
	}
	public void diceSix() {
		Random random = new Random();
		int ranNum = random.nextInt(6);
		int resultFour = ranNum + 1;
	}
	public int diceTen() {
		Random random = new Random();
		int ranNum = random.nextInt(10);
		int resultFour = ranNum + 1;
		return resultFour;
	}
	public void diceTwenty() {
		Random random = new Random();
		int ranNum = random.nextInt(20);
		int resultFour = ranNum + 1;
	}
}