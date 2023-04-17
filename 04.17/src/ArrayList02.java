import java.util.ArrayList;

public class ArrayList02 {

	public static void main(String[] args) {
		ArrayList myList = new ArrayList();
		
		myList.add(1);
		myList.add(2);
		myList.add(3);
		
		System.out.println(myList);
		System.out.println(myList.get(0));
		myList.remove(0);
		System.out.println(myList);
		
		for(int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i));
		}
		
	}

}
