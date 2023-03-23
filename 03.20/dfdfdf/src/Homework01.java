import java.util.Arrays;
import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int [][]inputNum = new int[4][4];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				inputNum[i][j] = scanner.nextInt();	 
				inputNum[i][3] += inputNum[i][j];
				inputNum[3][j] += inputNum[i][j];
				inputNum[3][3] += inputNum[i][j];
			}
		}
		
		for(int[]newNum : inputNum) {
			for(int newColumn : newNum) {
				System.out.print(newColumn + " ");
			}
			System.out.println(Arrays.toString(newNum));
		}
	}
}