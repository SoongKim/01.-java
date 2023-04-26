import java.util.Random;

public class DiceModule {

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
	public int diceTwenty() {
		Random random = new Random();
		int ranNum = random.nextInt(20);
		int resultFour = ranNum + 1;
		return resultFour;
	}
}
