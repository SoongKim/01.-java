import java.util.Arrays;
import java.util.Scanner;

public class Homework2Final {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[][] inputNum = new int[4][4];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				inputNum[i][j] = scanner.nextInt();
				inputNum[i][3] += inputNum[i][j];
				inputNum[3][j] += inputNum[i][j];
				inputNum[3][3] += inputNum[i][j];
			}
		}
		
		for(int i = 0; i < inputNum.length; i++) {
			for(int j = 0; j < inputNum.length; j++) {
				System.out.printf("%4d", inputNum[i][j]);
			}
		System.out.println();
		}
		
		System.out.println();
		
 		// 4x4 형태의 배열을 원한다면
		for(int[]newNum : inputNum) {
			for(int newColumn : newNum) {
				System.out.print(newColumn + " ");
			}
			System.out.println();
		}
		
		
//		System.out.print(Arrays.deepToString(inputNum));
		scanner.close();
	}
}