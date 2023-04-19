import java.util.Arrays;

public class Programers02 {

	public static void main(String[] args) {
		int answer = 0;
		Integer[] numbers = {1, 2, 3, 4, 5};
		
		Arrays.sort(numbers);
		
		answer = numbers[numbers.length-1]*numbers[numbers.length-2];
		System.out.println(answer);
	}

}
