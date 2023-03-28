import java.util.Scanner;

public class Cauf01 {

	public static void main(String[] args) {
		Cauf02 cauf02 = new Cauf02();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("몸무게와 키를 차례로 입력해주세요.");
		System.out.println("몸무게는 kg, 키는 m 단위로 입력해주세요.");
				
		double userWeight = scanner.nextDouble();
		double userHeight = scanner.nextDouble();
		if(userHeight > 2) {
				userHeight = userHeight / 100;
				}
		
		cauf02.counting(userWeight, userHeight);
		scanner.close();
	}
}