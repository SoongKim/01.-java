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

// 		4 X 4 형태로 데이터를 출력하고 싶다면 아래의 명령을 수행
//		for(int[]newNum : inputNum) {
//			for(int newColumn : newNum) {
//				System.out.print(newColumn + " ");
//			System.out.println();
//			}
//		}
		System.out.print(Arrays.deepToString(inputNum));
		scanner.close();
	}
}