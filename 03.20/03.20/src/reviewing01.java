import java.util.Scanner;

public class reviewing01 {

	public static void main(String[] args) {
		Scanner numbers = new Scanner(System.in);
		System.out.println("Input 5 numbers please.");
		int userNum01 = numbers.nextInt();
		int userNum02 = numbers.nextInt();
		int userNum03 = numbers.nextInt();
		int userNum04 = numbers.nextInt();
		int userNum05 = numbers.nextInt();

		int count[] = { userNum01, userNum02, userNum03, userNum04, userNum05 };
		int maxNum = Integer.MIN_VALUE;
		int minNum = Integer.MAX_VALUE;

		for (int i = 0; i < count.length; i++) {
			if (count[i] > maxNum)
				maxNum = count[i];
			if (count[i] < minNum)
				minNum = count[i];
		}
		System.out.println("MinNum = " + minNum);
		System.out.println("MaxNum = " + maxNum);
	}
}