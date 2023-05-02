
public class Cauf02 {

	public void counting(double weight, double height) {
		double ratio = weight / (height*height);
		
		if(ratio < 20) {
			System.out.printf("%.3f", ratio);
			System.out.print(", 저체중");
			if(ratio < 10) {
				System.out.print(", 소모증");
			}
			else if(ratio < 13) {
				System.out.print(", 영양 실조증");
			}
			else if(ratio < 15) {
				System.out.print(", 여윔");
			}
		}
		else if(ratio < 24) {
			System.out.printf("%.3f", ratio);
			System.out.print(", 정상");
			}
		else if(ratio < 29) {
			System.out.printf("%.3f", ratio);
			System.out.println(", 과체중");
			}
		else {
			System.out.printf("%.3f", ratio);
			System.out.print(", 비만");
			}	
	}
}