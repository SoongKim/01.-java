import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrioQueue {

	public static void main(String[] args) {
		Map<String, String> map1 = new HashMap<>();
		map1.put("a", "A");
		map1.put("b",  "B");
		
		System.out.println("map1 = " + map1);
	
		System.out.println("map1.get(\"A\") = " + map1.get("A"));
		
		System.out.println(map1);
		
		Set<String> keySet = map1.keySet();
		System.out.println("keySet = " + keySet);
		
	}

}
