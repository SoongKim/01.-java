import java.util.Scanner;

public class Cauf01 {

	public static void main(String[] args) {
		Cauf02 cauf02 = new Cauf02();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�����Կ� Ű�� ���ʷ� �Է����ּ���.");
		System.out.println("�����Դ� kg, Ű�� m ������ �Է����ּ���.");
				
		double userWeight = scanner.nextDouble();
		double userHeight = scanner.nextDouble();
		if(userHeight > 2) {
				userHeight = userHeight / 100;
				}
		
		cauf02.counting(userWeight, userHeight);
		scanner.close();
	}
}