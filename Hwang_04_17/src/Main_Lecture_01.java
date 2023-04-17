import java.util.ArrayList;

public class Main_Lecture_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList myList = new ArrayList();
		
		myList.add(1);
		myList.add(2);
		myList.add(3);
		System.out.println(myList);
		
		for(int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i));
		}
	}

}
