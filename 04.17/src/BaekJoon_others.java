import java.util.PriorityQueue;
import java.util.Scanner;

public class BaekJoon_others {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.next());

		PriorityQueue<Integer> queue = new PriorityQueue<>();
		for (int i = 0; i < n; i++) {
			int nums = Integer.parseInt(scanner.next());
			if (nums == 0) {
				if (!queue.isEmpty()) {
					System.out.println(queue.poll());
				} else {
					System.out.println(0);
				}
				continue;
			}
			queue.add(nums);
		}
	}
}