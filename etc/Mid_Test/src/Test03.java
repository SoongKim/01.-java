import java.util.Arrays;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		// 미완성본
		
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		int[][]arr = new int[x][y];
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		
		int[][]arrc = new int[x][y];
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++) {
				arrc[i][0] =+ arr[i][0];
				arrc[i][1] =+ arr[0][j];
			}
		}
		
		System.out.println(Arrays.deepToString(arrc));
		
		
		
		int c = scanner.nextInt();
		int[][] answer = new int[c][2];
		
		for(int i = 0; i < c; i++) {
			for(int j = 0; j < 2; j++) {
				answer[i][0] =+ arr[0][i];
				answer[i][1] =+ arr[i][0];
			}
		}
		
		System.out.println(Arrays.deepToString(answer));
	}
}
