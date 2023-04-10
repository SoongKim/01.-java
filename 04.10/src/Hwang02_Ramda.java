import java.util.Arrays;

public class Hwang02_Ramda {

	public static void main(String[] args) {
		Integer[] myArr = {15, 27, 33, 73};
		System.out.println(Arrays.toString(myArr));
		Arrays.sort(myArr, (a, b)->{
			return b - a;
		});
		System.out.println(Arrays.toString(myArr));
	}
}