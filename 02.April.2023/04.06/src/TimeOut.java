import java.util.Arrays;
import java.util.Scanner;

public class TimeOut {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int joon = scanner.nextInt();
		int[][] uI = new int[joon][2];
		for (int i = 0; i < joon; i++) {
			for (int j = 0; j < 2; j++) {
				uI[i][j] = scanner.nextInt();
			}
		}
		for (int c = 0; c < joon; c++) {
			for (int x = 0; x < joon; x++) {

				if (uI[c][0] < uI[x][0]) {
					int temp = uI[c][0];
					uI[c][0] = uI[x][0];
					uI[x][0] = temp;
				} else if (uI[c][1] < uI[x][1]) {
					int temp = uI[c][1];
					uI[c][1] = uI[x][1];
					uI[x][1] = temp;
				}
			}
		}
		for(int i = 0; i < uI.length; i++) {
			int[]inArr = uI[i];
			for(int j = 0; j < inArr.length; j++) {
				System.out.print(inArr[j]+" ");
			}
			System.out.println();
		}
	}
}