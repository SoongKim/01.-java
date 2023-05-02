import java.util.Arrays;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 1~45 중의 숫자 중 6개를 랜덤하게 뽑는 프로그램을 작성하시오. 중복된 숫자를 제거하는 로직이 포함되어야 함.
		
		Random random = new Random();
		// 난수 생성기 호출
		int[] lotto = new int[6];
		// 정수 값을 지니는 6칸 배열 생성
		int lento = lotto.length;
		// lento : lotto 배열의 길이.
		for (int i = 0; i < lento; i++) {
			lotto[i] = (random.nextInt(45) + 1);
			// lotto[i] 의 값으로 (0~44) + 1의 값(1~45)을 array lotto의 0~5번 인덱스, 총 6칸에 저장
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					// 만약 lotto[i]와 //lotto[j]의 값이 같으면
					i--;
					// i 값을 하나 줄이고
					break;
					// 반복문을 탈출해 lotto[i]를 재설정.
					// 중복되는 값이 나오지 않을 때까지.
				}
			}
		}
		for (int i = 0; i < lento; i++) {
			for (int j = 0; j < lento; j++) {
				if (lotto[i] < lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		// Selection Sort를 사용한 오름차순 정렬.

		System.out.println("배열 출력");
		System.out.println(Arrays.toString(lotto));
		// 이후 오름차순 정렬된 로또 번호 여섯 개를 배열 형태로 출력.

		System.out.println();

		// 만약 숫자 정보만 출력하고 싶다면
		System.out.println("숫자 출력");
		for (int i = 0; i < lento; i++) {
			System.out.print(lotto[i] + "번 ");
		}
	}
}