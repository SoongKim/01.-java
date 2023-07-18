import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Hwang01 {

	public static void main(String[] args) {
		// 1-45 중 6개를 랜덤하게 뽑는 프로그램을 작성(중복 제거 로직 포함)

		Random random = new Random();
		int num = 6;
		Integer[] arr = new Integer[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(45) + 1;
			for (int j = 0; j < arr.length; j++) {
				if(i == 0) {
					continue;
				}
				else if (i != j && arr[i] == arr[j]) {
					i--;
				}
			}
		}
//		Arrays.sort(arr, Collections.reverseOrder());
//		System.out.println(Arrays.toString(arr));
//		역순 정렬 시
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
//		오름차순 정렬 시
	}
}