
public class Question04 {

	public static void main(String[] args) {
		for (int i = 0; i < 8; i++) {
			for (int j = 7; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 마지막 층에 *이 15개, 공백이 0개이며 총 층수는 8층
		// 이에 i = 0; i < 8; i++
		// 	   j = 7, j >i; j--
		//     k = 0; k < 2*i+1; k++
		// 를 통해 해당 모양을 구축할 수 있다.
	}
}