import java.util.ArrayList;
import java.util.Collections;

public class Main_Lecture_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList strList = new ArrayList();
		
		strList.add("APPLE");
		strList.add("Banana");
		strList.add("3");
		strList.add("apple");
		strList.add("orange");
		
		Collections.sort(strList, String.CASE_INSENSITIVE_ORDER);
		System.out.println(strList);
	}

}
