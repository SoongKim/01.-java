import java.util.Arrays;
import java.util.Scanner;

public class Programers02test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		String[]arr = (scanner.nextLine()).split("");

		String userInput = scanner.nextLine();
		String[] arr = userInput.split("");
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum = sum + Integer.parseInt(arr[i]);
		}
		if(Integer.parseInt(userInput) % sum == 0) {
			System.out.println("¸®»þµå ¼ö");
		}
		else {
			System.out.println("¸®»þµå ¼ö°¡ ¾Æ´Õ´Ï´Ù.");
		}
	}
}
