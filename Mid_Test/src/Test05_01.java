import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test05_01 {
	public int[] main(int D, int[]arr) {
		// 기초 제공된 변수들을 선언
		int[]answer;
		int divisor = D;
		int[]sol = arr;
		// 신규 정수 타입의 ArrayList 선언
		ArrayList<Integer>sols = new ArrayList();
		
		// 만약 배열 내 모든 수를 대조하였음에도 나눠지는 수가 없다면 -1을 ArrayList에 산입 
		for(int i = 0; i < sol.length; i++) {
			if(i == sol.length-1 && sol[i]%divisor != 0) {
				sols.add(-1);
			}
			// 그렇지 않고 하나라도 나누어진다면 대상 값을 ArrayList에 산입
			else if(sol[i]%divisor == 0) {
				sols.add(sol[i]);
			}
		}
		// ArrayList를 오름 차순으로 정렬
		Collections.sort(sols);
		answer = new int[sols.size()];
		// answer 배열에 대상 값들을 산입.
		for(int i = 0; i < sols.size(); i++) {
			answer[i] = sols.get(i);
		}
		
		return answer;
	}
}
