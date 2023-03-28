import java.util.Arrays;
import java.util.Random;

public class ExecClass00_Homework02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] numbers = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
		// 이렇게 배열을 선언하여도 2차 배열을 생성할 수 있다.
		// = int numbers[][] = new int[4][4];
		
		// 될 수 있으면 배열의 초기값은 잡아주자.(잡아줄 수 있으면)
		// 각 언어마다 사용하는 방법이 다른데,
		// 어떤 언어는 초기값 세팅이 되지 않으니까. 호환성 향상을 위해
		
		Random random = new Random();
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				numbers[i][j] = random.nextInt(100);
			}
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				numbers[i][3] = numbers[i][3] + numbers[i][j];
				numbers[3][j] = numbers[3][j] + numbers[i][j];
				numbers[3][3] = numbers[3][3] + numbers[i][j];
		// 2. 3행 / 3열 / 3행 3열/ 일 때의 값을 각 행/열의 합으로 출력하고 싶을 때
		// 위와 같은 형태로 작성할 수 있다.
			}
		}
		
		System.out.println("정렬 이전의 배열은 다음과 같습니다.");
		System.out.println(Arrays.deepToString(numbers));
		// 1. 정렬 이전의 난수 배열
		
		System.out.println();
		System.out.println("4X4 형태로 정렬된 배열은 다음과 같습니다.");
		System.out.println();
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers.length; j++) {
				System.out.printf("%5d", numbers[i][j]);
			}
			System.out.println();
			// printf의 기능. 무시무시한 놈이었다.
			// 이놈은 배열을 4 X 4 형태로 출력할 수 있는 놈이다.
			// 1 주 간의 노력이 개박살났다. 더러운 놈...
			// printf 기능 추가 학습 요망. 생각보다 오모시로이 한 놈이다.
			// printf의 %4d : 4는 자리수를 의미한다.
			// 데이터가 차지하는 자리 수를 말한다.
			// if. "%6d %03.1f", 출력 대상 데이터
			// : 6칸 잡아주고, 앞에 3.1 붙인 포맷으로 데이터 출력해!
		}
	}
}