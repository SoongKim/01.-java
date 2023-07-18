import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();

		arr.add(10);
		arr.add(20);
		arr.add(1);
		arr.add(7);
		arr.add(1);
		
		
		System.out.println(arr);
		System.out.println(arr.contains(10));
		System.out.println(arr.contains(2));
		Collections.sort(arr);
		System.out.println(arr);
		Collections.sort(arr, Collections.reverseOrder());
		System.out.println(arr);
	}
}