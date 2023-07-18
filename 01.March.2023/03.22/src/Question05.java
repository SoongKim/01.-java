
public class Question05 {

	public static void main(String[] args) {
		for (int i = 0; i < 8; i++) {
			for (int j = 7; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < ((2 * i) + 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int x = 7; x > 0; x--) {
			for (int y = 8; y > x; y--) {
				System.out.print(" ");
			}
			for (int z = 0; z < (2 * x - 1); z++) {
				System.out.print("*");
			}
			System.out.println();
		}
	// 하부의 경우 최종 출력물의 갯수가 한 층 낮으며,
	//	시작 시점부터 공백이 출력되어야 함을 고려하여야 한다.
	}
}