import java.util.Scanner;

public class ExecClass04_Pfver03 {

	double weight = 0;
	double height = 0;
	//클래스에 들어간 변수는 아래 중괄호 내에서 계속 사용 가능하다.
	// 이를 Property 라고 한다.(객체가 가질 수 있는 값)
	public void inputVar(){
		System.out.println("몸무게를 입력해주세요(단위: kg)");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		weight = Double.parseDouble(inputString);
		
		System.out.println("키를 입력해주세요(단위: m)");
		inputString = scanner.nextLine();
		height = Double.parseDouble(inputString);
		height = height / (double)100;
	}
	public void calcKaup(double weight, double height){
		double result = (double)weight / (height * height);
		if(result > 30) {
			System.out.println("비만");
		}else if(result > 24) {
			System.out.println("과체중");
		}else if(result > 25) {
			System.out.println("정상");
		}else if(result > 13) {
			System.out.println("저체중");
		}else if(result > 10) {
			System.out.println("영양 실조증");
		}else {
			System.out.println("소모증");
		}
	}
}