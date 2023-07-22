import java.util.LinkedList;
import java.util.Queue;

public class R_Programmers_StackAndQueue {

	public static void main(String[] args) {
		int[] priorities = {2, 1, 3, 2};
		int lenArr = priorities.length;
		Queue<Integer> myQ = new LinkedList<Integer>();
		for(int i = 0; i < lenArr; i++) {
			myQ.add(priorities[i]);
		}
		while(myQ.isEmpty()) {
			int temp = myQ.poll();
			
			myQ.add(temp);
		}
		System.out.println(myQ);
	}
}
