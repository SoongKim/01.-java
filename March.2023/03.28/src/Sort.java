import java.util.Arrays;
import java.util.Random;

public class Sort {

	public void doSort() {
		int[] numbers = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		//이름은 numbers, 초기값이 0인 10칸짜리 배열이 만들어진다.
		
		int lenNum = numbers.length;
		
		// 1. Random값의 세팅
		Random random = new Random();
		for(int i = 0; i < lenNum; i++) {
			numbers[i] = (random.nextInt(100)+1);
		//	1에서 100까지의 값을 지니는 랜덤값을 배열 데이터로 삽입
		//	numbers[i] = (int)Math.floor(Math.random()*100)+1;
		//	요렇게도 난수 값을 저장할 수 있다.
		}
		System.out.println(Arrays.toString(numbers));
		// 난수로부터 발생한 데이터값을 배열에 담아 출력하였다.
		
		// 2. 정렬 알고리즘을 활용한 데이터 정렬(sort)
		
			// 2-1. Selection Sort
		
//		for(int i = 0; i < lenNum; i++) {
//			for(int j = i+1; j < lenNum; j++) {
//				if(numbers[i] > numbers[j]) {
//					int temp = numbers[i];
//					numbers[i] = numbers[j];
//					numbers[j] = temp;
//					//오름 차순 정렬 알고리즘
//				}
//			}
//		}
		for(int k = 0; k < lenNum; k++) {
			for(int y = k+1; y < lenNum; y++) {
				if(numbers[k] < numbers[y]) {
					int temp02 = numbers[k];
					numbers[k] = numbers[y];
					numbers[y] = temp02;
					// 내림 차순 정렬 알고리즘
				}
			}
		}
		
		// 변수는 선언한 중괄호 안에서만 사용 가능하다.
		// 해당 중괄호가 닫히면 적혀있지 않던 다른 곳에서는 사용 불가하다.
		
		// i > j 로 설정한다면 오름 차순으로,
		// i < j 로 설정한다면 내림 차순으로 정렬한다.
		
		// Arrays.sort(numbers);
		// 배열 정렬 기능을 호출하는 명령어. Arrays.sort
		
		System.out.println(Arrays.toString(numbers));
		// 정렬된 배열을 출력.
	}
}