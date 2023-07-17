import java.util.Scanner;

public class D_dataStructure_ArrayAndList {

	public static void main(String[] args) {
		// 배열과 리스트. 같은 것 같지만 다른 점도 많다!
		// 01. 배열 :
		// 메모리의 연속 공간에 값이 채워져 있는 형태의 자료구조.
		// 인덱스를 통해 참조 가능. 선언한 자료형 값만 저장 가능하다.
		
		// 특징 :
		// 1. 인덱스를 사용하여 값에 바로 접근할 수 있다.
		// 2. 새로운 값을 삽입하거나 특정 인덱스 값을 삭제하기 어렵다.
		// 3. 배열 크기는 선언 간 지정하며, 변경이 불가능하다.
		// 4. 구조가 간단하여 코딩테스트 간 자주 애용한다.
		
		// 02. 리스트 :
		// 값과 포인터를 붂은 노드라는 것을 포인터로 연결한 자료 구조.
		
		// 특징 :
		// 1. 인덱스가 존재하지 않는다. 이에 값에 접근하는 속도가 느리다.
		// 2. 포인터로 연결되어 있으므로 삽입 / 삭제 간 연산 속도가 빠르다.
		// 3. 선언 간 크기를 별도 지정하지 않는다. 가변 데이터 취급 간 사용.
		// 4. 포인터를 저장할 공간이 필요하므로 배열보다 구조가 복잡하다.
		
		// 문제 001. 숫자의 합 구하기. 시간 제한 1초.
		// 내 코드 :
//		Scanner scanner = new Scanner(System.in);
//		int length = Integer.parseInt(scanner.next());
//		String targetNum = scanner.next();
//		
//		int answer = 0;
//		for(int i = 0; i < length; i++) {
//			answer += Integer.parseInt(targetNum.split("")[i]);
//		}
//		System.out.println(answer);
//		// 시간 복잡도 : int length
		
		// 답안 코드 :
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		String sNum = scanner.next();
		char[] cNum = sNum.toCharArray();
		int sum = 0;
		for(int i = 0; i < cNum.length; i++) {
			sum += cNum[i]-'0';
			// char이므로 ASCII 코드로 접근한다.
			// char '0'의 코드는 48
			// '1' ~ '9'의 코드는 '49' ~ 'XX' 이므로 -'0'(==48)을 해주면
			// 숫자 값이 남게 된다. 요걸 sum 변수에 더해준 것.
			// char가 아닌 String인 경우는 valueOf 함수를 사용한다.
		}
		System.out.println(sum);
	}
}