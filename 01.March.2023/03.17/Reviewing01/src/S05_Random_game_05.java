import java.util.Random;
import java.util.Scanner;

public class S05_Random_game_05 {

	public static void main(String[] args) {
		System.out.println("랜덤숫자놀이게임");
		System.out.println("0~100사이의 숫자를 입력해주세요.");
		Scanner user = new Scanner(System.in);
		int userData = user.nextInt();
		System.out.println("입력:");

		if (userData >= 0 && userData <= 100) {

			Random addNum1 = new Random();
			int addNum01 = addNum1.nextInt(101);
			Random addNum2 = new Random();
			int addNum02 = addNum2.nextInt(101);
			Random addNum3 = new Random();
			int addNum03 = addNum3.nextInt(101);

			int userPlay = userData + addNum01;
			int comPlay = addNum02 + addNum03;

			if (userPlay > comPlay) {
				System.out.println("사용자 입력숫자는 " + userData + ", " + "사용자입력숫자+랜덤숫자" + "=" + userPlay + ", "
						+ "컴퓨터 입력숫자 + 랜덤숫자는 " + comPlay + ", " + "사용자의 승리입니다.");
			} else if (userPlay < comPlay) {
				System.out.println("사용자 입력숫자는 " + userData + ", " + "사용자입력숫자+랜덤숫자" + "=" + userPlay + ", "
						+ "컴퓨터 입력숫자 + 랜덤숫자는 " + comPlay + ", " + "컴퓨터의 승리입니다.");
			} else if (addNum02 == addNum03) {
				System.out.println("ERROR");
			}
		} else if (userData <= 0 || userData > 100) {
			System.out.println("0~100사이의 숫자가 아닙니다.");
		}
		user.close();
	}
}