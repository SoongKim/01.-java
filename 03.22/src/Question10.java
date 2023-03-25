import java.util.Arrays;
import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 사용자로부터 숫자를 입력받기 위해 스캐너 기능 호출

		int minNum = Integer.MAX_VALUE;
		int maxNum = Integer.MIN_VALUE;

		// minNum(최소값)은 컴퓨터가 인식할 수 있는 최대값.
		// maxNum(최대값)은 컴퓨터가 인식할 수 있는 최소값

		System.out.println("숫자를 일곱 개 입력해주세요.");
		int[] userNum = new int[7];
		//userNum이라는 새로운 7칸짜리 배열을 생성
		
		for (int i = 0; i < 7; i++) {
			userNum[i] = scanner.nextInt();
		}
		// userNum[i]값에 유저가 입력한 정수 데이터를 삽입
		
		for (int i = 0; i < 7; i++) {
			if (userNum[i] < minNum) {
				minNum = userNum[i];
			}
			if (userNum[i] > maxNum) {
				maxNum = userNum[i];
			}
		}
		// 만약 userNum[i] 값이 최소값보다 작다면(현재 인식 가능한 최대 값으로 설정되어 있음)
		// 새로운 최소값으로 userNum[i] 값을 인식하도록 반복문을 작성
		// 최대값도 이와 비슷한 매커니즘으로 더 큰 값을 최대값으로 인식하도록 반복문을 작성
		
		System.out.println("최대값 :" + maxNum);
		System.out.println("최소값 :" + minNum);
		scanner.close();
		// 새로 인식한 최소값과 최대값을 표출하고, 스캐너를 닫는다.
	}
}