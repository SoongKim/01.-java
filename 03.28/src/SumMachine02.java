
public class SumMachine02 {

	public int makeSum02(int start, int end) {
		int total = 0;
		
		for(int i = start; i <= end; i++) {
			total = total + i;
		}
		System.out.println(end+"������ ���� "+ total+"�Դϴ�.");
		return total;
	}
}
