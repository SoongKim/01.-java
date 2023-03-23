import java.util.Arrays;
import java.util.Random;

public class Homework1Final {

	public static void main(String[] args) {
		Random random = new Random();

		int[] ranNum = new int[30];

		for (int i = 0; i < 30; i++) {
			ranNum[i] = random.nextInt(101);
			// 임의 지정 난수는 0~100의 값을 가집니다.
		}
		System.out.println("정렬 전 배열은 다음과 같습니다.");
		System.out.println(Arrays.toString(ranNum));
		// 배열의 출력 기능을 수행.
		for (int i = 0; i < 30; i++) {
			for (int j = 0; j < 30; j++) {
				if (ranNum[i] < ranNum[j]) {
					int numStand = ranNum[i];
					ranNum[i] = ranNum[j];
					ranNum[j] = numStand;
				}
			}
		}
		System.out.println("정렬 후 배열은 다음과 같습니다.");
		System.out.println(Arrays.toString(ranNum));
	}
}

// 2중 for 문과 i 문을 사용하여 오름 차순으로 정리하였습니다.
// i와 j를 30으로 설정하여 ranNum[i]와 ranNum[j]의 비교가 변수당 30 번씩, 도합 900번 발생합니다.
// 만약 비교 간 ranNum[i] 값이 ranNum[j]의 값보다 작다면
// 임시 변수 numStand에 ranNum[i] 값을 저장하고 ranNum[i] 값에 기존의 ranNum[j] 값을,
// ranNum[j]에는 numStand에 저장해뒀던 과거 ranNum[i] 값을 새로 덧씌웁니다.
// 이러한 변동이 누적되면 ranNum[0] 자리에는 비교 간 가장 작은 데이터가 위치하고,
// 마지막 자리에 가장 큰 값이 위치하도록 오름 차순으로 데이터 값의 정렬이 이뤄집니다.