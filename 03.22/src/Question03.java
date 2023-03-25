
public class Question03 {

	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (i == 0 || i == 8) {
					System.out.print("*");
				// i가 0, 혹은 8의 값을 지닐 때
				// j = 0에서 8까지 총 9차례 별을 찍는다.
				// 이를 통해 0층과 8층은 총 9번 별이 찍히게 된다.
				} else {
					if (j == 0) {
						System.out.print("*");
					} else if (j > 0 && j < 8) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}				
				}
				// i가 1에서 7의 값을 지니는 경우
				// j가 0 혹은 8이면 *을
				// 아닌 경우 공백을 찍도록 하였다.
				// 이를 통해 1층부터 7층은 양 쪽에 * 하나와 가운데 공백을 지닌 모양을 찍게 된다.
			}
			System.out.println();
		}
	}
}