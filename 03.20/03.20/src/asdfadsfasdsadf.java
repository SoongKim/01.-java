import java.util.ArrayList;
import java.util.List;

public class asdfadsfasdsadf {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("JAVA");
		list.add("PYTHON");
		list.add("KOTLIN");
		
		String str = "";
		for(String item : list) {
			str += item + " ";
		}
		System.out.println(str);
		

	}

}
