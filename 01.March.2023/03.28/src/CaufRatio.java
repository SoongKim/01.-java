import java.util.Scanner;

public class CaufRatio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaufRatio caufRatio = new CaufRatio();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("카우프 지수 계산기입니다.");
		System.out.println();
		System.out.println("몸무게와 키를 차례로 입력해주세요.");
		System.out.println("몸무게는 kg, 키는 m 단위로 입력해주세요.");
		
		double userWeight = scanner.nextDouble();
		double userHeight = scanner.nextDouble();
		
		if(userHeight > 3) {
			userHeight = userHeight / 100;
		}
		
		caufRatio.counting(userWeight, userHeight);
		scanner.close();
	}
	
	public void counting(double weight, double height) {
		double ratio = weight / (height*height);
		
		if(ratio < 10) {
			System.out.printf("%.3f", ratio);
			System.out.print(" , 소모증");
		}
		else if(ratio < 13) {
			System.out.printf("%.3f", ratio);
			System.out.print(", 영양 실조증");
		}
		else if(ratio < 15) {
			System.out.printf("%.3f", ratio);
			System.out.print(", 여윔");
		}
		else if(ratio < 20) {
			System.out.printf("%.3f", ratio);
			System.out.print(", 저체중");
		}
		else if(ratio < 24) {
			System.out.printf("%.3f", ratio);
			System.out.println(", 정상");
		}
		else if(ratio < 29) {
			System.out.printf("%.3f", ratio);
			System.out.println(", 과체중");
		}
		else {
			System.out.printf("%.3f", ratio);
			System.out.println(", 비만");
		}
	}
}