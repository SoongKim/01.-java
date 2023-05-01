import java.util.Scanner;

public class S09_High_09 {

	public static void main(String[] args) {
		System.out.println("x: '숫자를 입력해주세요 : '");
		Scanner s = new Scanner(System.in);
		int usernum = s.nextInt();

		for (int i = 0; 3 * i <= usernum; i++) {
			System.out.println("입력하신 숫자 " + usernum + "를 3으로 나눈 값은 " + (usernum - 3 * i) + "입니다.");
		}
		s.close();
	}

}