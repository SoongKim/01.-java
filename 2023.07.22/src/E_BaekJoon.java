import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class E_BaekJoon {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> myQ = new LinkedList<Integer>();
		for(int i = 0; i < N; i++) {
			String target = br.readLine();
			String command = target.split(" ")[0];
			if(command.equals("push")) {
				String number = target.split(" ")[1];
				myQ.add(Integer.parseInt(number));
				continue;
			}
			else if(command.equals("pop")) {
				if(myQ.isEmpty()) {
					System.out.println(-1);
					continue;
				}
				else {
					System.out.println(myQ.poll());
					continue;
				}
			}
			else if(command.equals("size")) {
				System.out.println(myQ.size());
				continue;
			}
			else if(command.equals("empty")) {
				if(myQ.isEmpty()) {
					System.out.println(1);
					continue;
				}
				else {
					System.out.println(0);
					continue;
				}
			}
			else if(command.equals("front")) {
				if(myQ.isEmpty()) {
					System.out.println(-1);
					continue;
				}
				else {
					System.out.println(myQ.peek());
					continue;
				}
			}
			else {
				if(myQ.isEmpty()) {
					System.out.println(-1);
					continue;
				}
				else {
					Object[]arr = myQ.toArray();
					System.out.println((int)arr[myQ.size()-1]);
					continue;
				}
			}
		}
	}
}