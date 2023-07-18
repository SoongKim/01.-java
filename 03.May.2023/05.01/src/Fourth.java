import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("src/tpa1.txt"));
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int[][] arr = new int[x][y];
		
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		System.out.println(Arrays.deepToString(arr));
		
		
		
		
		
		
		
//		System.out.println(A + B + C + D);
	}

}
