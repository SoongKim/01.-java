import java.util.PriorityQueue;
import java.util.Scanner;

public class BaekJoon {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.next());

		PriorityQueue<Integer> queue = new PriorityQueue<>();
		// ()로 오름차순 정렬을 선택
		for (int i = 0; i < n; i++) {
			int nums = Integer.parseInt(scanner.next());
			if (nums == 0) {
				if (!queue.isEmpty()) {
					System.out.println(queue.poll());
					// 입력 값이 0일 때,
					// queue가 비어있지 않다면 queue의 첫 번째 값을 출력
				} else {
					System.out.println(0);
					// 입력 값이 0일 때,
					// queue가 비어있지 않은 것이 아니라면(== 비어있다면)
					// 0을 출력
				}
				continue;
			}
			queue.add(nums);
		// 입력값이 0이 아닌 경우, queue에 값을 더한다.
		}
	}
}
