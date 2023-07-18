import java.util.PriorityQueue;
import java.util.Scanner;

public class BaekJoon_others {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int len = Integer.parseInt(scanner.next());

		PriorityQueue<Integer> queue = new PriorityQueue<>();
		for (int i = 0; i < len; i++) {
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