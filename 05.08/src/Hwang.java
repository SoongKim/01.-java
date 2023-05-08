import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Hwang {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("./src/tpa1.txt"));
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int[][]arr = new int[y][x];
		for(int i = 0; i < y; i++) {
			for(int j = 0; j < x; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println(Arrays.deepToString(arr));
	}

}
