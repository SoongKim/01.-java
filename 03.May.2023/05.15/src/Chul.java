import java.util.Scanner;

public class Chul {

	public static void main(String[] args) {
		// Exception. 예외처리

		// 예외의 종류
		// checked / unchecked exception.
		Scanner scanner = new Scanner(System.in);

		try {
			String inputString = scanner.nextLine();
			int a = Integer.parseInt(inputString);
			System.out.println(10 / a);
			// 발생 가능 에러 : a가 정수 전환 불가능한 문자열이거나, 0인 경우
		} catch (NumberFormatException e) {
			// NumberFormatException : 문자 포맷으로 변경할 수 없는 오류
			System.out.println("문자 입력 오류 발생");
			;
		} catch (Exception e) {
			// 이외의 오류. 0이 분모에 가는 등
			System.out.println("0 입력 오류 발생");
		} finally {
			System.out.println("정상실행");
			System.out.println("정상실행");
			System.out.println("정상실행");
			// 오류 처리 후 수행할 코드들.
		}

	}

}
