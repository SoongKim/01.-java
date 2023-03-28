import java.util.Scanner;

public class ExecClass04_Pfver02 {
	
	// 일단 클래스 생성 간에는 데이터 타입을 void로 지정
	// return 값의 데이터 타입에 따라 추후 맞춰주면 된다.
	
	// 입력
	public double inputWeight() {
		System.out.println("몸무게를 입력해주세요(단위: kg)");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		double weight = Double.parseDouble(inputString);
		return weight;
	}
	public double inputHeight() {
		System.out.println("키를 입력해주세요(단위: cm)");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		double height = Double.parseDouble(inputString);
		height = height /(double)100;
		return height;
	}
	
	// 매 번 나눌 때는 양 쪽에 double로 캐스팅 해주자.
	// 굳이 발생 안 할 수 있는 문제를 사전에 해결해줄 수 있다.
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