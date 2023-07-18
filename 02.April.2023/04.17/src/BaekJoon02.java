import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BaekJoon02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int solNum = Integer.parseInt(scanner.next());

		PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
		for (int i = 0; i < solNum; i++) {
			int sol = Integer.parseInt(scanner.next());
			if (sol == 0) {
				if (!queue.isEmpty()) {
					System.out.println(queue.poll());
				} else {
					System.out.println(0);
				}
				continue;
			}
			queue.add(sol);
		}
	}
}