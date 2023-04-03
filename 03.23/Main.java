import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();

		int[] ranNum = new int[20];
		// ranNum이라는 이름으로 새로운 20칸 배열 생성
		int lenNum = ranNum.length;
		// 해당 array의 길이.
		for (int i = 0; i < lenNum; i++) {
			ranNum[i] = random.nextInt(50);
		}
		// 49 한도로 난수 20 개 생성. ranNum array에 배치
		for (int i = 0; i < lenNum; i++) {
			for (int j = 0; j < lenNum; j++) {
				if (ranNum[i] > ranNum[j]) {
					int numStand = ranNum[i];
					ranNum[i] = ranNum[j];
					ranNum[j] = numStand;
				}
			}
		}
		// 내림차순 selection 정렬
		System.out.println("내림차순 정렬된 배열은 다음과 같습니다.");
		System.out.println(Arrays.toString(ranNum));
		// 정렬된 배열 출력
	}
}