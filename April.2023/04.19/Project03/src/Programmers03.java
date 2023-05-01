import java.util.ArrayList;

public class Programmers03 {

	public static void main(String[] args) {
		String answer = "";
		String my_string = "bus";
		String[] arr = {"a", "e", "i", "o", "u"};
		
		ArrayList sol = new ArrayList();
		for(int i = 0; i < my_string.length(); i++) {
			for(int j = 0; j < arr.length; j++) {
				if(my_string.split("")[i] != arr[j]) {
					
				}
			}
		}
		
		
		System.out.println(sol);
	}

}
