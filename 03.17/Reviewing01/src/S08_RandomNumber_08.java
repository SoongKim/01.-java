import java.util.Random;
import java.util.Scanner;

public class S08_RandomNumber_08 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요.(0~100)");

		Scanner user = new Scanner(System.in);
		int userNum = user.nextInt();

		if (userNum <= 100 && userNum > 0) {

			Random oddEven = new Random();
			int evenOdd = oddEven.nextInt(9) + 1;
			int lastNum = userNum / evenOdd;

			if ((userNum / evenOdd) % 2 == 0) {
				System.out.println("당신의 숫자 " + userNum + "에서 임의의 값 " + evenOdd + "을 나눈 값은 " + lastNum + ", 짝수입니다.");
			} else {
				System.out.println("당신의 숫자 " + userNum + "에서 임의의 값 " + evenOdd + "을 나눈 값은 " + lastNum + ", 홀수입니다.");
			}
		} else if (userNum > 100 || userNum < 0) {
			System.out.println("숫자가 큽니다.");
		}
		user.close();
	}
}