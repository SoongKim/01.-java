import java.util.PriorityQueue;
import java.util.Queue;

public class Main_Lecture_03 {

	public static void main(String[] args) {
		// PriorityQueue
		// 실무에서 주로 사용하는 개념들.
		
		Queue<Integer> queue = new PriorityQueue<Integer>();
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		
		System.out.println(queue.toString());
	}

}
