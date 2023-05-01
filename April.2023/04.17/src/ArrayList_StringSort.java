import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_StringSort {

	public static void main(String[] args) {
		ArrayList lists = new ArrayList();
		
		lists.add("Apple");
		lists.add("Banana");
		lists.add("3");
		lists.add("Orange");
		lists.add("apple");

		System.out.println(lists);
		
		Collections.sort(lists);
		
		System.out.println(Arrays.deepToString(lists.toArray()));
		
		Collections.sort(lists, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
		System.out.println(Arrays.deepToString(lists.toArray()));
	}

}
