import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		System.out.println("Input 5 numbers please.");
		int userNum01 = user.nextInt();
		int userNum02 = user.nextInt();
		int userNum03 = user.nextInt();
		int userNum04 = user.nextInt();
		int userNum05 = user.nextInt();

		int a[] = { userNum01, userNum02, userNum03, userNum04, userNum05 };

		int minUserNum = Integer.MAX_VALUE;
		int maxUserNum = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++) {
			if (a[i] < minUserNum) {
				minUserNum = a[i];
			}
			if (a[i] > maxUserNum) {
				maxUserNum = a[i];
			}
		}
		System.out.println("MinValue = " + minUserNum);
		System.out.println("MaxValue = " + maxUserNum);
		user.close();
	}
}