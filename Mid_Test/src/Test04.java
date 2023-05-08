import java.util.Arrays;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		//미완성본입니다.
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
	
		for(int i = 0; i < N; i++) {
			int blankCount = 0;
			String answer = scanner.nextLine();
			for(int j = 0; j < answer.length(); j++) {
				if(answer.split("")[j].equals(" ")) {
					blankCount++;
				}
			}
			int[]arr = new int[answer.length()-blankCount];
			for(int c = 0; c < arr.length; c++) {
				if(!answer.split(" ").equals(" ")) {
					arr[c] = Integer.parseInt(answer.split(" ")[c]);
				}
				else {
					continue;
				}
			}
			
			System.out.println(answer);
			System.out.println(blankCount);
		}
		
	}
}
