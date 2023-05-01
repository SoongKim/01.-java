import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int len = Integer.parseInt(scanner.next());
		
		int[] arr = new int[len];
		
		for(int i = 0; i < len; i++) {
			arr[i] = Integer.parseInt(scanner.next());
		}
		
		for(int j = 0; j < arr.length; j++) {
			if(arr[j] == 0) {
				Arrays.sort(arr);
				System.out.println(arr[0]);
			}
		}
				
	}

}
