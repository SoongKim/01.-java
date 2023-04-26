import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Base {
	double hp;
	int power;
	String name;
	int userCount = 5;
	int[] tnstj = new int[5];

	Base() {
		this.hp = 100;
		this.name = "기본";
		this.power = 10;
	}

	First first = new First();
	Scanner scanner = new Scanner(System.in);

	public void round() {
		this.fastPlay();
//		this.underAttack(power);
//		this.isLive();
//		this.toString();
	}

//	순번 정하기
	public void fastPlay() {
		Random random = new Random();
		String[] ranUser = { this.name, "enemy1", "enemy2", "enemy3", "enemy4" };
		DiceModule dm = new DiceModule();
		System.out.println("순서를 정합니다.");
		for (int i = 0; i < userCount; i++) {
			tnstj[i] = dm.diceFive();
		}

		for (int i = 0; i < userCount; i++) {
			System.out.println(ranUser[i]);

		}
		System.out.println("순서로 게임을 진행합니다.");
	}

//	피격시
	public void underAttack(int attack) {
		this.hp = this.hp - attack * 0.8;
	}

//	공격시

	public int Attack1() {
		return power;
		상대의underAttack(power);
	}

//	공격시
//	public int Attack2() {
//		return power;
//	}

//	생존 판별
	public boolean isLive() {
		if (this.hp < 1) {
			return false;
		} else {
			return true;
		}
	}

//	public void AttackMenu() {
//		System.out.println("원하시는 공격 선택");
////	      list
//		String inputString = scanner.nextLine();
//		System.out.println("원하시는 상대 선택");
//		String inputString2 = scanner.nextLine();
//		int inputNum=Integer.parseInt(inputString2);
//		
//
//		if (inputString.equals(1)) {
//			System.out.println(Arrays.toString(first.attactName));
//			first.baseAttack();
//			this.fastPlay.ranUser[inputNum].underAttack();
//		} else if (inputString.equals(2)) {
//			first.Attack1();
//		} else if (inputString.equals(2)) {
//			first.Attack2();
//		}
//	}

// 생존 메세지
	@Override
	public String toString() {
		if (this.isLive()) {
			return this.name + " (" + this.hp + ") ";
		} else {
			this.userCount--;
			return this.name + " is dead";
		}
	}
}
