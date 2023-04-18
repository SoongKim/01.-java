import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BaekJoon02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int solNum = Integer.parseInt(scanner.next());

		PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
		// Collections.reverseOrder() 구문으로 내림 차순 정렬
		for (int i = 0; i < solNum; i++) {
			int sol = Integer.parseInt(scanner.next());
			if (sol == 0) {
				if (!queue.isEmpty()) {
					System.out.println(queue.poll());
		// 입력 값이 0일 때,
		// queue가 비어 있지 않다면 queue 첫 번째 값을 출력
				} else {
					System.out.println(0);
		// 입력 값이 0일 때,
		// queue가 비어 있지 않은 것이 아니라면(==비어있다면)
		// 0을 출력
				}
				continue;
			}
			queue.add(sol);
		// 입력값이 0이 아니라면 queue에 값을 산입한다.	
		}
	}
}