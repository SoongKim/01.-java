import java.util.Arrays;
import java.util.Stack;

public class Q_Programmers_Stack {

	public static void main(String[] args) {
		// 프로그래머스 : '주식가격'
		int[] prices = { 1, 2, 3, 2, 3 };
		int lenArr = prices.length;
		int[] answer = new int[lenArr];

		Stack<Integer> myQ = new Stack<Integer>();
		for (int i = 0; i < lenArr; i++) {
			int j = i+1;
			myQ.add(prices[i]);
			int count = 0;
			while (j < lenArr) {
				if(myQ.peek() <= prices[j]) {
					count++;
					j++;
				}
				else {
					count++;
					break;
				}
			}
			answer[i] = count;
		}
		System.out.println(Arrays.toString(answer));
	}

}
