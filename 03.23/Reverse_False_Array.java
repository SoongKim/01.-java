import java.util.Arrays;
import java.util.Random;

public class Reverse_False_Array {

	public static void main(String[] args) {
		Random random = new Random();

		int[] ranNum = new int[5];
		
		
		for (int i = 0; i < 5; i++) {
			ranNum[i] = random.nextInt(11);
		}
		System.out.println("정렬 전 배열은 다음과 같습니다.");
		System.out.println(Arrays.toString(ranNum));
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (ranNum[i] < ranNum[j]) {
					int numStand = ranNum[i];
					ranNum[i] = ranNum[j];
					ranNum[j] = numStand;
					
					
					
	
				}
			}
		}
	}
}