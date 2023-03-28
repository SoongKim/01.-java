
public class SumMachine02 {

	public int makeSum02(int start, int end) {
		int total = 0;
		
		for(int i = start; i <= end; i++) {
			total = total + i;
		}
		System.out.println(end+"까지의 합은 "+ total+"입니다.");
		return total;
	}
}
