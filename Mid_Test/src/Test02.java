import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
		// 스캐너 호출
		Scanner scanner = new Scanner(System.in);
		
		// 첫 번째로 입력 받은 정수를 대상 문자열 갯수로 인식
		int lineNum = scanner.nextInt();
		for(int i = 0; i < lineNum; i++) {
			// 정수 count 변수 선언
			int count = 0;
			// 스캐너로 입력 받은 문자열을 sol 변수에 저장
			String sol = scanner.next();
			// 대상 문자열을 "" 기준으로 잘라 배열에 넣고, 배열 내 값이 A와 동일한 경우 count를 1씩 증가
			String[] arr = new String[sol.length()];
			for(int j = 0; j < arr.length; j++) {
				arr[j] = sol.split("")[j];
				if(arr[j].equals("A")) {
					count++;
				}
			}
			// 문자열 내 A 판별이 한 번 끝날 때마다 대상 count 수를 출력.
			// 엔터 누르시면 모두 출력됩니다.
			System.out.println(count);
		}		
	}
}
