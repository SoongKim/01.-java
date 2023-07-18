
public class Question01 {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			// j가 i보다 작다면 별을 찍는다.
			// i가 1에서 9 값을 지닐 때까지 총 9회 반복한다.
			// j는 i 값 하나당 총 0에서 i까지 반복한다.
			
			System.out.println();
		}
	}
}