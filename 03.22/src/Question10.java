import java.util.Arrays;
import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int minNum = Integer.MAX_VALUE;
		int maxNum = Integer.MIN_VALUE;
		
		int[]userNum = new int[7];
		
		for(int i = 0; i < 7; i++) {
			userNum[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < 7; i++) {
			if(userNum[i] < minNum) {
				minNum = userNum[i];
			}
			if(userNum[i] > maxNum) {
				maxNum = userNum[i];
			}
		}
			System.out.println("가장 높은 점수는 :" + maxNum);
			System.out.println("가장 낮은 점수는 :" + minNum);
		scanner.close();
	}
}