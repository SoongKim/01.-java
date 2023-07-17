
public class B_TimeComplexity {

	public static void main(String[] args) {
		
		// 시간 복잡도 예제 코드:
		int findNumber = (int)(Math.random() * 100);
		// Math.random()으로 생성한 0~1 사이의 난수에 100을 곱하고,
		// 이를 통해 만들어진 실수의 소수 부분을 잘라내어 정수로 만든다.
		// 이 과정을 통해 0~99 사이의 정수를 생성할 수 있다.
		
		for(int i = 0; i < 100; i++) {
			if(i == findNumber) {
				System.out.println("findNumber == " + i);
			}
		}
		// 0~99까지 N = 100이므로 시간 복잡도는 100
		// 코딩 테스트에서는 빅-오 표기법을 기준으로 수행 시간을 계산하라.
		// == 최악의 최악이 닥친 상황을 상정하고 수행 시간을 산정하라.
		
		// 연산 횟수 계산 방법 = 알고리즘 시간 복잡도 X 데이터의 크기
		// 상수는 시간 복잡도에서 제외, 가장 많이 중첩된 반복문의 수행 횟수가 복잡도 기준	
	}
}