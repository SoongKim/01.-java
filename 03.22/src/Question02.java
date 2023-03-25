
public class Question02 {

	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
			for (int j = 9; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
			// i는 0에서 8까지, j는 9에서 i보다 클 때 까지의 값을 지닌다.
			// j가 i보다 클 때 별을 찍으므로
			// 첫 회전(j=9, i=0) 시 j가 9, 8, 7, 6, 5, 4, 3, 2, 1일 때 별이 찍힌다.
		}
	}
}