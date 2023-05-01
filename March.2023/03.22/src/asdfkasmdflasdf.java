import java.util.Random;

public class asdfkasmdflasdf {

	public static void main(String[] args) {
		Random random = new Random();
		
		int randomNum = random.nextInt(100);
		
		boolean primeNum = true;
		for(int i = 2; i < randomNum+1; i++) {
			for(int j = 2; j < i-1; j++) {
				if(j > 1 && i % j == 0) {
					primeNum = false;
					break;
				}
			}
			if(primeNum = true) {
				System.out.print(i + " ");
			}
		}
	}
}