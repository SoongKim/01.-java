import java.util.Arrays;
import java.util.Random;

public class HomeWork04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int[] lotto = new int[6];
		int lenLotto = lotto.length;
		for (int i = 0; i < lenLotto; i++) {
			lotto[i] = (random.nextInt(45) + 1);
			for(int j = 0; j < lenLotto; j++) {
				if(i != j && lotto[i] == lotto[j]) {
//					i--;
//					break;
					// why?
				}
			}
		}
		for(int i = 0; i < lotto.length; i++) {
			for(int j = 0; j < lotto.length; j++) {
				if(lotto[i] < lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));
	}
}