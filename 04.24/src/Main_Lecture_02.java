import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main_Lecture_02 {

	public static void main(String[] args)  throws FileNotFoundException{
		System.setIn(new FileInputStream(new File("C:\\Users\\SMART16\\workSpace\\01. java\\04.24\\src\\inputRabbit.txt")));
		Scanner scanner = new Scanner(System.in);
		
		int[][]arr = new int[5][5];
		
		int T = scanner.nextInt();
		scanner.nextLine();
		System.out.println(T);
		
		
		
		
		int fox01 = 3;
		int fox02 = 3;
		
		
		
		
		
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(fox01-1 <= i || i<=fox01+1 || fox02-1<= j || j <= fox02+1 || arr[i][j] != 0) {
					count++;
				}
			}
		}
		System.out.println(count);
		
	}

}