import java.util.Arrays;
import java.util.Random;

public class HomeWork01Final {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[] ranNum = new int[30];

		for (int i = 0; i < 30; i++) {
			ranNum[i] = random.nextInt(101);
			
			for (int j = 0; j < 30; j++) {
				if (ranNum[i] < ranNum[j]) {
					int numStand = ranNum[i];
					ranNum[i] = ranNum[j];
					ranNum[j] = numStand;
				}
			}
		}
		System.out.println(Arrays.toString(ranNum));
	}
}